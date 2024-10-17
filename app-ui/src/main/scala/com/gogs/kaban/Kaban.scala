package com.gogs.kaban

import com.gogs.api.{IssueApi, RepositoryApi}
import com.gogs.domain.*
import com.gogs.styles.*
import com.raquo.laminar.api.L.*
import com.raquo.laminar.modifiers.Modifier
import com.raquo.laminar.nodes.ReactiveHtmlElement
import io.styles.CustomReactiveElement
import io.styles.bootstrap.*
import io.styles.fontawesome.*
import org.scalajs.dom
import org.scalajs.dom.HTMLDivElement
import scala.concurrent.ExecutionContext
import scala.util.{Failure, Success}
given ec: ExecutionContext = ExecutionContext.global

object BSControls:
  def formControl(lbl: String)(modifiers: => CustomReactiveElement*): CustomReactiveElement =
    div.bs.`mb-3`(label.bs.`form-label`(lbl), modifiers)

  def inputFormControl(lbl: String, hint: String): CustomReactiveElement =
    formControl(lbl)(input.bs.`form-control`(placeholder(hint)))

  def selectFormControl(lbl: String)(options: Mod[HtmlElement]*): CustomReactiveElement =
    formControl(lbl)(select.bs.`form-select`(options))

object Kaban:

  import BSControls.*

  enum TaskViewState:
    case Opened, Closed

  val taskViewState = Var[TaskViewState](TaskViewState.Closed)
  val repos         = Var[List[Repository]](Nil)
  val issues        = Var[List[Issue]](Nil)
  val repository    = Var[Option[Repository]](None)

  def loadRepos =
    RepositoryApi.findAll.onComplete:
      case Success(data) => repos.update(_ => Repository(0, "select..") :: data)
      case Failure(ex)   => println(ex.getMessage)

  def loadIssues(repoId: String) =
    repos.now().find(_.id == repoId.toInt) match
      case Some(repo) =>
        if repo.id == 0
        then issues.update(_ => Nil)
        else
          IssueApi
            .findAll(repo)
            .onComplete:
              case Success(data) => issues.update(_ => Issue(0, "select..", repo) :: data)
              case Failure(ex)   => println(ex.getMessage)
      case _          =>
        println(s"repo $repoId not found")

  def taskViewToggle(ev: Any) =
    if taskViewState.now() == TaskViewState.Opened
    then taskViewState.update(_ => TaskViewState.Closed)
    else taskViewState.update(_ => TaskViewState.Opened)

  def board(title: String, pin: String, modifiers: => Modifier[ReactiveHtmlElement[dom.html.Element]]*) =
    div.bs.col(
      div.`kaban-board`(
        div.`board-top`(
          div.`board-title`(div.`title-pin`(cls(pin)), h4(title), span.`board-items-count`(modifiers.size))
        ),
        modifiers,
        div.`board-bottom`(div.`board-bottom-btn`(span("Add item", onClick --> taskViewToggle)))
      )
    )

  def task(proj: String, title: String) =
    div.`kaban-task`(
      div.`kaban-task-top`(
        div.`kaban-task-proj`(div.`task-pin`(div.`task-pin-point`()), span(proj)),
        span.fw.fa.`fa-angle-down`.empty
      ),
      p.`kaban-task-title`(span(title))
    )

  def taskView =
    div(
      cls <-- taskViewState.signal.map { state =>
        if state == TaskViewState.Opened
        then "task-view opened"
        else "task-view closed"
      },
      h4.bs.`text-center`("new task"),
      form(
        div.bs.row(
          div.bs.`col-8`(
            selectFormControl("Repository")(
              children <-- repos.signal.map(_.map(s => option(s.toString, value(s.id.toString)))),
              onChange.mapToValue --> loadIssues
            ),
            selectFormControl("Issue")(children <-- issues.signal.map(_.map(s => option(s.toString)))),
            formControl("Task description")(textArea.bs.`form-control`(rows(3), placeholder("task description..")))
          ),
          div.bs.col(
            div.bs.row(
              div.bs.`col-6`(inputFormControl("Estimate", "Enter a number")),
              div.bs.`col-6`.empty,
              div.bs.`col-6`(inputFormControl("Start date", "select date")),
              div.bs.`col-6`(inputFormControl("End date", "select date")),
              div.bs.`col-6`(inputFormControl("Size", "size")),
              div.bs.`col-6`(inputFormControl("Priority", "priority")),
              div.bs.`col-6`(p("Assigness"), p("Labels"), p("Milestone"))
            )
          )
        ),
        div.bs.row(
          div.bs.`col-6`(
            button.bs.btn.`btn-sm`.`btn-secondary`("Submit task"),
            button.bs.btn.`btn-link`(typ("button"), "Close", onClick --> taskViewToggle)
          )
        )
      )
    )

  def node =

    loadRepos

    div.bs.`container-fluid`(
      div.bs.row(
        cls("kaban"),
        board("Backlog", "backlog", task("repo a #2", "my task description")),
        board("Ready", "ready"),
        board("In Progress", "in-progress"),
        board("In Review", "in-review"),
        // board("Done", "done"),

        taskView
      )
    )
