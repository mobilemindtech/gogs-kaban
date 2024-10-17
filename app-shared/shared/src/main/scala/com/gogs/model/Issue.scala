package com.gogs.model

import java.time.LocalDateTime

case class Issue(
  id: Int,
  name: String,
  repositoryId: Int,
  content: String = "",
  closed: Boolean = false,
  posterId: Option[Int] = None,
  assigneeId: Option[Int] = None,
  createdAt: Option[LocalDateTime] = None,
  updatedAt: Option[LocalDateTime] = None,
  deadlineAt: Option[LocalDateTime] = None,
  milestoneId: Option[Int] = None
):

  override def toString: String =
    if id > 0
    then s"$name #$id"
    else name
