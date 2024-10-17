package com.gogs.domain

import zio.json.{DeriveJsonCodec, JsonCodec}

case class ProjectRepository(id: Int, project: Project, repository: Repository)

object ProjectRepository:
  given codec: JsonCodec[ProjectRepository] = DeriveJsonCodec.gen[ProjectRepository]
