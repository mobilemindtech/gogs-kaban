package com.gogs.api

import com.gogs.mock
import com.gogs.domain.*
import com.gogs.util.util.*

import scala.concurrent.{Future, Promise}

object RepositoryApi:
  def findAll: Future[List[Repository]] =
    Promise[List[Repository]].delayed(200):
      mock.data.repositories
