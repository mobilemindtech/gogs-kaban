package com.gogs

import com.gogs.AppProject.*
import com.gogs.infra.ValidationException
import com.gogs.infra.config.GogsConfigs
import com.gogs.infra.config.GogsConfigs.AppConfig
import com.gogs.infra.db.migrations.DBMigrations
import com.gogs.infra.db.migrations.DBMigrations.TMigration
import com.gogs.infra.db.{ProjectService, UserService}
import com.gogs.domain.{Project, User}
import io.getquill.SnakeCase
import io.getquill.jdbczio.Quill
import org.flywaydb.core.api.FlywayException
import zio.*
import zio.config.*
import zio.config.typesafe.*
import zio.test.*

import java.sql.SQLException

object AppProject:

  def dbMigrate: ZIO[TMigration, FlywayException | SQLException, Unit] =

    DBMigrations.dbReset().debug *> DBMigrations.migrate()

  def userCreate: ZIO[UserService, SQLException | ValidationException, User] =
    val user = User(
      login = "ricardo",
      password = "@123",
      name = "Ricardo",
      email = "ricardo@mobilemind.com.br",
      token = Some("abcd")
    )
    UserService.create(user)

  def projectCreate(user: User): ZIO[ProjectService, SQLException, Project] =
    val proj = Project(name = "proj a", creator = user)
    ProjectService.create(proj)

  def projectUserAssociate: ZIO[ProjectService & UserService, SQLException, Unit] =
    for
      user    <- UserService.findByUsername("ricardo")
      project <- ProjectService.findById(1)
      _       <- ProjectService.userAssociate(project.get, user.get)
    yield ()

  def findAllProjectsByUser: ZIO[ProjectService & UserService, SQLException, List[Project]] =
    for
      user     <- UserService.findByUsername("ricardo")
      projects <- ProjectService.list(user.get)
    yield projects

object AppProjectSpec extends ZIOSpecDefault:

  override val bootstrap: ZLayer[Any, Any, TestEnvironment] =
    Runtime
      .setConfigProvider(TypesafeConfigProvider.fromResourcePath())
      .and(testEnvironment)

  val testFindAllProjects =
    test("test find projects by user"):
      for
        _        <- dbMigrate
        user     <- userCreate
        _        <- projectCreate(user)
        _        <- projectUserAssociate
        projects <- findAllProjectsByUser
      yield assertTrue(projects.length == 1)

  override def spec = suite("AppProjectSpec")(testFindAllProjects).provide(
    logging.consoleLogger(),
    ProjectService.live,
    UserService.live,
    GogsConfigs.live,
    DBMigrations.live,
    Quill.Mysql.fromNamingStrategy(SnakeCase),
    Quill.DataSource.fromPrefix("appConfig.databaseConfig")
  )
