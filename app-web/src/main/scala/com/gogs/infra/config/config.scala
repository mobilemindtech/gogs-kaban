package com.gogs.infra.config

import zio.{Config, ConfigProvider, IO, ZIO, ZIOAppDefault, ZLayer}
import zio.config.*
import typesafe.*
import magnolia.*
import java.io.File
import zio.ZLayer

object GogsConfigs:

  case class ApiConfig(url: String, token: String)

  case class FlywayConfig(
    table: String,
    location: String,
    database: String,
    url: String,
    user: String,
    password: String
  )

  case class DataSourceConfig(
    url: String,
    user: String,
    password: String,
    cachePrepStmts: Boolean,
    prepStmtCacheSize: Int,
    prepStmtCacheSqlLimit: Int
  )

  case class DatabaseConfig(
    dataSourceClassName: String,
    connectionTimeout: Int,
    maximumPoolSize: Int,
    dataSource: DataSourceConfig
  )

  case class AppConfig(api: ApiConfig, flyway: FlywayConfig, databaseConfig: DatabaseConfig)

  val live: ZLayer[Any, Config.Error, AppConfig] =
    ZLayer
      .fromZIO(ZIO.config(deriveConfig[AppConfig].nested("appConfig")))
