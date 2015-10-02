package org.hrscala.implicitly_october

import akka.actor._
import java.util.concurrent.Executors

import scala.concurrent.{ExecutionContext, Future}

object Tut04_UsageInTheWild extends App {

  val system = ActorSystem("aoeu")

  implicit lazy val `Again, it's all about the types` =
    ExecutionContext.fromExecutor(Executors.newSingleThreadExecutor())

  Future {
    Thread.sleep(1000)
    println("I'M done sleeping")
  }

  Future {
    Thread.sleep(1000)
    println("I'M done sleeping")
  }

  Future {
    Thread.sleep(1000)
    println("I'M done sleeping")
  }

  println("I never slept")
}
