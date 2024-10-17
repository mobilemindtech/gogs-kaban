package com.gogs.infra.db

import com.gogs.model
import com.gogs.domain
import io.getquill.*
import io.getquill.jdbczio.Quill
import zio.{ZIO, ZLayer}
import io.scalaland.chimney.dsl._
import java.sql.SQLException

/*
class IssueService(quill: Quill.Mysql[SnakeCase]):
  import quill.*
  def findAllByRepository(repo: Repository): ZIO[Any, SQLException, List[Issue]] =
    run(quote(query[Issue].join(query[Repository]).on(_.id == _.id)).map(_._1))

object IssueService:
  def findAllByRepository(repo: Repository): ZIO[IssueService, SQLException, List[Issue]] =
    ZIO.serviceWithZIO[IssueService](_.findAllByRepository(repo))

  val live = ZLayer.fromFunction(new IssueService(_))
 */
