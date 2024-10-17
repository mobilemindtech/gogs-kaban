package com.gogs.infra.db.migrations

import com.gogs.infra.config.GogsConfigs.{AppConfig, DatabaseConfig, FlywayConfig}
import org.flywaydb.core.Flyway
import org.flywaydb.core.api.configuration.FluentConfiguration
import org.flywaydb.core.api.{FlywayException, Location}
import zio.{Task, ZIO, ZLayer}

import java.sql.{DriverManager, SQLException}
import scala.jdk.CollectionConverters.*
import scala.util.{Failure, Success, Try, Using}
import scala.util.chaining.scalaUtilChainingOps

class DBMigrations:

  extension [A](task: Task[A])
    def flywayExn = task.refineToOrDie[FlywayException]
    def sqlExn    = task.refineToOrDie[SQLException]

  def migrate(): ZIO[AppConfig, FlywayException, Unit] =
    for
      _         <- ZIO.logInfo("run migrations")
      appConfig <- ZIO.service[AppConfig]
      count     <- unsafeMigrate(appConfig.databaseConfig, appConfig.flyway)
      _         <- ZIO.logInfo(s"executed $count migrations")
    yield ()

  private def unsafeMigrate(
    databaseConfig: DatabaseConfig,
    flywayConfig: FlywayConfig
  ): ZIO[Any, FlywayException, Int] =
    val m = Flyway.configure
      .dataSource(databaseConfig.dataSource.url, databaseConfig.dataSource.user, databaseConfig.dataSource.password)
      .group(true)
      .outOfOrder(true)
      .table(flywayConfig.table)
      .locations(new Location(flywayConfig.location))
      .baselineOnMigrate(true)

    logValidationErrorsIfAny(m) *> ZIO.attempt(m.load().migrate().migrationsExecuted).flywayExn

  private def logValidationErrorsIfAny(m: FluentConfiguration): ZIO[Any, FlywayException, Unit] =
    ZIO
      .attempt(
        m.ignoreMigrationPatterns("*:pending")
          .load()
          .validateWithResult()
      )
      .flywayExn
      .flatMap: validated =>
        if (!validated.validationSuccessful)
          val msgs = validated.invalidMigrations.asScala.map { error =>
            s"""
                   |Failed validation:
                   |  - version: ${error.version}
                   |  - path: ${error.filepath}
                   |  - description: ${error.description}
                   |  - errorCode: ${error.errorDetails.errorCode}
                   |  - errorMessage: ${error.errorDetails.errorMessage}
                                """.stripMargin.strip
          }
          ZIO.fail(FlywayException(msgs.mkString("\n")))
        else ZIO.succeed(())

  def dbReset(): ZIO[AppConfig, SQLException, Unit] =
    for
      _         <- ZIO.logInfo("db reset")
      appConfig <- ZIO.service[AppConfig]
      _         <- ZIO.fromTry(dropAndCreateDatabase(appConfig)).sqlExn
    yield ()

  private def dropAndCreateDatabase(appConfig: AppConfig): Try[Unit] =
    Try(Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance()) match
      case Success(_)         =>
        Using(DriverManager.getConnection(appConfig.flyway.url, appConfig.flyway.user, appConfig.flyway.password)) {
          conn =>
            Using(conn.createStatement()) { stmt =>
              stmt.executeUpdate(s"drop database ${appConfig.flyway.database}")
              stmt.executeUpdate(s"create database ${appConfig.flyway.database}")
              conn.commit()
            }
        }
      case Failure(exception) => Failure(exception)

object DBMigrations:

  type TMigration = AppConfig & DBMigrations

  def migrate(): ZIO[TMigration, FlywayException, Unit] =
    ZIO.serviceWithZIO[DBMigrations](_.migrate())

  def dbReset(): ZIO[TMigration, SQLException, Unit] =
    ZIO.serviceWithZIO[DBMigrations](_.dbReset())

  val live = ZLayer.succeed(new DBMigrations)
