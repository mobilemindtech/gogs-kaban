package com.gogs.domain

import zio.json.{DeriveJsonCodec, JsonCodec}

case class ProjectTaskLabel(task: ProjectTask, label: ProjectLabel)

object ProjectTaskLabel:
  given codec: JsonCodec[ProjectTaskLabel] = DeriveJsonCodec.gen[ProjectTaskLabel]
