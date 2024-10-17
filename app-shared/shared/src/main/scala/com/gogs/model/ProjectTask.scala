package com.gogs.model

import java.time.LocalDateTime

enum TaskState(val value: String):
  case Backlog    extends TaskState("backlog")
  case Ready      extends TaskState("ready")
  case InProgress extends TaskState("in_progress")
  case InReview   extends TaskState("in_review")
  case Done       extends TaskState("done")

enum TaskSize(val value: String):
  case XS extends TaskSize("xs")
  case S  extends TaskSize("s")
  case M  extends TaskSize("m")
  case L  extends TaskSize("l")
  case XL extends TaskSize("xl")

enum TaskPriority(val value: String):
  case P0 extends TaskPriority("p0")
  case P1 extends TaskPriority("p1")
  case P2 extends TaskPriority("p2")

case class ProjectTask(
  id: Int,
  name: String,
  content: String = "",
  projectId: Int,
  state: TaskState = TaskState.Backlog,
  size: Option[TaskSize] = None,
  priority: Option[TaskPriority] = None,
  estimate: Int = 0,
  startDate: Option[LocalDateTime] = None,
  endDate: Option[LocalDateTime] = None,
  branch: Option[String] = None,
  issueId: Option[Int] = None,
  closed: Boolean = false,
  createdAt: LocalDateTime = LocalDateTime.now(),
  updatedAt: LocalDateTime = LocalDateTime.now()
):

  override def toString: String =
    if id > 0
    then s"$name #$id"
    else name
