package com.gogs.domain

import zio.json.{DeriveJsonCodec, JsonCodec}

case class Repository (id: Int, name: String):

  override def toString: String =
    if id > 0
    then s"$name #$id"
    else name

object Repository:
  given codec: JsonCodec[Repository] = DeriveJsonCodec.gen[Repository]
