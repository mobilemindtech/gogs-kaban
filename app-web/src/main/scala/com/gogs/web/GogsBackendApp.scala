package com.gogs.web

import com.gogs.infra.config.GogsConfigs
import com.gogs.infra.config.GogsConfigs.AppConfig
import com.gogs.infra.db.UserService
import com.gogs.infra.db.migrations.DBMigrations
import io.getquill.*
import io.getquill.jdbczio.Quill
import zio.config.*
import zio.config.typesafe.*
import zio.http.*
import zio.http.Header.{AccessControlAllowOrigin, Origin}
import zio.http.Middleware.CorsConfig
import zio.json.EncoderOps
import zio.{ZIO, ZIOAppArgs, ZIOAppDefault, ZLayer, *}

val ctx = new SqlMirrorContext(MirrorSqlDialect, Literal)

object GogsBackendApp extends ZIOAppDefault {

  override val bootstrap: ZLayer[ZIOAppArgs, Any, Any] =
    Runtime.setConfigProvider(
      TypesafeConfigProvider
        .fromResourcePath()
    )

  val config: CorsConfig =
    CorsConfig(allowedOrigin = {
      case origin if origin == Origin.parse("http://localhost:3000").toOption.get =>
        Some(AccessControlAllowOrigin.Specific(origin))
      case _                                                                      => None
    })

  var userRoute: Route[UserService, Nothing] =
    Method.GET / "users" -> handler {
      UserService
        .findByUsername("ricardo")
        .map(u => Response.json(u.toJson))
        .debug
    }.sandbox

  // Responds with plain text
  val homeRoute =
    Method.GET / Root -> handler(Response.text("Hello World!"))

  // Responds with JSON
  val reposRoute =
    Method.GET / "repos" -> handler {

      for
        cfg    <- ZIO.service[AppConfig]
        headers =
          Headers(Header.ContentType(MediaType.application.json), Header.Authorization.Unparsed("token", cfg.api.token))
        result <- ZClient.batched(
                    Request
                      .get(s"${cfg.api.url}/orgs/mobilemind/repos")
                      .addHeaders(headers)
                  )
      yield result

    }.sandbox

  // Create HTTP route
  val app = Routes(homeRoute, reposRoute, userRoute)

  override def run =
    Server
      .serve(app)
      .provide(
        UserService.live,
        Quill.Mysql.fromNamingStrategy(SnakeCase),
        Quill.DataSource.fromPrefix("appConfig.databaseConfig"),
        Server.default,
        GogsConfigs.live,
        DBMigrations.live,
        Client.default
      )

}
