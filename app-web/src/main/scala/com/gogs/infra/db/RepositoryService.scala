package com.gogs.infra.db

import com.gogs.model
import com.gogs.domain
import io.getquill.*
import io.getquill.jdbczio.Quill
import zio.prelude.OrdOps
import zio.{ZIO, ZLayer}
import io.scalaland.chimney.dsl._
import java.sql.SQLException

class RepositoryService(quill: Quill.Mysql[SnakeCase]):
  import quill.*
  def findById(id: Int): ZIO[Any, SQLException, Option[domain.Repository]] =
    run:
      query[model.Repository]
        .filter(_.id == lift(id))
        .value
    .map(_.map(_.transformInto[domain.Repository]))

  def save(repo: domain.Repository): ZIO[Any, SQLException, domain.Repository] =
    val mrepo = repo.transformInto[model.Repository]
    run:
      quote(query[model.Repository].insertValue(lift(mrepo)).returning(_.id))
    .filterOrFail(_ > 0) { SQLException("insert failure generate new id") }
      .map(insertID =>
        repo
          .copy(id = insertID)
          .transformInto[domain.Repository]
      )

object RepositoryService:
  def findById(id: Int): ZIO[RepositoryService, SQLException, Option[domain.Repository]] =
    ZIO.serviceWithZIO[RepositoryService](_.findById(id))

  def save(repo: domain.Repository): ZIO[RepositoryService, SQLException, domain.Repository] =
    ZIO.serviceWithZIO[RepositoryService](_.save(repo))

  val live = ZLayer.fromFunction(new RepositoryService(_))
