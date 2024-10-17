package com.gogs.domain

import zio.json.{DeriveJsonCodec, JsonCodec}

import java.time.LocalDateTime

case class Issue(
  id: Int,
  name: String,
  repository: Repository,
  content: String = "",
  closed: Boolean = false,
  poster: Option[User] = None,
  assignee: Option[User] = None,
  createdAt: Option[LocalDateTime] = None,
  updatedAt: Option[LocalDateTime] = None,
  deadlineAt: Option[LocalDateTime] = None,
  milestone: Option[Milestone] = None
):

  override def toString: String =
    if id > 0
    then s"$name #$id"
    else name

object Issue:
  given codec: JsonCodec[Issue] = DeriveJsonCodec.gen[Issue]
