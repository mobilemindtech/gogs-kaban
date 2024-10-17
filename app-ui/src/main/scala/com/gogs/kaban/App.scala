package com.gogs.kaban

import com.raquo.laminar.api.L.*
import frontroute.*
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

def useImport(obj: js.Object): Unit = ()

//@JSImport("bootstrap", JSImport.Namespace)
//@js.native private object Bootstrap extends js.Object


@JSImport("stylesheets/styles.scss", JSImport.Namespace)
@js.native private object Styles extends js.Object


object App:
  lazy val node: HtmlElement =
    div(initRouting, Kaban.node)

@main def main(args: String*): Unit =
  //useImport(Bootstrap)

  useImport(Styles)
  val container = dom.document.getElementById("app")
  render(container, App.node.amend(LinkHandler.bind))