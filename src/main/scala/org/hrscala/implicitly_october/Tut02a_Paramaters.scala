package org.hrscala.implicitly_october

object Util {
  def sq(x: Int)(implicit logger: Logger) = {
    logger.log("I got an " + x)
    val res = x * x
    logger.log("I squared it and got " + res)
    res
  }
}

class Logger {
  def log(msg: String) = println(msg)
}

trait Logging {
  implicit val `It's all about the types, baby` = new Logger()
  implicit def veryUsefulLoggerFactory(x: Int) = (1 to x) map { _ => new Logger() }
}

object Tut02a_Paramaters extends App with Logging {
  Util.sq(3)
  val a: Seq[Logger] = 100
  println(a)
}
