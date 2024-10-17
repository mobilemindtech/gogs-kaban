package com.gogs.domain

import zio.json.{DeriveJsonCodec, JsonCodec}

import java.time.LocalDateTime

case class ProjectUser(
  id: Int,
  project: Project,
  user: User,
  active: Boolean,
  createdAt: LocalDateTime = LocalDateTime.now(),
  updatedAt: LocalDateTime = LocalDateTime.now()
)

object ProjectUser:
  given codec: JsonCodec[ProjectUser] = DeriveJsonCodec.gen[ProjectUser]
