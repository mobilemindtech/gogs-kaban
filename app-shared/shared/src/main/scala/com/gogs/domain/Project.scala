package com.gogs.domain

import zio.json.{DeriveJsonCodec, JsonCodec}

import java.time.LocalDateTime

case class Project(
  id: Int = 0,
  name: String,
  content: String = "",
  creator: User,
  active: Boolean = true,
  restricted: Boolean = false,
  createdAt: LocalDateTime = LocalDateTime.now(),
  updatedAt: LocalDateTime = LocalDateTime.now(),
  lastChangeAt: Option[LocalDateTime] = None
)

object Project:
  given codec: JsonCodec[Project] = DeriveJsonCodec.gen[Project]
