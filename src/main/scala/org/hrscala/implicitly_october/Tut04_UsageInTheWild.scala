package org.hrscala.implicitly_october

import akka.actor._

object Tut04_UsageInTheWild extends App {
  val system = ActorSystem("implicitly-october")
  system.actorOf(Props[MyActor]) ! "kitty bang bang"
}

class MyActor extends Actor {
  def receive = {
    case x =>
      println(x)
  }
}
