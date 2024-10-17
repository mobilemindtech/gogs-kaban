package com.gogs.model

import java.time.LocalDateTime

case class User(
  id: Int = 0,
  login: String,
  password: String,
  email: String,
  name: String,
  enabled: Boolean = true,
  token: Option[String] = None,
  createdAt: LocalDateTime = LocalDateTime.now(),
  updatedAt: LocalDateTime = LocalDateTime.now()
)
