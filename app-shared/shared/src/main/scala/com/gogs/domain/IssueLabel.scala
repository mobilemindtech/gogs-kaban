package com.gogs.domain

import zio.json.{DeriveJsonCodec, JsonCodec}

case class IssueLabel(id: Int, issue: Issue, label: String, color: String)

object IssueLabel:
  given codec: JsonCodec[IssueLabel] = DeriveJsonCodec.gen[IssueLabel]
