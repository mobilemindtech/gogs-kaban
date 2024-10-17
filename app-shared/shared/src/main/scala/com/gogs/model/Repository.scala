package com.gogs.model

case class Repository(id: Int, name: String):

  override def toString: String =
    if id > 0
    then s"$name #$id"
    else name
