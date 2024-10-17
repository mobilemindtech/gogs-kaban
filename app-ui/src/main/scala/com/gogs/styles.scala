package com.gogs

import com.raquo.laminar.tags.HtmlTag
import io.styles.elem_
import org.scalajs.dom.HTMLElement

object styles:
  extension [A <: HTMLElement](el: HtmlTag[A])
    def `kaban-board` = elem_(el, "kaban-board")
    def `board-top` = elem_(el, "board-top")
    def `board-title` = elem_(el, "board-title")
    def `board-bottom` = elem_(el, "board-bottom")
    def `board-bottom-btn` = elem_(el, "board-bottom-btn")
    def `kaban-task` = elem_(el, "kaban-task")
    def `kaban-task-top` = elem_(el, "kaban-task-top")
    def `kaban-task-proj` = elem_(el, "kaban-task-proj")
    def `task-pin-point` = elem_(el, "task-pin-point")
    def `task-pin` = elem_(el, "task-pin")
    def `board-items-count` = elem_(el, "board-items-count")
    def `title-pin` = elem_(el, "title-pin")
    def `kaban-task-title` = elem_(el, "kaban-task-title")


