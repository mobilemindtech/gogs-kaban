package com.gogs.domain

import zio.json.{DeriveJsonCodec, JsonCodec}

case class ProjectLabel(id: Int, project: Project, label: String, color: String)

object ProjectLabel:
  given codec: JsonCodec[ProjectLabel] = DeriveJsonCodec.gen[ProjectLabel]
