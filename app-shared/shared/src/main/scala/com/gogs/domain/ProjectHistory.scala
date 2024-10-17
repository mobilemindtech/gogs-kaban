package com.gogs.domain

import zio.json.{DeriveJsonCodec, JsonCodec}

import java.time.LocalDateTime

/** link resource on comment. ex.: user#1 add issue#1 on this project
  * @param id
  * @param task
  * @param content
  * @param createdAt
  */
case class ProjectHistory(id: Int, project: Project, content: String, createdAt: LocalDateTime = LocalDateTime.now())

object ProjectHistory:
  given codec: JsonCodec[ProjectHistory] = DeriveJsonCodec.gen[ProjectHistory]
