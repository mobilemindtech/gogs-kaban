package com.gogs.model

import java.time.LocalDateTime

case class ProjectUser(
  id: Int,
  projectId: Int,
  userId: Int,
  active: Boolean,
  createdAt: LocalDateTime = LocalDateTime.now(),
  updatedAt: LocalDateTime = LocalDateTime.now()
)
