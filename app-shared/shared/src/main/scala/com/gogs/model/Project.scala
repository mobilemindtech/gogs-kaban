package com.gogs.model

import java.time.LocalDateTime

case class Project(
  id: Int = 0,
  name: String,
  content: String = "",
  creatorId: Int,
  active: Boolean = true,
  restricted: Boolean = false,
  createdAt: LocalDateTime = LocalDateTime.now(),
  updatedAt: LocalDateTime = LocalDateTime.now(),
  lastChangeAt: Option[LocalDateTime] = None
)
