package org.hrscala.implicitly_october

import io.jvm.uuid._

object Tut05_Pimps extends App with Logging {

  import Tut02_Classes._

  3 times println("aoeu")

  val uuid = new UUID(1, 2)
  println(uuid.getClass)
  println(uuid.byteArray map (_ formatted "%02X") mkString ("-"))

  sys.exit(0)

  println(new UUID(1, 2))
  println(UUID.fromString("1-23-4-5-6"))
//  println(UUID(`It's all about the types, baby`))

  println(DateTime.now + 1.days)
}

trait Dinamo2 {
  //  implicit class Pero(x: Int) extends AnyVal {
  //
  //  }

  println(DateTime.now + 1.days)
}
