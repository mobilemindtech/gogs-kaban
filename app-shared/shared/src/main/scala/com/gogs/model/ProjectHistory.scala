package com.gogs.model

import java.time.LocalDateTime

/** link resource on comment. ex.: user#1 add issue#1 on this project
  * @param id
  * @param task
  * @param content
  * @param createdAt
  */
case class ProjectHistory(id: Int, projectId: Int, content: String, createdAt: LocalDateTime = LocalDateTime.now())
