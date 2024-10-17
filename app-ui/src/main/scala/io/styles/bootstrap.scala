package io.styles

import com.raquo.laminar.api.L.*
import com.raquo.laminar.tags.HtmlTag
import org.scalajs.dom
import org.scalajs.dom.HTMLElement


object bootstrap:

  extension [A <: HTMLElement](el: HtmlTag[A])
    def bs = new BSElement(el)

  class BSElement[A <: HTMLElement](element: HtmlTag[A]) extends Style(element):

    type Class = BSElement[A]
    
    def container = add("container")

    def container(m: => CustomReactiveElement*) = build("container", m)

    def `container-fluid` = add("container-fluid")

    def `container-fluid`(m: => CustomReactiveElement*) = build("container-fluid", m)

    def `container-xxl` = add("container-xxl")

    def `container-xxl`(m: => CustomReactiveElement*) = build("container-xxl", m)

    def `container-xl` = add("container-xl")

    def `container-xl`(m: => CustomReactiveElement*) = build("container-xl", m)

    def `container-lg` = add("container-lg")

    def `container-lg`(m: => CustomReactiveElement*) = build("container-lg", m)

    def `container-md` = add("container-md")

    def `container-md`(m: => CustomReactiveElement*) = build("container-md", m)

    def `container-sm` = add("container-sm")

    def `container-sm`(m: => CustomReactiveElement*) = build("container-sm", m)

    def row = add("row")

    def row(m: => CustomReactiveElement*) = build("row", m)

    def col = add("col")

    def col(m: => CustomReactiveElement*) = build("col", m)

    def `row-cols-auto` = add("row-cols-auto")

    def `row-cols-auto`(m: => CustomReactiveElement*) = build("row-cols-auto", m)

    def `row-cols-1` = add("row-cols-1")

    def `row-cols-1`(m: => CustomReactiveElement*) = build("row-cols-1", m)

    def `row-cols-2` = add("row-cols-2")

    def `row-cols-2`(m: => CustomReactiveElement*) = build("row-cols-2", m)

    def `row-cols-3` = add("row-cols-3")

    def `row-cols-3`(m: => CustomReactiveElement*) = build("row-cols-3", m)

    def `row-cols-4` = add("row-cols-4")

    def `row-cols-4`(m: => CustomReactiveElement*) = build("row-cols-4", m)

    def `row-cols-5` = add("row-cols-5")

    def `row-cols-5`(m: => CustomReactiveElement*) = build("row-cols-5", m)

    def `row-cols-6` = add("row-cols-6")

    def `row-cols-6`(m: => CustomReactiveElement*) = build("row-cols-6", m)

    def `col-auto` = add("col-auto")

    def `col-auto`(m: => CustomReactiveElement*) = build("col-auto", m)

    def `col-1` = add("col-1")

    def `col-1`(m: => CustomReactiveElement*) = build("col-1", m)

    def `col-2` = add("col-2")

    def `col-2`(m: => CustomReactiveElement*) = build("col-2", m)

    def `col-3` = add("col-3")

    def `col-3`(m: => CustomReactiveElement*) = build("col-3", m)

    def `col-4` = add("col-4")

    def `col-4`(m: => CustomReactiveElement*) = build("col-4", m)

    def `col-5` = add("col-5")

    def `col-5`(m: => CustomReactiveElement*) = build("col-5", m)

    def `col-6` = add("col-6")

    def `col-6`(m: => CustomReactiveElement*) = build("col-6", m)

    def `col-7` = add("col-7")

    def `col-7`(m: => CustomReactiveElement*) = build("col-7", m)

    def `col-8` = add("col-8")

    def `col-8`(m: => CustomReactiveElement*) = build("col-8", m)

    def `col-9` = add("col-9")

    def `col-9`(m: => CustomReactiveElement*) = build("col-9", m)

    def `col-10` = add("col-10")

    def `col-10`(m: => CustomReactiveElement*) = build("col-10", m)

    def `col-11` = add("col-11")

    def `col-11`(m: => CustomReactiveElement*) = build("col-11", m)

    def `col-12` = add("col-12")

    def `col-12`(m: => CustomReactiveElement*) = build("col-12", m)

    def `offset-1` = add("offset-1")

    def `offset-1`(m: => CustomReactiveElement*) = build("offset-1", m)

    def `offset-2` = add("offset-2")

    def `offset-2`(m: => CustomReactiveElement*) = build("offset-2", m)

    def `offset-3` = add("offset-3")

    def `offset-3`(m: => CustomReactiveElement*) = build("offset-3", m)

    def `offset-4` = add("offset-4")

    def `offset-4`(m: => CustomReactiveElement*) = build("offset-4", m)

    def `offset-5` = add("offset-5")

    def `offset-5`(m: => CustomReactiveElement*) = build("offset-5", m)

    def `offset-6` = add("offset-6")

    def `offset-6`(m: => CustomReactiveElement*) = build("offset-6", m)

    def `offset-7` = add("offset-7")

    def `offset-7`(m: => CustomReactiveElement*) = build("offset-7", m)

    def `offset-8` = add("offset-8")

    def `offset-8`(m: => CustomReactiveElement*) = build("offset-8", m)

    def `offset-9` = add("offset-9")

    def `offset-9`(m: => CustomReactiveElement*) = build("offset-9", m)

    def `offset-10` = add("offset-10")

    def `offset-10`(m: => CustomReactiveElement*) = build("offset-10", m)

    def `offset-11` = add("offset-11")

    def `offset-11`(m: => CustomReactiveElement*) = build("offset-11", m)

    def `g-0` = add("g-0")

    def `g-0`(m: => CustomReactiveElement*) = build("g-0", m)

    def `gx-0` = add("gx-0")

    def `gx-0`(m: => CustomReactiveElement*) = build("gx-0", m)

    def `gy-0` = add("gy-0")

    def `gy-0`(m: => CustomReactiveElement*) = build("gy-0", m)

    def `g-1` = add("g-1")

    def `g-1`(m: => CustomReactiveElement*) = build("g-1", m)

    def `gx-1` = add("gx-1")

    def `gx-1`(m: => CustomReactiveElement*) = build("gx-1", m)

    def `gy-1` = add("gy-1")

    def `gy-1`(m: => CustomReactiveElement*) = build("gy-1", m)

    def `g-2` = add("g-2")

    def `g-2`(m: => CustomReactiveElement*) = build("g-2", m)

    def `gx-2` = add("gx-2")

    def `gx-2`(m: => CustomReactiveElement*) = build("gx-2", m)

    def `gy-2` = add("gy-2")

    def `gy-2`(m: => CustomReactiveElement*) = build("gy-2", m)

    def `g-3` = add("g-3")

    def `g-3`(m: => CustomReactiveElement*) = build("g-3", m)

    def `gx-3` = add("gx-3")

    def `gx-3`(m: => CustomReactiveElement*) = build("gx-3", m)

    def `gy-3` = add("gy-3")

    def `gy-3`(m: => CustomReactiveElement*) = build("gy-3", m)

    def `g-4` = add("g-4")

    def `g-4`(m: => CustomReactiveElement*) = build("g-4", m)

    def `gx-4` = add("gx-4")

    def `gx-4`(m: => CustomReactiveElement*) = build("gx-4", m)

    def `gy-4` = add("gy-4")

    def `gy-4`(m: => CustomReactiveElement*) = build("gy-4", m)

    def `g-5` = add("g-5")

    def `g-5`(m: => CustomReactiveElement*) = build("g-5", m)

    def `gx-5` = add("gx-5")

    def `gx-5`(m: => CustomReactiveElement*) = build("gx-5", m)

    def `gy-5` = add("gy-5")

    def `gy-5`(m: => CustomReactiveElement*) = build("gy-5", m)

    def `gx-sm-0` = add("gx-sm-0")

    def `gx-sm-0`(m: => CustomReactiveElement*) = build("gx-sm-0", m)

    def `gy-sm-0` = add("gy-sm-0")

    def `gy-sm-0`(m: => CustomReactiveElement*) = build("gy-sm-0", m)

    def `gx-sm-1` = add("gx-sm-1")

    def `gx-sm-1`(m: => CustomReactiveElement*) = build("gx-sm-1", m)

    def `gy-sm-1` = add("gy-sm-1")

    def `gy-sm-1`(m: => CustomReactiveElement*) = build("gy-sm-1", m)

    def `gx-sm-2` = add("gx-sm-2")

    def `gx-sm-2`(m: => CustomReactiveElement*) = build("gx-sm-2", m)

    def `gy-sm-2` = add("gy-sm-2")

    def `gy-sm-2`(m: => CustomReactiveElement*) = build("gy-sm-2", m)

    def `gx-sm-3` = add("gx-sm-3")

    def `gx-sm-3`(m: => CustomReactiveElement*) = build("gx-sm-3", m)

    def `gy-sm-3` = add("gy-sm-3")

    def `gy-sm-3`(m: => CustomReactiveElement*) = build("gy-sm-3", m)

    def `gx-sm-4` = add("gx-sm-4")

    def `gx-sm-4`(m: => CustomReactiveElement*) = build("gx-sm-4", m)

    def `gy-sm-4` = add("gy-sm-4")

    def `gy-sm-4`(m: => CustomReactiveElement*) = build("gy-sm-4", m)

    def `gx-sm-5` = add("gx-sm-5")

    def `gx-sm-5`(m: => CustomReactiveElement*) = build("gx-sm-5", m)

    def `gy-sm-5` = add("gy-sm-5")

    def `gy-sm-5`(m: => CustomReactiveElement*) = build("gy-sm-5", m)

    def `gx-md-0` = add("gx-md-0")

    def `gx-md-0`(m: => CustomReactiveElement*) = build("gx-md-0", m)

    def `gy-md-0` = add("gy-md-0")

    def `gy-md-0`(m: => CustomReactiveElement*) = build("gy-md-0", m)

    def `gx-md-1` = add("gx-md-1")

    def `gx-md-1`(m: => CustomReactiveElement*) = build("gx-md-1", m)

    def `gy-md-1` = add("gy-md-1")

    def `gy-md-1`(m: => CustomReactiveElement*) = build("gy-md-1", m)

    def `gx-md-2` = add("gx-md-2")

    def `gx-md-2`(m: => CustomReactiveElement*) = build("gx-md-2", m)

    def `gy-md-2` = add("gy-md-2")

    def `gy-md-2`(m: => CustomReactiveElement*) = build("gy-md-2", m)

    def `gx-md-3` = add("gx-md-3")

    def `gx-md-3`(m: => CustomReactiveElement*) = build("gx-md-3", m)

    def `gy-md-3` = add("gy-md-3")

    def `gy-md-3`(m: => CustomReactiveElement*) = build("gy-md-3", m)

    def `gx-md-4` = add("gx-md-4")

    def `gx-md-4`(m: => CustomReactiveElement*) = build("gx-md-4", m)

    def `gy-md-4` = add("gy-md-4")

    def `gy-md-4`(m: => CustomReactiveElement*) = build("gy-md-4", m)

    def `gx-md-5` = add("gx-md-5")

    def `gx-md-5`(m: => CustomReactiveElement*) = build("gx-md-5", m)

    def `gy-md-5` = add("gy-md-5")

    def `gy-md-5`(m: => CustomReactiveElement*) = build("gy-md-5", m)

    def `gx-lg-0` = add("gx-lg-0")

    def `gx-lg-0`(m: => CustomReactiveElement*) = build("gx-lg-0", m)

    def `gy-lg-0` = add("gy-lg-0")

    def `gy-lg-0`(m: => CustomReactiveElement*) = build("gy-lg-0", m)

    def `gx-lg-1` = add("gx-lg-1")

    def `gx-lg-1`(m: => CustomReactiveElement*) = build("gx-lg-1", m)

    def `gy-lg-1` = add("gy-lg-1")

    def `gy-lg-1`(m: => CustomReactiveElement*) = build("gy-lg-1", m)

    def `gx-lg-2` = add("gx-lg-2")

    def `gx-lg-2`(m: => CustomReactiveElement*) = build("gx-lg-2", m)

    def `gy-lg-2` = add("gy-lg-2")

    def `gy-lg-2`(m: => CustomReactiveElement*) = build("gy-lg-2", m)

    def `gx-lg-3` = add("gx-lg-3")

    def `gx-lg-3`(m: => CustomReactiveElement*) = build("gx-lg-3", m)

    def `gy-lg-3` = add("gy-lg-3")

    def `gy-lg-3`(m: => CustomReactiveElement*) = build("gy-lg-3", m)

    def `gx-lg-4` = add("gx-lg-4")

    def `gx-lg-4`(m: => CustomReactiveElement*) = build("gx-lg-4", m)

    def `gy-lg-4` = add("gy-lg-4")

    def `gy-lg-4`(m: => CustomReactiveElement*) = build("gy-lg-4", m)

    def `gx-lg-5` = add("gx-lg-5")

    def `gx-lg-5`(m: => CustomReactiveElement*) = build("gx-lg-5", m)

    def `gy-lg-5` = add("gy-lg-5")

    def `gy-lg-5`(m: => CustomReactiveElement*) = build("gy-lg-5", m)

    def `gx-xl-0` = add("gx-xl-0")

    def `gx-xl-0`(m: => CustomReactiveElement*) = build("gx-xl-0", m)

    def `gy-xl-0` = add("gy-xl-0")

    def `gy-xl-0`(m: => CustomReactiveElement*) = build("gy-xl-0", m)

    def `gx-xl-1` = add("gx-xl-1")

    def `gx-xl-1`(m: => CustomReactiveElement*) = build("gx-xl-1", m)

    def `gy-xl-1` = add("gy-xl-1")

    def `gy-xl-1`(m: => CustomReactiveElement*) = build("gy-xl-1", m)

    def `gx-xl-2` = add("gx-xl-2")

    def `gx-xl-2`(m: => CustomReactiveElement*) = build("gx-xl-2", m)

    def `gy-xl-2` = add("gy-xl-2")

    def `gy-xl-2`(m: => CustomReactiveElement*) = build("gy-xl-2", m)

    def `gx-xl-3` = add("gx-xl-3")

    def `gx-xl-3`(m: => CustomReactiveElement*) = build("gx-xl-3", m)

    def `gy-xl-3` = add("gy-xl-3")

    def `gy-xl-3`(m: => CustomReactiveElement*) = build("gy-xl-3", m)

    def `gx-xl-4` = add("gx-xl-4")

    def `gx-xl-4`(m: => CustomReactiveElement*) = build("gx-xl-4", m)

    def `gy-xl-4` = add("gy-xl-4")

    def `gy-xl-4`(m: => CustomReactiveElement*) = build("gy-xl-4", m)

    def `gx-xl-5` = add("gx-xl-5")

    def `gx-xl-5`(m: => CustomReactiveElement*) = build("gx-xl-5", m)

    def `gy-xl-5` = add("gy-xl-5")

    def `gy-xl-5`(m: => CustomReactiveElement*) = build("gy-xl-5", m)

    def `gx-xxl-0` = add("gx-xxl-0")

    def `gx-xxl-0`(m: => CustomReactiveElement*) = build("gx-xxl-0", m)

    def `gy-xxl-0` = add("gy-xxl-0")

    def `gy-xxl-0`(m: => CustomReactiveElement*) = build("gy-xxl-0", m)

    def `gx-xxl-1` = add("gx-xxl-1")

    def `gx-xxl-1`(m: => CustomReactiveElement*) = build("gx-xxl-1", m)

    def `gy-xxl-1` = add("gy-xxl-1")

    def `gy-xxl-1`(m: => CustomReactiveElement*) = build("gy-xxl-1", m)

    def `gx-xxl-2` = add("gx-xxl-2")

    def `gx-xxl-2`(m: => CustomReactiveElement*) = build("gx-xxl-2", m)

    def `gy-xxl-2` = add("gy-xxl-2")

    def `gy-xxl-2`(m: => CustomReactiveElement*) = build("gy-xxl-2", m)

    def `gx-xxl-3` = add("gx-xxl-3")

    def `gx-xxl-3`(m: => CustomReactiveElement*) = build("gx-xxl-3", m)

    def `gy-xxl-3` = add("gy-xxl-3")

    def `gy-xxl-3`(m: => CustomReactiveElement*) = build("gy-xxl-3", m)

    def `gx-xxl-4` = add("gx-xxl-4")

    def `gx-xxl-4`(m: => CustomReactiveElement*) = build("gx-xxl-4", m)

    def `gy-xxl-4` = add("gy-xxl-4")

    def `gy-xxl-4`(m: => CustomReactiveElement*) = build("gy-xxl-4", m)

    def `gx-xxl-5` = add("gx-xxl-5")

    def `gx-xxl-5`(m: => CustomReactiveElement*) = build("gx-xxl-5", m)

    def `gy-xxl-5` = add("gy-xxl-5")

    def `gy-xxl-5`(m: => CustomReactiveElement*) = build("gy-xxl-5", m)

    def `d-inline` = add("d-inline")

    def `d-inline`(m: => CustomReactiveElement*) = build("d-inline", m)

    def `d-inline-block` = add("d-inline-block")

    def `d-inline-block`(m: => CustomReactiveElement*) = build("d-inline-block", m)

    def `d-block` = add("d-block")

    def `d-block`(m: => CustomReactiveElement*) = build("d-block", m)

    def `d-grid` = add("d-grid")

    def `d-grid`(m: => CustomReactiveElement*) = build("d-grid", m)

    def `d-table` = add("d-table")

    def `d-table`(m: => CustomReactiveElement*) = build("d-table", m)

    def `d-table-row` = add("d-table-row")

    def `d-table-row`(m: => CustomReactiveElement*) = build("d-table-row", m)

    def `d-table-cell` = add("d-table-cell")

    def `d-table-cell`(m: => CustomReactiveElement*) = build("d-table-cell", m)

    def `d-flex` = add("d-flex")

    def `d-flex`(m: => CustomReactiveElement*) = build("d-flex", m)

    def `d-inline-flex` = add("d-inline-flex")

    def `d-inline-flex`(m: => CustomReactiveElement*) = build("d-inline-flex", m)

    def `d-none` = add("d-none")

    def `d-none`(m: => CustomReactiveElement*) = build("d-none", m)

    def `flex-fill` = add("flex-fill")

    def `flex-fill`(m: => CustomReactiveElement*) = build("flex-fill", m)

    def `flex-row` = add("flex-row")

    def `flex-row`(m: => CustomReactiveElement*) = build("flex-row", m)

    def `flex-column` = add("flex-column")

    def `flex-column`(m: => CustomReactiveElement*) = build("flex-column", m)

    def `flex-row-reverse` = add("flex-row-reverse")

    def `flex-row-reverse`(m: => CustomReactiveElement*) = build("flex-row-reverse", m)

    def `flex-column-reverse` = add("flex-column-reverse")

    def `flex-column-reverse`(m: => CustomReactiveElement*) = build("flex-column-reverse", m)

    def `flex-grow-0` = add("flex-grow-0")

    def `flex-grow-0`(m: => CustomReactiveElement*) = build("flex-grow-0", m)

    def `flex-grow-1` = add("flex-grow-1")

    def `flex-grow-1`(m: => CustomReactiveElement*) = build("flex-grow-1", m)

    def `flex-shrink-0` = add("flex-shrink-0")

    def `flex-shrink-0`(m: => CustomReactiveElement*) = build("flex-shrink-0", m)

    def `flex-shrink-1` = add("flex-shrink-1")

    def `flex-shrink-1`(m: => CustomReactiveElement*) = build("flex-shrink-1", m)

    def `flex-wrap` = add("flex-wrap")

    def `flex-wrap`(m: => CustomReactiveElement*) = build("flex-wrap", m)

    def `flex-nowrap` = add("flex-nowrap")

    def `flex-nowrap`(m: => CustomReactiveElement*) = build("flex-nowrap", m)

    def `flex-wrap-reverse` = add("flex-wrap-reverse")

    def `flex-wrap-reverse`(m: => CustomReactiveElement*) = build("flex-wrap-reverse", m)

    def `justify-content-start` = add("justify-content-start")

    def `justify-content-start`(m: => CustomReactiveElement*) = build("justify-content-start", m)

    def `justify-content-end` = add("justify-content-end")

    def `justify-content-end`(m: => CustomReactiveElement*) = build("justify-content-end", m)

    def `justify-content-center` = add("justify-content-center")

    def `justify-content-center`(m: => CustomReactiveElement*) = build("justify-content-center", m)

    def `justify-content-between` = add("justify-content-between")

    def `justify-content-between`(m: => CustomReactiveElement*) = build("justify-content-between", m)

    def `justify-content-around` = add("justify-content-around")

    def `justify-content-around`(m: => CustomReactiveElement*) = build("justify-content-around", m)

    def `justify-content-evenly` = add("justify-content-evenly")

    def `justify-content-evenly`(m: => CustomReactiveElement*) = build("justify-content-evenly", m)

    def `align-items-start` = add("align-items-start")

    def `align-items-start`(m: => CustomReactiveElement*) = build("align-items-start", m)

    def `align-items-end` = add("align-items-end")

    def `align-items-end`(m: => CustomReactiveElement*) = build("align-items-end", m)

    def `align-items-center` = add("align-items-center")

    def `align-items-center`(m: => CustomReactiveElement*) = build("align-items-center", m)

    def `align-items-baseline` = add("align-items-baseline")

    def `align-items-baseline`(m: => CustomReactiveElement*) = build("align-items-baseline", m)

    def `align-items-stretch` = add("align-items-stretch")

    def `align-items-stretch`(m: => CustomReactiveElement*) = build("align-items-stretch", m)

    def `align-content-start` = add("align-content-start")

    def `align-content-start`(m: => CustomReactiveElement*) = build("align-content-start", m)

    def `align-content-end` = add("align-content-end")

    def `align-content-end`(m: => CustomReactiveElement*) = build("align-content-end", m)

    def `align-content-center` = add("align-content-center")

    def `align-content-center`(m: => CustomReactiveElement*) = build("align-content-center", m)

    def `align-content-between` = add("align-content-between")

    def `align-content-between`(m: => CustomReactiveElement*) = build("align-content-between", m)

    def `align-content-around` = add("align-content-around")

    def `align-content-around`(m: => CustomReactiveElement*) = build("align-content-around", m)

    def `align-content-stretch` = add("align-content-stretch")

    def `align-content-stretch`(m: => CustomReactiveElement*) = build("align-content-stretch", m)

    def `align-self-auto` = add("align-self-auto")

    def `align-self-auto`(m: => CustomReactiveElement*) = build("align-self-auto", m)

    def `align-self-start` = add("align-self-start")

    def `align-self-start`(m: => CustomReactiveElement*) = build("align-self-start", m)

    def `align-self-end` = add("align-self-end")

    def `align-self-end`(m: => CustomReactiveElement*) = build("align-self-end", m)

    def `align-self-center` = add("align-self-center")

    def `align-self-center`(m: => CustomReactiveElement*) = build("align-self-center", m)

    def `align-self-baseline` = add("align-self-baseline")

    def `align-self-baseline`(m: => CustomReactiveElement*) = build("align-self-baseline", m)

    def `align-self-stretch` = add("align-self-stretch")

    def `align-self-stretch`(m: => CustomReactiveElement*) = build("align-self-stretch", m)

    def `order-first` = add("order-first")

    def `order-first`(m: => CustomReactiveElement*) = build("order-first", m)

    def `order-0` = add("order-0")

    def `order-0`(m: => CustomReactiveElement*) = build("order-0", m)

    def `order-1` = add("order-1")

    def `order-1`(m: => CustomReactiveElement*) = build("order-1", m)

    def `order-2` = add("order-2")

    def `order-2`(m: => CustomReactiveElement*) = build("order-2", m)

    def `order-3` = add("order-3")

    def `order-3`(m: => CustomReactiveElement*) = build("order-3", m)

    def `order-4` = add("order-4")

    def `order-4`(m: => CustomReactiveElement*) = build("order-4", m)

    def `order-5` = add("order-5")

    def `order-5`(m: => CustomReactiveElement*) = build("order-5", m)

    def `order-last` = add("order-last")

    def `order-last`(m: => CustomReactiveElement*) = build("order-last", m)

    def `m-0` = add("m-0")

    def `m-0`(m: => CustomReactiveElement*) = build("m-0", m)

    def `m-1` = add("m-1")

    def `m-1`(m: => CustomReactiveElement*) = build("m-1", m)

    def `m-2` = add("m-2")

    def `m-2`(m: => CustomReactiveElement*) = build("m-2", m)

    def `m-3` = add("m-3")

    def `m-3`(m: => CustomReactiveElement*) = build("m-3", m)

    def `m-4` = add("m-4")

    def `m-4`(m: => CustomReactiveElement*) = build("m-4", m)

    def `m-5` = add("m-5")

    def `m-5`(m: => CustomReactiveElement*) = build("m-5", m)

    def `m-auto` = add("m-auto")

    def `m-auto`(m: => CustomReactiveElement*) = build("m-auto", m)

    def `mx-0` = add("mx-0")

    def `mx-0`(m: => CustomReactiveElement*) = build("mx-0", m)

    def `mx-1` = add("mx-1")

    def `mx-1`(m: => CustomReactiveElement*) = build("mx-1", m)

    def `mx-2` = add("mx-2")

    def `mx-2`(m: => CustomReactiveElement*) = build("mx-2", m)

    def `mx-3` = add("mx-3")

    def `mx-3`(m: => CustomReactiveElement*) = build("mx-3", m)

    def `mx-4` = add("mx-4")

    def `mx-4`(m: => CustomReactiveElement*) = build("mx-4", m)

    def `mx-5` = add("mx-5")

    def `mx-5`(m: => CustomReactiveElement*) = build("mx-5", m)

    def `mx-auto` = add("mx-auto")

    def `mx-auto`(m: => CustomReactiveElement*) = build("mx-auto", m)

    def `my-0` = add("my-0")

    def `my-0`(m: => CustomReactiveElement*) = build("my-0", m)

    def `my-1` = add("my-1")

    def `my-1`(m: => CustomReactiveElement*) = build("my-1", m)

    def `my-2` = add("my-2")

    def `my-2`(m: => CustomReactiveElement*) = build("my-2", m)

    def `my-3` = add("my-3")

    def `my-3`(m: => CustomReactiveElement*) = build("my-3", m)

    def `my-4` = add("my-4")

    def `my-4`(m: => CustomReactiveElement*) = build("my-4", m)

    def `my-5` = add("my-5")

    def `my-5`(m: => CustomReactiveElement*) = build("my-5", m)

    def `my-auto` = add("my-auto")

    def `my-auto`(m: => CustomReactiveElement*) = build("my-auto", m)

    def `mt-0` = add("mt-0")

    def `mt-0`(m: => CustomReactiveElement*) = build("mt-0", m)

    def `mt-1` = add("mt-1")

    def `mt-1`(m: => CustomReactiveElement*) = build("mt-1", m)

    def `mt-2` = add("mt-2")

    def `mt-2`(m: => CustomReactiveElement*) = build("mt-2", m)

    def `mt-3` = add("mt-3")

    def `mt-3`(m: => CustomReactiveElement*) = build("mt-3", m)

    def `mt-4` = add("mt-4")

    def `mt-4`(m: => CustomReactiveElement*) = build("mt-4", m)

    def `mt-5` = add("mt-5")

    def `mt-5`(m: => CustomReactiveElement*) = build("mt-5", m)

    def `mt-auto` = add("mt-auto")

    def `mt-auto`(m: => CustomReactiveElement*) = build("mt-auto", m)

    def `me-0` = add("me-0")

    def `me-0`(m: => CustomReactiveElement*) = build("me-0", m)

    def `me-1` = add("me-1")

    def `me-1`(m: => CustomReactiveElement*) = build("me-1", m)

    def `me-2` = add("me-2")

    def `me-2`(m: => CustomReactiveElement*) = build("me-2", m)

    def `me-3` = add("me-3")

    def `me-3`(m: => CustomReactiveElement*) = build("me-3", m)

    def `me-4` = add("me-4")

    def `me-4`(m: => CustomReactiveElement*) = build("me-4", m)

    def `me-5` = add("me-5")

    def `me-5`(m: => CustomReactiveElement*) = build("me-5", m)

    def `me-auto` = add("me-auto")

    def `me-auto`(m: => CustomReactiveElement*) = build("me-auto", m)

    def `mb-0` = add("mb-0")

    def `mb-0`(m: => CustomReactiveElement*) = build("mb-0", m)

    def `mb-1` = add("mb-1")

    def `mb-1`(m: => CustomReactiveElement*) = build("mb-1", m)

    def `mb-2` = add("mb-2")

    def `mb-2`(m: => CustomReactiveElement*) = build("mb-2", m)

    def `mb-3` = add("mb-3")

    def `mb-3`(m: => CustomReactiveElement*) = build("mb-3", m)

    def `mb-4` = add("mb-4")

    def `mb-4`(m: => CustomReactiveElement*) = build("mb-4", m)

    def `mb-5` = add("mb-5")

    def `mb-5`(m: => CustomReactiveElement*) = build("mb-5", m)

    def `mb-auto` = add("mb-auto")

    def `mb-auto`(m: => CustomReactiveElement*) = build("mb-auto", m)

    def `ms-0` = add("ms-0")

    def `ms-0`(m: => CustomReactiveElement*) = build("ms-0", m)

    def `ms-1` = add("ms-1")

    def `ms-1`(m: => CustomReactiveElement*) = build("ms-1", m)

    def `ms-2` = add("ms-2")

    def `ms-2`(m: => CustomReactiveElement*) = build("ms-2", m)

    def `ms-3` = add("ms-3")

    def `ms-3`(m: => CustomReactiveElement*) = build("ms-3", m)

    def `ms-4` = add("ms-4")

    def `ms-4`(m: => CustomReactiveElement*) = build("ms-4", m)

    def `ms-5` = add("ms-5")

    def `ms-5`(m: => CustomReactiveElement*) = build("ms-5", m)

    def `ms-auto` = add("ms-auto")

    def `ms-auto`(m: => CustomReactiveElement*) = build("ms-auto", m)

    def `p-0` = add("p-0")

    def `p-0`(m: => CustomReactiveElement*) = build("p-0", m)

    def `p-1` = add("p-1")

    def `p-1`(m: => CustomReactiveElement*) = build("p-1", m)

    def `p-2` = add("p-2")

    def `p-2`(m: => CustomReactiveElement*) = build("p-2", m)

    def `p-3` = add("p-3")

    def `p-3`(m: => CustomReactiveElement*) = build("p-3", m)

    def `p-4` = add("p-4")

    def `p-4`(m: => CustomReactiveElement*) = build("p-4", m)

    def `p-5` = add("p-5")

    def `p-5`(m: => CustomReactiveElement*) = build("p-5", m)

    def `px-0` = add("px-0")

    def `px-0`(m: => CustomReactiveElement*) = build("px-0", m)

    def `px-1` = add("px-1")

    def `px-1`(m: => CustomReactiveElement*) = build("px-1", m)

    def `px-2` = add("px-2")

    def `px-2`(m: => CustomReactiveElement*) = build("px-2", m)

    def `px-3` = add("px-3")

    def `px-3`(m: => CustomReactiveElement*) = build("px-3", m)

    def `px-4` = add("px-4")

    def `px-4`(m: => CustomReactiveElement*) = build("px-4", m)

    def `px-5` = add("px-5")

    def `px-5`(m: => CustomReactiveElement*) = build("px-5", m)

    def `py-0` = add("py-0")

    def `py-0`(m: => CustomReactiveElement*) = build("py-0", m)

    def `py-1` = add("py-1")

    def `py-1`(m: => CustomReactiveElement*) = build("py-1", m)

    def `py-2` = add("py-2")

    def `py-2`(m: => CustomReactiveElement*) = build("py-2", m)

    def `py-3` = add("py-3")

    def `py-3`(m: => CustomReactiveElement*) = build("py-3", m)

    def `py-4` = add("py-4")

    def `py-4`(m: => CustomReactiveElement*) = build("py-4", m)

    def `py-5` = add("py-5")

    def `py-5`(m: => CustomReactiveElement*) = build("py-5", m)

    def `pt-0` = add("pt-0")

    def `pt-0`(m: => CustomReactiveElement*) = build("pt-0", m)

    def `pt-1` = add("pt-1")

    def `pt-1`(m: => CustomReactiveElement*) = build("pt-1", m)

    def `pt-2` = add("pt-2")

    def `pt-2`(m: => CustomReactiveElement*) = build("pt-2", m)

    def `pt-3` = add("pt-3")

    def `pt-3`(m: => CustomReactiveElement*) = build("pt-3", m)

    def `pt-4` = add("pt-4")

    def `pt-4`(m: => CustomReactiveElement*) = build("pt-4", m)

    def `pt-5` = add("pt-5")

    def `pt-5`(m: => CustomReactiveElement*) = build("pt-5", m)

    def `pe-0` = add("pe-0")

    def `pe-0`(m: => CustomReactiveElement*) = build("pe-0", m)

    def `pe-1` = add("pe-1")

    def `pe-1`(m: => CustomReactiveElement*) = build("pe-1", m)

    def `pe-2` = add("pe-2")

    def `pe-2`(m: => CustomReactiveElement*) = build("pe-2", m)

    def `pe-3` = add("pe-3")

    def `pe-3`(m: => CustomReactiveElement*) = build("pe-3", m)

    def `pe-4` = add("pe-4")

    def `pe-4`(m: => CustomReactiveElement*) = build("pe-4", m)

    def `pe-5` = add("pe-5")

    def `pe-5`(m: => CustomReactiveElement*) = build("pe-5", m)

    def `pb-0` = add("pb-0")

    def `pb-0`(m: => CustomReactiveElement*) = build("pb-0", m)

    def `pb-1` = add("pb-1")

    def `pb-1`(m: => CustomReactiveElement*) = build("pb-1", m)

    def `pb-2` = add("pb-2")

    def `pb-2`(m: => CustomReactiveElement*) = build("pb-2", m)

    def `pb-3` = add("pb-3")

    def `pb-3`(m: => CustomReactiveElement*) = build("pb-3", m)

    def `pb-4` = add("pb-4")

    def `pb-4`(m: => CustomReactiveElement*) = build("pb-4", m)

    def `pb-5` = add("pb-5")

    def `pb-5`(m: => CustomReactiveElement*) = build("pb-5", m)

    def `ps-0` = add("ps-0")

    def `ps-0`(m: => CustomReactiveElement*) = build("ps-0", m)

    def `ps-1` = add("ps-1")

    def `ps-1`(m: => CustomReactiveElement*) = build("ps-1", m)

    def `ps-2` = add("ps-2")

    def `ps-2`(m: => CustomReactiveElement*) = build("ps-2", m)

    def `ps-3` = add("ps-3")

    def `ps-3`(m: => CustomReactiveElement*) = build("ps-3", m)

    def `ps-4` = add("ps-4")

    def `ps-4`(m: => CustomReactiveElement*) = build("ps-4", m)

    def `ps-5` = add("ps-5")

    def `ps-5`(m: => CustomReactiveElement*) = build("ps-5", m)

    def clearfix = add("clearfix")

    def clearfix(m: => CustomReactiveElement*) = build("clearfix", m)

    def `link-primary` = add("link-primary")

    def `link-primary`(m: => CustomReactiveElement*) = build("link-primary", m)

    def `link-secondary` = add("link-secondary")

    def `link-secondary`(m: => CustomReactiveElement*) = build("link-secondary", m)

    def `link-success` = add("link-success")

    def `link-success`(m: => CustomReactiveElement*) = build("link-success", m)

    def `link-info` = add("link-info")

    def `link-info`(m: => CustomReactiveElement*) = build("link-info", m)

    def `link-warning` = add("link-warning")

    def `link-warning`(m: => CustomReactiveElement*) = build("link-warning", m)

    def `link-danger` = add("link-danger")

    def `link-danger`(m: => CustomReactiveElement*) = build("link-danger", m)

    def `link-light` = add("link-light")

    def `link-light`(m: => CustomReactiveElement*) = build("link-light", m)

    def `link-dark` = add("link-dark")

    def `link-dark`(m: => CustomReactiveElement*) = build("link-dark", m)

    def ratio = add("ratio")

    def ratio(m: => CustomReactiveElement*) = build("ratio", m)

    def `ratio-1x1` = add("ratio-1x1")

    def `ratio-1x1`(m: => CustomReactiveElement*) = build("ratio-1x1", m)

    def `ratio-4x3` = add("ratio-4x3")

    def `ratio-4x3`(m: => CustomReactiveElement*) = build("ratio-4x3", m)

    def `ratio-16x9` = add("ratio-16x9")

    def `ratio-16x9`(m: => CustomReactiveElement*) = build("ratio-16x9", m)

    def `ratio-21x9` = add("ratio-21x9")

    def `ratio-21x9`(m: => CustomReactiveElement*) = build("ratio-21x9", m)

    def `fixed-top` = add("fixed-top")

    def `fixed-top`(m: => CustomReactiveElement*) = build("fixed-top", m)

    def `fixed-bottom` = add("fixed-bottom")

    def `fixed-bottom`(m: => CustomReactiveElement*) = build("fixed-bottom", m)

    def `sticky-top` = add("sticky-top")

    def `sticky-top`(m: => CustomReactiveElement*) = build("sticky-top", m)

    def `visually-hidden` = add("visually-hidden")

    def `visually-hidden`(m: => CustomReactiveElement*) = build("visually-hidden", m)

    def `visually-hidden-focusable` = add("visually-hidden-focusable")

    def `visually-hidden-focusable`(m: => CustomReactiveElement*) = build("visually-hidden-focusable", m)

    def `stretched-link` = add("stretched-link")

    def `stretched-link`(m: => CustomReactiveElement*) = build("stretched-link", m)

    def `text-truncate` = add("text-truncate")

    def `text-truncate`(m: => CustomReactiveElement*) = build("text-truncate", m)

    def `align-baseline` = add("align-baseline")

    def `align-baseline`(m: => CustomReactiveElement*) = build("align-baseline", m)

    def `align-top` = add("align-top")

    def `align-top`(m: => CustomReactiveElement*) = build("align-top", m)

    def `align-middle` = add("align-middle")

    def `align-middle`(m: => CustomReactiveElement*) = build("align-middle", m)

    def `align-bottom` = add("align-bottom")

    def `align-bottom`(m: => CustomReactiveElement*) = build("align-bottom", m)

    def `align-text-bottom` = add("align-text-bottom")

    def `align-text-bottom`(m: => CustomReactiveElement*) = build("align-text-bottom", m)

    def `align-text-top` = add("align-text-top")

    def `align-text-top`(m: => CustomReactiveElement*) = build("align-text-top", m)

    def `float-start` = add("float-start")

    def `float-start`(m: => CustomReactiveElement*) = build("float-start", m)

    def `float-end` = add("float-end")

    def `float-end`(m: => CustomReactiveElement*) = build("float-end", m)

    def `float-none` = add("float-none")

    def `float-none`(m: => CustomReactiveElement*) = build("float-none", m)

    def `overflow-auto` = add("overflow-auto")

    def `overflow-auto`(m: => CustomReactiveElement*) = build("overflow-auto", m)

    def `overflow-hidden` = add("overflow-hidden")

    def `overflow-hidden`(m: => CustomReactiveElement*) = build("overflow-hidden", m)

    def `overflow-visible` = add("overflow-visible")

    def `overflow-visible`(m: => CustomReactiveElement*) = build("overflow-visible", m)

    def `overflow-scroll` = add("overflow-scroll")

    def `overflow-scroll`(m: => CustomReactiveElement*) = build("overflow-scroll", m)

    def shadow = add("shadow")

    def shadow(m: => CustomReactiveElement*) = build("shadow", m)

    def `shadow-sm` = add("shadow-sm")

    def `shadow-sm`(m: => CustomReactiveElement*) = build("shadow-sm", m)

    def `shadow-lg` = add("shadow-lg")

    def `shadow-lg`(m: => CustomReactiveElement*) = build("shadow-lg", m)

    def `shadow-none` = add("shadow-none")

    def `shadow-none`(m: => CustomReactiveElement*) = build("shadow-none", m)

    def `position-static` = add("position-static")

    def `position-static`(m: => CustomReactiveElement*) = build("position-static", m)

    def `position-relative` = add("position-relative")

    def `position-relative`(m: => CustomReactiveElement*) = build("position-relative", m)

    def `position-absolute` = add("position-absolute")

    def `position-absolute`(m: => CustomReactiveElement*) = build("position-absolute", m)

    def `position-fixed` = add("position-fixed")

    def `position-fixed`(m: => CustomReactiveElement*) = build("position-fixed", m)

    def `position-sticky` = add("position-sticky")

    def `position-sticky`(m: => CustomReactiveElement*) = build("position-sticky", m)

    def `top-0` = add("top-0")

    def `top-0`(m: => CustomReactiveElement*) = build("top-0", m)

    def `top-50` = add("top-50")

    def `top-50`(m: => CustomReactiveElement*) = build("top-50", m)

    def `top-100` = add("top-100")

    def `top-100`(m: => CustomReactiveElement*) = build("top-100", m)

    def `bottom-0` = add("bottom-0")

    def `bottom-0`(m: => CustomReactiveElement*) = build("bottom-0", m)

    def `bottom-50` = add("bottom-50")

    def `bottom-50`(m: => CustomReactiveElement*) = build("bottom-50", m)

    def `bottom-100` = add("bottom-100")

    def `bottom-100`(m: => CustomReactiveElement*) = build("bottom-100", m)

    def `start-0` = add("start-0")

    def `start-0`(m: => CustomReactiveElement*) = build("start-0", m)

    def `start-50` = add("start-50")

    def `start-50`(m: => CustomReactiveElement*) = build("start-50", m)

    def `start-100` = add("start-100")

    def `start-100`(m: => CustomReactiveElement*) = build("start-100", m)

    def `end-0` = add("end-0")

    def `end-0`(m: => CustomReactiveElement*) = build("end-0", m)

    def `end-50` = add("end-50")

    def `end-50`(m: => CustomReactiveElement*) = build("end-50", m)

    def `end-100` = add("end-100")

    def `end-100`(m: => CustomReactiveElement*) = build("end-100", m)

    def `translate-middle` = add("translate-middle")

    def `translate-middle`(m: => CustomReactiveElement*) = build("translate-middle", m)

    def `translate-middle-x` = add("translate-middle-x")

    def `translate-middle-x`(m: => CustomReactiveElement*) = build("translate-middle-x", m)

    def `translate-middle-y` = add("translate-middle-y")

    def `translate-middle-y`(m: => CustomReactiveElement*) = build("translate-middle-y", m)

    def border = add("border")

    def border(m: => CustomReactiveElement*) = build("border", m)

    def `border-0` = add("border-0")

    def `border-0`(m: => CustomReactiveElement*) = build("border-0", m)

    def `border-top` = add("border-top")

    def `border-top`(m: => CustomReactiveElement*) = build("border-top", m)

    def `border-top-0` = add("border-top-0")

    def `border-top-0`(m: => CustomReactiveElement*) = build("border-top-0", m)

    def `border-end` = add("border-end")

    def `border-end`(m: => CustomReactiveElement*) = build("border-end", m)

    def `border-end-0` = add("border-end-0")

    def `border-end-0`(m: => CustomReactiveElement*) = build("border-end-0", m)

    def `border-bottom` = add("border-bottom")

    def `border-bottom`(m: => CustomReactiveElement*) = build("border-bottom", m)

    def `border-bottom-0` = add("border-bottom-0")

    def `border-bottom-0`(m: => CustomReactiveElement*) = build("border-bottom-0", m)

    def `border-start` = add("border-start")

    def `border-start`(m: => CustomReactiveElement*) = build("border-start", m)

    def `border-start-0` = add("border-start-0")

    def `border-start-0`(m: => CustomReactiveElement*) = build("border-start-0", m)

    def `border-primary` = add("border-primary")

    def `border-primary`(m: => CustomReactiveElement*) = build("border-primary", m)

    def `border-secondary` = add("border-secondary")

    def `border-secondary`(m: => CustomReactiveElement*) = build("border-secondary", m)

    def `border-success` = add("border-success")

    def `border-success`(m: => CustomReactiveElement*) = build("border-success", m)

    def `border-info` = add("border-info")

    def `border-info`(m: => CustomReactiveElement*) = build("border-info", m)

    def `border-warning` = add("border-warning")

    def `border-warning`(m: => CustomReactiveElement*) = build("border-warning", m)

    def `border-danger` = add("border-danger")

    def `border-danger`(m: => CustomReactiveElement*) = build("border-danger", m)

    def `border-light` = add("border-light")

    def `border-light`(m: => CustomReactiveElement*) = build("border-light", m)

    def `border-dark` = add("border-dark")

    def `border-dark`(m: => CustomReactiveElement*) = build("border-dark", m)

    def `border-white` = add("border-white")

    def `border-white`(m: => CustomReactiveElement*) = build("border-white", m)

    def `border-1` = add("border-1")

    def `border-1`(m: => CustomReactiveElement*) = build("border-1", m)

    def `border-2` = add("border-2")

    def `border-2`(m: => CustomReactiveElement*) = build("border-2", m)

    def `border-3` = add("border-3")

    def `border-3`(m: => CustomReactiveElement*) = build("border-3", m)

    def `border-4` = add("border-4")

    def `border-4`(m: => CustomReactiveElement*) = build("border-4", m)

    def `border-5` = add("border-5")

    def `border-5`(m: => CustomReactiveElement*) = build("border-5", m)

    def `w-25` = add("w-25")

    def `w-25`(m: => CustomReactiveElement*) = build("w-25", m)

    def `w-50` = add("w-50")

    def `w-50`(m: => CustomReactiveElement*) = build("w-50", m)

    def `w-75` = add("w-75")

    def `w-75`(m: => CustomReactiveElement*) = build("w-75", m)

    def `w-100` = add("w-100")

    def `w-100`(m: => CustomReactiveElement*) = build("w-100", m)

    def `w-auto` = add("w-auto")

    def `w-auto`(m: => CustomReactiveElement*) = build("w-auto", m)

    def `mw-100` = add("mw-100")

    def `mw-100`(m: => CustomReactiveElement*) = build("mw-100", m)

    def `vw-100` = add("vw-100")

    def `vw-100`(m: => CustomReactiveElement*) = build("vw-100", m)

    def `min-vw-100` = add("min-vw-100")

    def `min-vw-100`(m: => CustomReactiveElement*) = build("min-vw-100", m)

    def `h-25` = add("h-25")

    def `h-25`(m: => CustomReactiveElement*) = build("h-25", m)

    def `h-50` = add("h-50")

    def `h-50`(m: => CustomReactiveElement*) = build("h-50", m)

    def `h-75` = add("h-75")

    def `h-75`(m: => CustomReactiveElement*) = build("h-75", m)

    def `h-100` = add("h-100")

    def `h-100`(m: => CustomReactiveElement*) = build("h-100", m)

    def `h-auto` = add("h-auto")

    def `h-auto`(m: => CustomReactiveElement*) = build("h-auto", m)

    def `mh-100` = add("mh-100")

    def `mh-100`(m: => CustomReactiveElement*) = build("mh-100", m)

    def `vh-100` = add("vh-100")

    def `vh-100`(m: => CustomReactiveElement*) = build("vh-100", m)

    def `min-vh-100` = add("min-vh-100")

    def `min-vh-100`(m: => CustomReactiveElement*) = build("min-vh-100", m)

    def `gap-0` = add("gap-0")

    def `gap-0`(m: => CustomReactiveElement*) = build("gap-0", m)

    def `gap-1` = add("gap-1")

    def `gap-1`(m: => CustomReactiveElement*) = build("gap-1", m)

    def `gap-2` = add("gap-2")

    def `gap-2`(m: => CustomReactiveElement*) = build("gap-2", m)

    def `gap-3` = add("gap-3")

    def `gap-3`(m: => CustomReactiveElement*) = build("gap-3", m)

    def `gap-4` = add("gap-4")

    def `gap-4`(m: => CustomReactiveElement*) = build("gap-4", m)

    def `gap-5` = add("gap-5")

    def `gap-5`(m: => CustomReactiveElement*) = build("gap-5", m)

    def `font-monospace` = add("font-monospace")

    def `font-monospace`(m: => CustomReactiveElement*) = build("font-monospace", m)

    def `fs-1` = add("fs-1")

    def `fs-1`(m: => CustomReactiveElement*) = build("fs-1", m)

    def `fs-2` = add("fs-2")

    def `fs-2`(m: => CustomReactiveElement*) = build("fs-2", m)

    def `fs-3` = add("fs-3")

    def `fs-3`(m: => CustomReactiveElement*) = build("fs-3", m)

    def `fs-4` = add("fs-4")

    def `fs-4`(m: => CustomReactiveElement*) = build("fs-4", m)

    def `fs-5` = add("fs-5")

    def `fs-5`(m: => CustomReactiveElement*) = build("fs-5", m)

    def `fs-6` = add("fs-6")

    def `fs-6`(m: => CustomReactiveElement*) = build("fs-6", m)

    def `fst-italic` = add("fst-italic")

    def `fst-italic`(m: => CustomReactiveElement*) = build("fst-italic", m)

    def `fst-normal` = add("fst-normal")

    def `fst-normal`(m: => CustomReactiveElement*) = build("fst-normal", m)

    def `fw-light` = add("fw-light")

    def `fw-light`(m: => CustomReactiveElement*) = build("fw-light", m)

    def `fw-lighter` = add("fw-lighter")

    def `fw-lighter`(m: => CustomReactiveElement*) = build("fw-lighter", m)

    def `fw-normal` = add("fw-normal")

    def `fw-normal`(m: => CustomReactiveElement*) = build("fw-normal", m)

    def `fw-bold` = add("fw-bold")

    def `fw-bold`(m: => CustomReactiveElement*) = build("fw-bold", m)

    def `fw-bolder` = add("fw-bolder")

    def `fw-bolder`(m: => CustomReactiveElement*) = build("fw-bolder", m)

    def `lh-1` = add("lh-1")

    def `lh-1`(m: => CustomReactiveElement*) = build("lh-1", m)

    def `lh-sm` = add("lh-sm")

    def `lh-sm`(m: => CustomReactiveElement*) = build("lh-sm", m)

    def `lh-base` = add("lh-base")

    def `lh-base`(m: => CustomReactiveElement*) = build("lh-base", m)

    def `lh-lg` = add("lh-lg")

    def `lh-lg`(m: => CustomReactiveElement*) = build("lh-lg", m)

    def `text-start` = add("text-start")

    def `text-start`(m: => CustomReactiveElement*) = build("text-start", m)

    def `text-end` = add("text-end")

    def `text-end`(m: => CustomReactiveElement*) = build("text-end", m)

    def `text-center` = add("text-center")

    def `text-center`(m: => CustomReactiveElement*) = build("text-center", m)

    def `text-decoration-none` = add("text-decoration-none")

    def `text-decoration-none`(m: => CustomReactiveElement*) = build("text-decoration-none", m)

    def `text-decoration-underline` = add("text-decoration-underline")

    def `text-decoration-underline`(m: => CustomReactiveElement*) = build("text-decoration-underline", m)

    def `text-decoration-line-through` = add("text-decoration-line-through")

    def `text-decoration-line-through`(m: => CustomReactiveElement*) = build("text-decoration-line-through", m)

    def `text-lowercase` = add("text-lowercase")

    def `text-lowercase`(m: => CustomReactiveElement*) = build("text-lowercase", m)

    def `text-uppercase` = add("text-uppercase")

    def `text-uppercase`(m: => CustomReactiveElement*) = build("text-uppercase", m)

    def `text-capitalize` = add("text-capitalize")

    def `text-capitalize`(m: => CustomReactiveElement*) = build("text-capitalize", m)

    def `text-wrap` = add("text-wrap")

    def `text-wrap`(m: => CustomReactiveElement*) = build("text-wrap", m)

    def `text-nowrap` = add("text-nowrap")

    def `text-nowrap`(m: => CustomReactiveElement*) = build("text-nowrap", m)

    def `text-primary` = add("text-primary")

    def `text-primary`(m: => CustomReactiveElement*) = build("text-primary", m)

    def `text-secondary` = add("text-secondary")

    def `text-secondary`(m: => CustomReactiveElement*) = build("text-secondary", m)

    def `text-success` = add("text-success")

    def `text-success`(m: => CustomReactiveElement*) = build("text-success", m)

    def `text-info` = add("text-info")

    def `text-info`(m: => CustomReactiveElement*) = build("text-info", m)

    def `text-warning` = add("text-warning")

    def `text-warning`(m: => CustomReactiveElement*) = build("text-warning", m)

    def `text-danger` = add("text-danger")

    def `text-danger`(m: => CustomReactiveElement*) = build("text-danger", m)

    def `text-light` = add("text-light")

    def `text-light`(m: => CustomReactiveElement*) = build("text-light", m)

    def `text-dark` = add("text-dark")

    def `text-dark`(m: => CustomReactiveElement*) = build("text-dark", m)

    def `text-white` = add("text-white")

    def `text-white`(m: => CustomReactiveElement*) = build("text-white", m)

    def `text-body` = add("text-body")

    def `text-body`(m: => CustomReactiveElement*) = build("text-body", m)

    def `text-muted` = add("text-muted")

    def `text-muted`(m: => CustomReactiveElement*) = build("text-muted", m)

    def `text-black-50` = add("text-black-50")

    def `text-black-50`(m: => CustomReactiveElement*) = build("text-black-50", m)

    def `text-white-50` = add("text-white-50")

    def `text-white-50`(m: => CustomReactiveElement*) = build("text-white-50", m)

    def `text-reset` = add("text-reset")

    def `text-reset`(m: => CustomReactiveElement*) = build("text-reset", m)

    def `bg-primary` = add("bg-primary")

    def `bg-primary`(m: => CustomReactiveElement*) = build("bg-primary", m)

    def `bg-secondary` = add("bg-secondary")

    def `bg-secondary`(m: => CustomReactiveElement*) = build("bg-secondary", m)

    def `bg-success` = add("bg-success")

    def `bg-success`(m: => CustomReactiveElement*) = build("bg-success", m)

    def `bg-info` = add("bg-info")

    def `bg-info`(m: => CustomReactiveElement*) = build("bg-info", m)

    def `bg-warning` = add("bg-warning")

    def `bg-warning`(m: => CustomReactiveElement*) = build("bg-warning", m)

    def `bg-danger` = add("bg-danger")

    def `bg-danger`(m: => CustomReactiveElement*) = build("bg-danger", m)

    def `bg-light` = add("bg-light")

    def `bg-light`(m: => CustomReactiveElement*) = build("bg-light", m)

    def `bg-dark` = add("bg-dark")

    def `bg-dark`(m: => CustomReactiveElement*) = build("bg-dark", m)

    def `bg-body` = add("bg-body")

    def `bg-body`(m: => CustomReactiveElement*) = build("bg-body", m)

    def `bg-white` = add("bg-white")

    def `bg-white`(m: => CustomReactiveElement*) = build("bg-white", m)

    def `bg-transparent` = add("bg-transparent")

    def `bg-transparent`(m: => CustomReactiveElement*) = build("bg-transparent", m)

    def `bg-gradient` = add("bg-gradient")

    def `bg-gradient`(m: => CustomReactiveElement*) = build("bg-gradient", m)

    def `user-select-all` = add("user-select-all")

    def `user-select-all`(m: => CustomReactiveElement*) = build("user-select-all", m)

    def `user-select-auto` = add("user-select-auto")

    def `user-select-auto`(m: => CustomReactiveElement*) = build("user-select-auto", m)

    def `user-select-none` = add("user-select-none")

    def `user-select-none`(m: => CustomReactiveElement*) = build("user-select-none", m)

    def `pe-none` = add("pe-none")

    def `pe-none`(m: => CustomReactiveElement*) = build("pe-none", m)

    def `pe-auto` = add("pe-auto")

    def `pe-auto`(m: => CustomReactiveElement*) = build("pe-auto", m)

    def rounded = add("rounded")

    def rounded(m: => CustomReactiveElement*) = build("rounded", m)

    def `rounded-0` = add("rounded-0")

    def `rounded-0`(m: => CustomReactiveElement*) = build("rounded-0", m)

    def `rounded-1` = add("rounded-1")

    def `rounded-1`(m: => CustomReactiveElement*) = build("rounded-1", m)

    def `rounded-2` = add("rounded-2")

    def `rounded-2`(m: => CustomReactiveElement*) = build("rounded-2", m)

    def `rounded-3` = add("rounded-3")

    def `rounded-3`(m: => CustomReactiveElement*) = build("rounded-3", m)

    def `rounded-circle` = add("rounded-circle")

    def `rounded-circle`(m: => CustomReactiveElement*) = build("rounded-circle", m)

    def `rounded-pill` = add("rounded-pill")

    def `rounded-pill`(m: => CustomReactiveElement*) = build("rounded-pill", m)

    def `rounded-top` = add("rounded-top")

    def `rounded-top`(m: => CustomReactiveElement*) = build("rounded-top", m)

    def `rounded-end` = add("rounded-end")

    def `rounded-end`(m: => CustomReactiveElement*) = build("rounded-end", m)

    def `rounded-bottom` = add("rounded-bottom")

    def `rounded-bottom`(m: => CustomReactiveElement*) = build("rounded-bottom", m)

    def `rounded-start` = add("rounded-start")

    def `rounded-start`(m: => CustomReactiveElement*) = build("rounded-start", m)

    def visible = add("visible")

    def visible(m: => CustomReactiveElement*) = build("visible", m)

    def invisible = add("invisible")

    def invisible(m: => CustomReactiveElement*) = build("invisible", m)

    def lead = add("lead")

    def lead(m: => CustomReactiveElement*) = build("lead", m)

    def `display-1` = add("display-1")

    def `display-1`(m: => CustomReactiveElement*) = build("display-1", m)

    def `display-2` = add("display-2")

    def `display-2`(m: => CustomReactiveElement*) = build("display-2", m)

    def `display-3` = add("display-3")

    def `display-3`(m: => CustomReactiveElement*) = build("display-3", m)

    def `display-4` = add("display-4")

    def `display-4`(m: => CustomReactiveElement*) = build("display-4", m)

    def `display-5` = add("display-5")

    def `display-5`(m: => CustomReactiveElement*) = build("display-5", m)

    def `display-6` = add("display-6")

    def `display-6`(m: => CustomReactiveElement*) = build("display-6", m)

    def `list-unstyled` = add("list-unstyled")

    def `list-unstyled`(m: => CustomReactiveElement*) = build("list-unstyled", m)

    def `list-inline` = add("list-inline")

    def `list-inline`(m: => CustomReactiveElement*) = build("list-inline", m)

    def `list-inline-item` = add("list-inline-item")

    def `list-inline-item`(m: => CustomReactiveElement*) = build("list-inline-item", m)

    def initialism = add("initialism")

    def initialism(m: => CustomReactiveElement*) = build("initialism", m)

    def blockquote = add("blockquote")

    def blockquote(m: => CustomReactiveElement*) = build("blockquote", m)

    def `blockquote-footer` = add("blockquote-footer")

    def `blockquote-footer`(m: => CustomReactiveElement*) = build("blockquote-footer", m)

    def `img-fluid` = add("img-fluid")

    def `img-fluid`(m: => CustomReactiveElement*) = build("img-fluid", m)

    def `img-thumbnail` = add("img-thumbnail")

    def `img-thumbnail`(m: => CustomReactiveElement*) = build("img-thumbnail", m)

    def figure = add("figure")

    def figure(m: => CustomReactiveElement*) = build("figure", m)

    def `figure-img` = add("figure-img")

    def `figure-img`(m: => CustomReactiveElement*) = build("figure-img", m)

    def `figure-caption` = add("figure-caption")

    def `figure-caption`(m: => CustomReactiveElement*) = build("figure-caption", m)

    def table = add("table")

    def table(m: => CustomReactiveElement*) = build("table", m)

    def `caption-top` = add("caption-top")

    def `caption-top`(m: => CustomReactiveElement*) = build("caption-top", m)

    def `table-sm` = add("table-sm")

    def `table-sm`(m: => CustomReactiveElement*) = build("table-sm", m)

    def `table-bordered` = add("table-bordered")

    def `table-bordered`(m: => CustomReactiveElement*) = build("table-bordered", m)

    def `table-borderless` = add("table-borderless")

    def `table-borderless`(m: => CustomReactiveElement*) = build("table-borderless", m)

    def `table-striped` = add("table-striped")

    def `table-striped`(m: => CustomReactiveElement*) = build("table-striped", m)

    def `table-active` = add("table-active")

    def `table-active`(m: => CustomReactiveElement*) = build("table-active", m)

    def `table-hover` = add("table-hover")

    def `table-hover`(m: => CustomReactiveElement*) = build("table-hover", m)

    def `table-primary` = add("table-primary")

    def `table-primary`(m: => CustomReactiveElement*) = build("table-primary", m)

    def `table-secondary` = add("table-secondary")

    def `table-secondary`(m: => CustomReactiveElement*) = build("table-secondary", m)

    def `table-success` = add("table-success")

    def `table-success`(m: => CustomReactiveElement*) = build("table-success", m)

    def `table-info` = add("table-info")

    def `table-info`(m: => CustomReactiveElement*) = build("table-info", m)

    def `table-warning` = add("table-warning")

    def `table-warning`(m: => CustomReactiveElement*) = build("table-warning", m)

    def `table-danger` = add("table-danger")

    def `table-danger`(m: => CustomReactiveElement*) = build("table-danger", m)

    def `table-light` = add("table-light")

    def `table-light`(m: => CustomReactiveElement*) = build("table-light", m)

    def `table-dark` = add("table-dark")

    def `table-dark`(m: => CustomReactiveElement*) = build("table-dark", m)

    def `table-responsive` = add("table-responsive")

    def `table-responsive`(m: => CustomReactiveElement*) = build("table-responsive", m)

    def `form-label` = add("form-label")

    def `form-label`(m: => CustomReactiveElement*) = build("form-label", m)

    def `col-form-label` = add("col-form-label")

    def `col-form-label`(m: => CustomReactiveElement*) = build("col-form-label", m)

    def `col-form-label-lg` = add("col-form-label-lg")

    def `col-form-label-lg`(m: => CustomReactiveElement*) = build("col-form-label-lg", m)

    def `col-form-label-sm` = add("col-form-label-sm")

    def `col-form-label-sm`(m: => CustomReactiveElement*) = build("col-form-label-sm", m)

    def `form-text` = add("form-text")

    def `form-text`(m: => CustomReactiveElement*) = build("form-text", m)

    def `form-control` = add("form-control")

    def `form-control`(m: => CustomReactiveElement*) = build("form-control", m)

    def `form-control-plaintext` = add("form-control-plaintext")

    def `form-control-plaintext`(m: => CustomReactiveElement*) = build("form-control-plaintext", m)

    def `form-control-sm` = add("form-control-sm")

    def `form-control-sm`(m: => CustomReactiveElement*) = build("form-control-sm", m)

    def `form-control-lg` = add("form-control-lg")

    def `form-control-lg`(m: => CustomReactiveElement*) = build("form-control-lg", m)

    def `form-control-color` = add("form-control-color")

    def `form-control-color`(m: => CustomReactiveElement*) = build("form-control-color", m)

    def `form-select` = add("form-select")

    def `form-select`(m: => CustomReactiveElement*) = build("form-select", m)

    def `form-select-sm` = add("form-select-sm")

    def `form-select-sm`(m: => CustomReactiveElement*) = build("form-select-sm", m)

    def `form-select-lg` = add("form-select-lg")

    def `form-select-lg`(m: => CustomReactiveElement*) = build("form-select-lg", m)

    def `form-check` = add("form-check")

    def `form-check`(m: => CustomReactiveElement*) = build("form-check", m)

    def `form-check-input` = add("form-check-input")

    def `form-check-input`(m: => CustomReactiveElement*) = build("form-check-input", m)

    def `form-check-label` = add("form-check-label")

    def `form-check-label`(m: => CustomReactiveElement*) = build("form-check-label", m)

    def `form-switch` = add("form-switch")

    def `form-switch`(m: => CustomReactiveElement*) = build("form-switch", m)

    def `form-check-inline` = add("form-check-inline")

    def `form-check-inline`(m: => CustomReactiveElement*) = build("form-check-inline", m)

    def `btn-check` = add("btn-check")

    def `btn-check`(m: => CustomReactiveElement*) = build("btn-check", m)

    def btn = add("btn")

    def btn(m: => CustomReactiveElement*) = build("btn", m)

    def `form-range` = add("form-range")

    def `form-range`(m: => CustomReactiveElement*) = build("form-range", m)

    def `form-floating` = add("form-floating")

    def `form-floating`(m: => CustomReactiveElement*) = build("form-floating", m)

    def `input-group` = add("input-group")

    def `input-group`(m: => CustomReactiveElement*) = build("input-group", m)

    def `input-group-text` = add("input-group-text")

    def `input-group-text`(m: => CustomReactiveElement*) = build("input-group-text", m)

    def `input-group-lg` = add("input-group-lg")

    def `input-group-lg`(m: => CustomReactiveElement*) = build("input-group-lg", m)

    def `input-group-sm` = add("input-group-sm")

    def `input-group-sm`(m: => CustomReactiveElement*) = build("input-group-sm", m)

    def `has-validation` = add("has-validation")

    def `has-validation`(m: => CustomReactiveElement*) = build("has-validation", m)

    def `dropdown-toggle` = add("dropdown-toggle")

    def `dropdown-toggle`(m: => CustomReactiveElement*) = build("dropdown-toggle", m)

    def `valid-feedback` = add("valid-feedback")

    def `valid-feedback`(m: => CustomReactiveElement*) = build("valid-feedback", m)

    def `valid-tooltip` = add("valid-tooltip")

    def `valid-tooltip`(m: => CustomReactiveElement*) = build("valid-tooltip", m)

    def `was-validated` = add("was-validated")

    def `was-validated`(m: => CustomReactiveElement*) = build("was-validated", m)

    def `is-valid` = add("is-valid")

    def `is-valid`(m: => CustomReactiveElement*) = build("is-valid", m)

    def `invalid-feedback` = add("invalid-feedback")

    def `invalid-feedback`(m: => CustomReactiveElement*) = build("invalid-feedback", m)

    def `invalid-tooltip` = add("invalid-tooltip")

    def `invalid-tooltip`(m: => CustomReactiveElement*) = build("invalid-tooltip", m)

    def `is-invalid` = add("is-invalid")

    def `is-invalid`(m: => CustomReactiveElement*) = build("is-invalid", m)

    def disabled = add("disabled")

    def disabled(m: => CustomReactiveElement*) = build("disabled", m)

    def `btn-primary` = add("btn-primary")

    def `btn-primary`(m: => CustomReactiveElement*) = build("btn-primary", m)

    def active = add("active")

    def active(m: => CustomReactiveElement*) = build("active", m)

    def show = add("show")

    def show(m: => CustomReactiveElement*) = build("show", m)

    def `btn-secondary` = add("btn-secondary")

    def `btn-secondary`(m: => CustomReactiveElement*) = build("btn-secondary", m)

    def `btn-success` = add("btn-success")

    def `btn-success`(m: => CustomReactiveElement*) = build("btn-success", m)

    def `btn-info` = add("btn-info")

    def `btn-info`(m: => CustomReactiveElement*) = build("btn-info", m)

    def `btn-warning` = add("btn-warning")

    def `btn-warning`(m: => CustomReactiveElement*) = build("btn-warning", m)

    def `btn-danger` = add("btn-danger")

    def `btn-danger`(m: => CustomReactiveElement*) = build("btn-danger", m)

    def `btn-light` = add("btn-light")

    def `btn-light`(m: => CustomReactiveElement*) = build("btn-light", m)

    def `btn-dark` = add("btn-dark")

    def `btn-dark`(m: => CustomReactiveElement*) = build("btn-dark", m)

    def `btn-outline-primary` = add("btn-outline-primary")

    def `btn-outline-primary`(m: => CustomReactiveElement*) = build("btn-outline-primary", m)

    def `btn-outline-secondary` = add("btn-outline-secondary")

    def `btn-outline-secondary`(m: => CustomReactiveElement*) = build("btn-outline-secondary", m)

    def `btn-outline-success` = add("btn-outline-success")

    def `btn-outline-success`(m: => CustomReactiveElement*) = build("btn-outline-success", m)

    def `btn-outline-info` = add("btn-outline-info")

    def `btn-outline-info`(m: => CustomReactiveElement*) = build("btn-outline-info", m)

    def `btn-outline-warning` = add("btn-outline-warning")

    def `btn-outline-warning`(m: => CustomReactiveElement*) = build("btn-outline-warning", m)

    def `btn-outline-danger` = add("btn-outline-danger")

    def `btn-outline-danger`(m: => CustomReactiveElement*) = build("btn-outline-danger", m)

    def `btn-outline-light` = add("btn-outline-light")

    def `btn-outline-light`(m: => CustomReactiveElement*) = build("btn-outline-light", m)

    def `btn-outline-dark` = add("btn-outline-dark")

    def `btn-outline-dark`(m: => CustomReactiveElement*) = build("btn-outline-dark", m)

    def `btn-link` = add("btn-link")

    def `btn-link`(m: => CustomReactiveElement*) = build("btn-link", m)

    def `btn-lg` = add("btn-lg")

    def `btn-lg`(m: => CustomReactiveElement*) = build("btn-lg", m)

    def `btn-group-lg` = add("btn-group-lg")

    def `btn-group-lg`(m: => CustomReactiveElement*) = build("btn-group-lg", m)

    def `btn-sm` = add("btn-sm")

    def `btn-sm`(m: => CustomReactiveElement*) = build("btn-sm", m)

    def `btn-group-sm` = add("btn-group-sm")

    def `btn-group-sm`(m: => CustomReactiveElement*) = build("btn-group-sm", m)

    def fade = add("fade")

    def fade(m: => CustomReactiveElement*) = build("fade", m)

    def collapse = add("collapse")

    def collapse(m: => CustomReactiveElement*) = build("collapse", m)

    def collapsing = add("collapsing")

    def collapsing(m: => CustomReactiveElement*) = build("collapsing", m)

    def dropup = add("dropup")

    def dropup(m: => CustomReactiveElement*) = build("dropup", m)

    def dropend = add("dropend")

    def dropend(m: => CustomReactiveElement*) = build("dropend", m)

    def dropdown = add("dropdown")

    def dropdown(m: => CustomReactiveElement*) = build("dropdown", m)

    def dropstart = add("dropstart")

    def dropstart(m: => CustomReactiveElement*) = build("dropstart", m)

    def `dropdown-menu` = add("dropdown-menu")

    def `dropdown-menu`(m: => CustomReactiveElement*) = build("dropdown-menu", m)

    def `dropdown-menu-start` = add("dropdown-menu-start")

    def `dropdown-menu-start`(m: => CustomReactiveElement*) = build("dropdown-menu-start", m)

    def `dropdown-menu-end` = add("dropdown-menu-end")

    def `dropdown-menu-end`(m: => CustomReactiveElement*) = build("dropdown-menu-end", m)

    def `dropdown-divider` = add("dropdown-divider")

    def `dropdown-divider`(m: => CustomReactiveElement*) = build("dropdown-divider", m)

    def `dropdown-item` = add("dropdown-item")

    def `dropdown-item`(m: => CustomReactiveElement*) = build("dropdown-item", m)

    def `dropdown-header` = add("dropdown-header")

    def `dropdown-header`(m: => CustomReactiveElement*) = build("dropdown-header", m)

    def `dropdown-item-text` = add("dropdown-item-text")

    def `dropdown-item-text`(m: => CustomReactiveElement*) = build("dropdown-item-text", m)

    def `dropdown-menu-dark` = add("dropdown-menu-dark")

    def `dropdown-menu-dark`(m: => CustomReactiveElement*) = build("dropdown-menu-dark", m)

    def `btn-group` = add("btn-group")

    def `btn-group`(m: => CustomReactiveElement*) = build("btn-group", m)

    def `btn-group-vertical` = add("btn-group-vertical")

    def `btn-group-vertical`(m: => CustomReactiveElement*) = build("btn-group-vertical", m)

    def `btn-toolbar` = add("btn-toolbar")

    def `btn-toolbar`(m: => CustomReactiveElement*) = build("btn-toolbar", m)

    def `dropdown-toggle-split` = add("dropdown-toggle-split")

    def `dropdown-toggle-split`(m: => CustomReactiveElement*) = build("dropdown-toggle-split", m)

    def nav = add("nav")

    def nav(m: => CustomReactiveElement*) = build("nav", m)

    def `nav-link` = add("nav-link")

    def `nav-link`(m: => CustomReactiveElement*) = build("nav-link", m)

    def `nav-tabs` = add("nav-tabs")

    def `nav-tabs`(m: => CustomReactiveElement*) = build("nav-tabs", m)

    def `nav-item` = add("nav-item")

    def `nav-item`(m: => CustomReactiveElement*) = build("nav-item", m)

    def `nav-pills` = add("nav-pills")

    def `nav-pills`(m: => CustomReactiveElement*) = build("nav-pills", m)

    def `nav-fill` = add("nav-fill")

    def `nav-fill`(m: => CustomReactiveElement*) = build("nav-fill", m)

    def `nav-justified` = add("nav-justified")

    def `nav-justified`(m: => CustomReactiveElement*) = build("nav-justified", m)

    def `tab-content` = add("tab-content")

    def `tab-content`(m: => CustomReactiveElement*) = build("tab-content", m)

    def `tab-pane` = add("tab-pane")

    def `tab-pane`(m: => CustomReactiveElement*) = build("tab-pane", m)

    def navbar = add("navbar")

    def navbar(m: => CustomReactiveElement*) = build("navbar", m)

    def `navbar-brand` = add("navbar-brand")

    def `navbar-brand`(m: => CustomReactiveElement*) = build("navbar-brand", m)

    def `navbar-nav` = add("navbar-nav")

    def `navbar-nav`(m: => CustomReactiveElement*) = build("navbar-nav", m)

    def `navbar-text` = add("navbar-text")

    def `navbar-text`(m: => CustomReactiveElement*) = build("navbar-text", m)

    def `navbar-collapse` = add("navbar-collapse")

    def `navbar-collapse`(m: => CustomReactiveElement*) = build("navbar-collapse", m)

    def `navbar-toggler` = add("navbar-toggler")

    def `navbar-toggler`(m: => CustomReactiveElement*) = build("navbar-toggler", m)

    def `navbar-toggler-icon` = add("navbar-toggler-icon")

    def `navbar-toggler-icon`(m: => CustomReactiveElement*) = build("navbar-toggler-icon", m)

    def `navbar-nav-scroll` = add("navbar-nav-scroll")

    def `navbar-nav-scroll`(m: => CustomReactiveElement*) = build("navbar-nav-scroll", m)

    def `navbar-expand` = add("navbar-expand")

    def `navbar-expand`(m: => CustomReactiveElement*) = build("navbar-expand", m)

    def `navbar-light` = add("navbar-light")

    def `navbar-light`(m: => CustomReactiveElement*) = build("navbar-light", m)

    def `navbar-dark` = add("navbar-dark")

    def `navbar-dark`(m: => CustomReactiveElement*) = build("navbar-dark", m)

    def card = add("card")

    def card(m: => CustomReactiveElement*) = build("card", m)

    def `list-group` = add("list-group")

    def `list-group`(m: => CustomReactiveElement*) = build("list-group", m)

    def `card-header` = add("card-header")

    def `card-header`(m: => CustomReactiveElement*) = build("card-header", m)

    def `card-footer` = add("card-footer")

    def `card-footer`(m: => CustomReactiveElement*) = build("card-footer", m)

    def `card-body` = add("card-body")

    def `card-body`(m: => CustomReactiveElement*) = build("card-body", m)

    def `card-title` = add("card-title")

    def `card-title`(m: => CustomReactiveElement*) = build("card-title", m)

    def `card-subtitle` = add("card-subtitle")

    def `card-subtitle`(m: => CustomReactiveElement*) = build("card-subtitle", m)

    def `card-text` = add("card-text")

    def `card-text`(m: => CustomReactiveElement*) = build("card-text", m)

    def `card-link` = add("card-link")

    def `card-link`(m: => CustomReactiveElement*) = build("card-link", m)

    def `card-header-tabs` = add("card-header-tabs")

    def `card-header-tabs`(m: => CustomReactiveElement*) = build("card-header-tabs", m)

    def `card-header-pills` = add("card-header-pills")

    def `card-header-pills`(m: => CustomReactiveElement*) = build("card-header-pills", m)

    def `card-img-overlay` = add("card-img-overlay")

    def `card-img-overlay`(m: => CustomReactiveElement*) = build("card-img-overlay", m)

    def `card-img` = add("card-img")

    def `card-img`(m: => CustomReactiveElement*) = build("card-img", m)

    def `card-img-top` = add("card-img-top")

    def `card-img-top`(m: => CustomReactiveElement*) = build("card-img-top", m)

    def `card-img-bottom` = add("card-img-bottom")

    def `card-img-bottom`(m: => CustomReactiveElement*) = build("card-img-bottom", m)

    def `card-group` = add("card-group")

    def `card-group`(m: => CustomReactiveElement*) = build("card-group", m)

    def `accordion-button` = add("accordion-button")

    def `accordion-button`(m: => CustomReactiveElement*) = build("accordion-button", m)

    def collapsed = add("collapsed")

    def collapsed(m: => CustomReactiveElement*) = build("collapsed", m)

    def `accordion-header` = add("accordion-header")

    def `accordion-header`(m: => CustomReactiveElement*) = build("accordion-header", m)

    def `accordion-item` = add("accordion-item")

    def `accordion-item`(m: => CustomReactiveElement*) = build("accordion-item", m)

    def `accordion-collapse` = add("accordion-collapse")

    def `accordion-collapse`(m: => CustomReactiveElement*) = build("accordion-collapse", m)

    def `accordion-body` = add("accordion-body")

    def `accordion-body`(m: => CustomReactiveElement*) = build("accordion-body", m)

    def `accordion-flush` = add("accordion-flush")

    def `accordion-flush`(m: => CustomReactiveElement*) = build("accordion-flush", m)

    def breadcrumb = add("breadcrumb")

    def breadcrumb(m: => CustomReactiveElement*) = build("breadcrumb", m)

    def `breadcrumb-item` = add("breadcrumb-item")

    def `breadcrumb-item`(m: => CustomReactiveElement*) = build("breadcrumb-item", m)

    def pagination = add("pagination")

    def pagination(m: => CustomReactiveElement*) = build("pagination", m)

    def `page-link` = add("page-link")

    def `page-link`(m: => CustomReactiveElement*) = build("page-link", m)

    def `page-item` = add("page-item")

    def `page-item`(m: => CustomReactiveElement*) = build("page-item", m)

    def `pagination-lg` = add("pagination-lg")

    def `pagination-lg`(m: => CustomReactiveElement*) = build("pagination-lg", m)

    def `pagination-sm` = add("pagination-sm")

    def `pagination-sm`(m: => CustomReactiveElement*) = build("pagination-sm", m)

    def badge = add("badge")

    def badge(m: => CustomReactiveElement*) = build("badge", m)

    def alert = add("alert")

    def alert(m: => CustomReactiveElement*) = build("alert", m)

    def `alert-heading` = add("alert-heading")

    def `alert-heading`(m: => CustomReactiveElement*) = build("alert-heading", m)

    def `alert-link` = add("alert-link")

    def `alert-link`(m: => CustomReactiveElement*) = build("alert-link", m)

    def `alert-dismissible` = add("alert-dismissible")

    def `alert-dismissible`(m: => CustomReactiveElement*) = build("alert-dismissible", m)

    def `btn-close` = add("btn-close")

    def `btn-close`(m: => CustomReactiveElement*) = build("btn-close", m)

    def `alert-primary` = add("alert-primary")

    def `alert-primary`(m: => CustomReactiveElement*) = build("alert-primary", m)

    def `alert-secondary` = add("alert-secondary")

    def `alert-secondary`(m: => CustomReactiveElement*) = build("alert-secondary", m)

    def `alert-success` = add("alert-success")

    def `alert-success`(m: => CustomReactiveElement*) = build("alert-success", m)

    def `alert-info` = add("alert-info")

    def `alert-info`(m: => CustomReactiveElement*) = build("alert-info", m)

    def `alert-warning` = add("alert-warning")

    def `alert-warning`(m: => CustomReactiveElement*) = build("alert-warning", m)

    def `alert-danger` = add("alert-danger")

    def `alert-danger`(m: => CustomReactiveElement*) = build("alert-danger", m)

    def `alert-light` = add("alert-light")

    def `alert-light`(m: => CustomReactiveElement*) = build("alert-light", m)

    def `alert-dark` = add("alert-dark")

    def `alert-dark`(m: => CustomReactiveElement*) = build("alert-dark", m)

    def progress = add("progress")

    def progress(m: => CustomReactiveElement*) = build("progress", m)

    def `progress-bar` = add("progress-bar")

    def `progress-bar`(m: => CustomReactiveElement*) = build("progress-bar", m)

    def `progress-bar-striped` = add("progress-bar-striped")

    def `progress-bar-striped`(m: => CustomReactiveElement*) = build("progress-bar-striped", m)

    def `progress-bar-animated` = add("progress-bar-animated")

    def `progress-bar-animated`(m: => CustomReactiveElement*) = build("progress-bar-animated", m)

    def `list-group-numbered` = add("list-group-numbered")

    def `list-group-numbered`(m: => CustomReactiveElement*) = build("list-group-numbered", m)

    def `list-group-item-action` = add("list-group-item-action")

    def `list-group-item-action`(m: => CustomReactiveElement*) = build("list-group-item-action", m)

    def `list-group-item` = add("list-group-item")

    def `list-group-item`(m: => CustomReactiveElement*) = build("list-group-item", m)

    def `list-group-horizontal` = add("list-group-horizontal")

    def `list-group-horizontal`(m: => CustomReactiveElement*) = build("list-group-horizontal", m)

    def `list-group-flush` = add("list-group-flush")

    def `list-group-flush`(m: => CustomReactiveElement*) = build("list-group-flush", m)

    def `list-group-item-primary` = add("list-group-item-primary")

    def `list-group-item-primary`(m: => CustomReactiveElement*) = build("list-group-item-primary", m)

    def `list-group-item-secondary` = add("list-group-item-secondary")

    def `list-group-item-secondary`(m: => CustomReactiveElement*) = build("list-group-item-secondary", m)

    def `list-group-item-success` = add("list-group-item-success")

    def `list-group-item-success`(m: => CustomReactiveElement*) = build("list-group-item-success", m)

    def `list-group-item-info` = add("list-group-item-info")

    def `list-group-item-info`(m: => CustomReactiveElement*) = build("list-group-item-info", m)

    def `list-group-item-warning` = add("list-group-item-warning")

    def `list-group-item-warning`(m: => CustomReactiveElement*) = build("list-group-item-warning", m)

    def `list-group-item-danger` = add("list-group-item-danger")

    def `list-group-item-danger`(m: => CustomReactiveElement*) = build("list-group-item-danger", m)

    def `list-group-item-light` = add("list-group-item-light")

    def `list-group-item-light`(m: => CustomReactiveElement*) = build("list-group-item-light", m)

    def `list-group-item-dark` = add("list-group-item-dark")

    def `list-group-item-dark`(m: => CustomReactiveElement*) = build("list-group-item-dark", m)

    def `btn-close-white` = add("btn-close-white")

    def `btn-close-white`(m: => CustomReactiveElement*) = build("btn-close-white", m)

    def toast = add("toast")

    def toast(m: => CustomReactiveElement*) = build("toast", m)

    def showing = add("showing")

    def showing(m: => CustomReactiveElement*) = build("showing", m)

    def hide = add("hide")

    def hide(m: => CustomReactiveElement*) = build("hide", m)

    def `toast-container` = add("toast-container")

    def `toast-container`(m: => CustomReactiveElement*) = build("toast-container", m)

    def `toast-header` = add("toast-header")

    def `toast-header`(m: => CustomReactiveElement*) = build("toast-header", m)

    def `toast-body` = add("toast-body")

    def `toast-body`(m: => CustomReactiveElement*) = build("toast-body", m)

    def modal = add("modal")

    def modal(m: => CustomReactiveElement*) = build("modal", m)

    def `modal-dialog` = add("modal-dialog")

    def `modal-dialog`(m: => CustomReactiveElement*) = build("modal-dialog", m)

    def `modal-static` = add("modal-static")

    def `modal-static`(m: => CustomReactiveElement*) = build("modal-static", m)

    def `modal-dialog-scrollable` = add("modal-dialog-scrollable")

    def `modal-dialog-scrollable`(m: => CustomReactiveElement*) = build("modal-dialog-scrollable", m)

    def `modal-content` = add("modal-content")

    def `modal-content`(m: => CustomReactiveElement*) = build("modal-content", m)

    def `modal-body` = add("modal-body")

    def `modal-body`(m: => CustomReactiveElement*) = build("modal-body", m)

    def `modal-dialog-centered` = add("modal-dialog-centered")

    def `modal-dialog-centered`(m: => CustomReactiveElement*) = build("modal-dialog-centered", m)

    def `modal-backdrop` = add("modal-backdrop")

    def `modal-backdrop`(m: => CustomReactiveElement*) = build("modal-backdrop", m)

    def `modal-header` = add("modal-header")

    def `modal-header`(m: => CustomReactiveElement*) = build("modal-header", m)

    def `modal-title` = add("modal-title")

    def `modal-title`(m: => CustomReactiveElement*) = build("modal-title", m)

    def `modal-footer` = add("modal-footer")

    def `modal-footer`(m: => CustomReactiveElement*) = build("modal-footer", m)

    def `modal-xl` = add("modal-xl")

    def `modal-xl`(m: => CustomReactiveElement*) = build("modal-xl", m)

    def `modal-fullscreen` = add("modal-fullscreen")

    def `modal-fullscreen`(m: => CustomReactiveElement*) = build("modal-fullscreen", m)

    def tooltip = add("tooltip")

    def tooltip(m: => CustomReactiveElement*) = build("tooltip", m)

    def `tooltip-arrow` = add("tooltip-arrow")

    def `tooltip-arrow`(m: => CustomReactiveElement*) = build("tooltip-arrow", m)

    def `bs-tooltip-top` = add("bs-tooltip-top")

    def `bs-tooltip-top`(m: => CustomReactiveElement*) = build("bs-tooltip-top", m)

    def `bs-tooltip-auto` = add("bs-tooltip-auto")

    def `bs-tooltip-auto`(m: => CustomReactiveElement*) = build("bs-tooltip-auto", m)

    def `bs-tooltip-end` = add("bs-tooltip-end")

    def `bs-tooltip-end`(m: => CustomReactiveElement*) = build("bs-tooltip-end", m)

    def `bs-tooltip-bottom` = add("bs-tooltip-bottom")

    def `bs-tooltip-bottom`(m: => CustomReactiveElement*) = build("bs-tooltip-bottom", m)

    def `bs-tooltip-start` = add("bs-tooltip-start")

    def `bs-tooltip-start`(m: => CustomReactiveElement*) = build("bs-tooltip-start", m)

    def `tooltip-inner` = add("tooltip-inner")

    def `tooltip-inner`(m: => CustomReactiveElement*) = build("tooltip-inner", m)

    def popover = add("popover")

    def popover(m: => CustomReactiveElement*) = build("popover", m)

    def `popover-arrow` = add("popover-arrow")

    def `popover-arrow`(m: => CustomReactiveElement*) = build("popover-arrow", m)

    def `bs-popover-top` = add("bs-popover-top")

    def `bs-popover-top`(m: => CustomReactiveElement*) = build("bs-popover-top", m)

    def `bs-popover-auto` = add("bs-popover-auto")

    def `bs-popover-auto`(m: => CustomReactiveElement*) = build("bs-popover-auto", m)

    def `bs-popover-end` = add("bs-popover-end")

    def `bs-popover-end`(m: => CustomReactiveElement*) = build("bs-popover-end", m)

    def `bs-popover-bottom` = add("bs-popover-bottom")

    def `bs-popover-bottom`(m: => CustomReactiveElement*) = build("bs-popover-bottom", m)

    def `popover-header` = add("popover-header")

    def `popover-header`(m: => CustomReactiveElement*) = build("popover-header", m)

    def `bs-popover-start` = add("bs-popover-start")

    def `bs-popover-start`(m: => CustomReactiveElement*) = build("bs-popover-start", m)

    def `popover-body` = add("popover-body")

    def `popover-body`(m: => CustomReactiveElement*) = build("popover-body", m)

    def carousel = add("carousel")

    def carousel(m: => CustomReactiveElement*) = build("carousel", m)

    def `pointer-event` = add("pointer-event")

    def `pointer-event`(m: => CustomReactiveElement*) = build("pointer-event", m)

    def `carousel-inner` = add("carousel-inner")

    def `carousel-inner`(m: => CustomReactiveElement*) = build("carousel-inner", m)

    def `carousel-item` = add("carousel-item")

    def `carousel-item`(m: => CustomReactiveElement*) = build("carousel-item", m)

    def `carousel-item-next` = add("carousel-item-next")

    def `carousel-item-next`(m: => CustomReactiveElement*) = build("carousel-item-next", m)

    def `carousel-item-prev` = add("carousel-item-prev")

    def `carousel-item-prev`(m: => CustomReactiveElement*) = build("carousel-item-prev", m)

    def `carousel-item-start` = add("carousel-item-start")

    def `carousel-item-start`(m: => CustomReactiveElement*) = build("carousel-item-start", m)

    def `carousel-item-end` = add("carousel-item-end")

    def `carousel-item-end`(m: => CustomReactiveElement*) = build("carousel-item-end", m)

    def `carousel-fade` = add("carousel-fade")

    def `carousel-fade`(m: => CustomReactiveElement*) = build("carousel-fade", m)

    def `carousel-control-prev` = add("carousel-control-prev")

    def `carousel-control-prev`(m: => CustomReactiveElement*) = build("carousel-control-prev", m)

    def `carousel-control-next` = add("carousel-control-next")

    def `carousel-control-next`(m: => CustomReactiveElement*) = build("carousel-control-next", m)

    def `carousel-control-prev-icon` = add("carousel-control-prev-icon")

    def `carousel-control-prev-icon`(m: => CustomReactiveElement*) = build("carousel-control-prev-icon", m)

    def `carousel-control-next-icon` = add("carousel-control-next-icon")

    def `carousel-control-next-icon`(m: => CustomReactiveElement*) = build("carousel-control-next-icon", m)

    def `carousel-indicators` = add("carousel-indicators")

    def `carousel-indicators`(m: => CustomReactiveElement*) = build("carousel-indicators", m)

    def `carousel-caption` = add("carousel-caption")

    def `carousel-caption`(m: => CustomReactiveElement*) = build("carousel-caption", m)

    def `carousel-dark` = add("carousel-dark")

    def `carousel-dark`(m: => CustomReactiveElement*) = build("carousel-dark", m)

    def `spinner-border` = add("spinner-border")

    def `spinner-border`(m: => CustomReactiveElement*) = build("spinner-border", m)

    def `spinner-border-sm` = add("spinner-border-sm")

    def `spinner-border-sm`(m: => CustomReactiveElement*) = build("spinner-border-sm", m)

    def `spinner-grow` = add("spinner-grow")

    def `spinner-grow`(m: => CustomReactiveElement*) = build("spinner-grow", m)

    def `spinner-grow-sm` = add("spinner-grow-sm")

    def `spinner-grow-sm`(m: => CustomReactiveElement*) = build("spinner-grow-sm", m)

    def offcanvas = add("offcanvas")

    def offcanvas(m: => CustomReactiveElement*) = build("offcanvas", m)

    def `offcanvas-header` = add("offcanvas-header")

    def `offcanvas-header`(m: => CustomReactiveElement*) = build("offcanvas-header", m)

    def `offcanvas-title` = add("offcanvas-title")

    def `offcanvas-title`(m: => CustomReactiveElement*) = build("offcanvas-title", m)

    def `offcanvas-body` = add("offcanvas-body")

    def `offcanvas-body`(m: => CustomReactiveElement*) = build("offcanvas-body", m)

    def `offcanvas-start` = add("offcanvas-start")

    def `offcanvas-start`(m: => CustomReactiveElement*) = build("offcanvas-start", m)

    def `offcanvas-end` = add("offcanvas-end")

    def `offcanvas-end`(m: => CustomReactiveElement*) = build("offcanvas-end", m)

    def `offcanvas-top` = add("offcanvas-top")

    def `offcanvas-top`(m: => CustomReactiveElement*) = build("offcanvas-top", m)

    def `offcanvas-bottom` = add("offcanvas-bottom")

    def `offcanvas-bottom`(m: => CustomReactiveElement*) = build("offcanvas-bottom", m)

    def `text-break` = add("text-break")

    def `text-break`(m: => CustomReactiveElement*) = build("text-break", m)
