package com.gogs.util

import org.scalajs.dom.window

import scala.concurrent.{Future, Promise}
import scala.scalajs.js
import scala.util.Try

object util:

  import util.*

  extension[T] (x: T)
    def unit: Unit = ()

  extension[T] (promise: Promise[T])
    def delayed(delay: Long)(block: => T): Future[T] =
      window.setTimeout({
        () => promise.complete(Try(block))
      }, delay)
      promise.future

