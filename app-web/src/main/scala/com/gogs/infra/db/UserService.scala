package com.gogs.infra.db

import com.gogs.infra.ValidationException
import com.gogs.model
import com.gogs.domain
import io.getquill.*
import io.getquill.jdbczio.Quill
import pt.kcry.sha.Sha2_256
import zio.prelude.{OrdOps, Validation}
import zio.{ZIO, ZLayer}
import java.nio.charset.StandardCharsets.US_ASCII
import java.sql.SQLException
import io.scalaland.chimney.dsl._

case class Validator(validations: Seq[String]):

  def isSuccess = validations.isEmpty

object Validator:

  def isEmpty(text: String, label: String): Either[String, Unit] =
    if text.isEmpty then Left(s"$label name was empty")
    else Right(())

  def isEmail(email: String, label: String): Either[String, Unit] =
    val r = """[([\w\.!#$%&*+/=?^_`{|}~-]+)@([\w]+)([\.]{1}[\w]+)+]{10,30}""".r
    if r.pattern.matcher(email).matches()
    then Right(())
    else Left(s"invalid $label")

  def validateWith(validations: Either[String, Unit]*): Validator =
    val result = validations
      .filter(_.isLeft)
      .map { case Left(s) =>
        s
      }
    Validator(result)

object UserValidator:

  def validatePassword(text: String): Either[String, Unit] =
    if text.length < 4
    then Left("password min size is 4")
    else Right(())

  def validate(user: domain.User): Validator =
    Validator.validateWith(
      Validator.isEmpty(user.login, "login"),
      Validator.isEmpty(user.name, "name"),
      Validator.isEmpty(user.password, "password"),
      Validator.isEmpty(user.email, "email"),
      Validator.isEmail(user.email, "email"),
      validatePassword(user.password)
    )

class UserService(quill: Quill.Mysql[SnakeCase]):
  import quill.*
  def findByUsername(username: String): ZIO[Any, SQLException, Option[domain.User]] =
    run:
      query[model.User]
        .filter(_.login == lift(username))
        .value
    .map(_.map(_.transformInto[domain.User]))

  def hashPassword(text: String) =
    String(Sha2_256.hash(text.getBytes()))

  def create(user: domain.User): ZIO[Any, SQLException | ValidationException, domain.User] =
    UserValidator.validate(user) match
      case Validator(Nil) =>
        val u = user
          .copy(password = hashPassword(user.password))
          .transformInto[model.User]
        run:
          quote(query[model.User].insertValue(lift(u)).returning(_.id))
        .filterOrFail(_ > 0) {
          SQLException("insert failure generate new id")
        }.map(insertID =>
          user
            .copy(id = insertID)
            .transformInto[domain.User]
        )

      case Validator(messages) => ZIO.fail(ValidationException(messages))

object UserService:
  def findByUsername(username: String): ZIO[UserService, SQLException, Option[domain.User]] =
    ZIO.serviceWithZIO[UserService](_.findByUsername(username))

  def create(user: domain.User): ZIO[UserService, SQLException | ValidationException, domain.User] =
    ZIO.serviceWithZIO[UserService](_.create(user))

  val live = ZLayer.fromFunction(new UserService(_))
