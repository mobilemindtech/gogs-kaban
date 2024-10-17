package com.gogs.api

import com.gogs.mock
import com.gogs.domain.*
import com.gogs.util.util.*

import scala.concurrent.{Future, Promise}

object IssueApi :
  def findAll(repo: Repository): Future[List[Issue]] =
    Promise[List[Issue]].delayed(200):
      mock.data.issues.filter(_.repository.id == repo.id)
