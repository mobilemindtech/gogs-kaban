package com.gogs.domain

import zio.json.{DeriveJsonCodec, JsonCodec}

case class ProjectIssue (id: Int, project: Project, issue: Issue)

object ProjectIssue:
  given codec: JsonCodec[ProjectIssue] = DeriveJsonCodec.gen[ProjectIssue]
