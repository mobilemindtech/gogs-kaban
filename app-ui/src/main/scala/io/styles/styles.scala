package io.styles

import com.raquo.laminar.api.L.*
import com.raquo.laminar.modifiers.Modifier
import com.raquo.laminar.nodes.ReactiveHtmlElement
import com.raquo.laminar.tags.HtmlTag
import org.scalajs.dom
import org.scalajs.dom.HTMLElement

import scala.collection.mutable

type CustomReactiveElement = Modifier[ReactiveHtmlElement[dom.html.Element]]

trait Style[A <: HTMLElement](element: HtmlTag[A]):
  private val classes: mutable.ListBuffer[String] = mutable.ListBuffer.empty

  type Class <: Style[A]

  def empty =
    val clz = classes.mkString(" ")
    println(clz)
    element(cls(clz))

  def add(css: String): Class =
    classes.append(css)
    this.asInstanceOf[Class]

  protected def build(css: String, m: => CustomReactiveElement*): CustomReactiveElement =
    val clz = (css +: classes).mkString(" ")
    println(clz)
    element(cls(clz), m)

case class elem_(el: HtmlTag[dom.html.Element], css: String):
  def apply(modifiers: => CustomReactiveElement*): ReactiveHtmlElement[dom.html.Element] =
    el(cls(css), modifiers)



