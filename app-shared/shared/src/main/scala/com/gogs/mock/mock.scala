package com.gogs.mock

import com.gogs.domain.*

object data:
  val repositories = Repository(1, "repo a") :: Repository(2, "repo b") :: Nil
  val issues       =
    Issue(1, "issue a", repository = repositories(0))
      :: Issue(2, "issue b", repository = repositories(0))
      :: Issue(3, "issue c", repository = repositories(1))
      :: Issue(4, "issue d", repository = repositories(1))
      :: Nil
