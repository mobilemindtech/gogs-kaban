package com.gogs.domain

import zio.json.{DeriveJsonCodec, JsonCodec}

case class Milestone (id: Int, name: String)

object Milestone:
  given codec: JsonCodec[Milestone] = DeriveJsonCodec.gen[Milestone]
