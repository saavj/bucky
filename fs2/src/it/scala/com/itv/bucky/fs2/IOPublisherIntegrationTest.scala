package com.itv.bucky.fs2

import cats.effect.IO
import com.itv.bucky.fs2.utils.{IOEffectMonad, IOEffectVerification, IOPublisherConsumerBaseTest}
import com.itv.bucky.suite.PublisherIntegrationTest

class IOPublisherIntegrationTest
    extends PublisherIntegrationTest[IO, Throwable]
    with IOPublisherConsumerBaseTest
    with IOEffectVerification
    with IOEffectMonad {}
