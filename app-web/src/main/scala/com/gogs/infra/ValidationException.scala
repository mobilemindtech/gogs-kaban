package com.gogs.infra

case class ValidationException (messages: Seq[String]) extends Exception
