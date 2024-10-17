package com.gogs.infra.db

import com.gogs.model
import com.gogs.domain
import io.getquill.*
import io.getquill.jdbczio.Quill
import zio.prelude.OrdOps
import zio.{ZIO, ZLayer}
import io.scalaland.chimney.dsl._
import java.sql.SQLException
import java.time.LocalTime

class ProjectService(quill: Quill.Mysql[SnakeCase]):
  import quill.*

  extension (p: model.Project)
    def trans: domain.Project =
      p.into[domain.Project]
        .withFieldConst(_.creator, domain.User(p.id))
        .transform

  extension (p: domain.Project)
    def trans: model.Project =
      p.into[model.Project]
        .withFieldConst(_.creatorId, p.creator.id)
        .transform

  def findAllByUser(user: domain.User, active: Option[Boolean] = None): ZIO[Any, SQLException, List[domain.Project]] =
    val q = quote {
      query[model.Project]
        .join(query[model.ProjectUser])
        .on(_.id == _.projectId)
        .filter(_._2.userId == lift(user.id))
        .filter(_._1.active)
        .map(_._1)
    }
    run(q).map(_.map(_.trans))

  def findById(id: Int): ZIO[Any, SQLException, Option[domain.Project]] =
    run:
      quote(query[model.Project].filter(_.id == lift(id))).value
    .map(_.map(_.trans))

  def userAssociate(project: domain.Project, user: domain.User): ZIO[Any, SQLException, Unit] =
    val pu = model.ProjectUser(0, project.id, user.id, true)
    run(query[model.ProjectUser].insertValue(lift(pu)).returning(_.id))
      .filterOrFail(_ > 0) {
        SQLException("insert failure generate new id")
      }
      .unit

  def userToggle(project: domain.Project, user: domain.User, active: Boolean): ZIO[Any, SQLException, Unit] =
    run:
      query[model.ProjectUser]
        .filter(p => p.userId == lift(user.id) && p.projectId == lift(project.id))
        .update(_.active -> lift(active))
    .unit

  def create(project: domain.Project): ZIO[Any, SQLException, domain.Project] =
    val mproj = project.trans
    run:
      quote(query[model.Project].insertValue(lift(mproj)).returning(_.id))
    .filterOrFail(_ > 0) { SQLException("insert failure generate new id") }
      .map(insertID => project.copy(id = insertID))

object ProjectService:
  def list(user: domain.User, active: Option[Boolean] = None): ZIO[ProjectService, SQLException, List[domain.Project]] =
    ZIO.serviceWithZIO[ProjectService](_.findAllByUser(user, active))

  def findById(id: Int): ZIO[ProjectService, SQLException, Option[domain.Project]] =
    ZIO.serviceWithZIO[ProjectService](_.findById(id))

  def userAssociate(project: domain.Project, user: domain.User): ZIO[ProjectService, SQLException, Unit] =
    ZIO.serviceWithZIO[ProjectService](_.userAssociate(project, user))

  def userToggle(project: domain.Project, user: domain.User, active: Boolean): ZIO[ProjectService, SQLException, Unit] =
    ZIO.serviceWithZIO[ProjectService](_.userToggle(project, user, active))

  def create(project: domain.Project): ZIO[ProjectService, SQLException, domain.Project] =
    ZIO.serviceWithZIO[ProjectService](_.create(project))

  val live = ZLayer.fromFunction(new ProjectService(_))
