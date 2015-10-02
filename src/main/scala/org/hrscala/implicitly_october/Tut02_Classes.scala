package org.hrscala.implicitly_october

object Dinamo extends App {
  implicit class Sq4(x: Int) extends Tut02_Classes.Squarer(x) {
    def sq4 = sq * sq
  }
}

object Tut02_Classes extends App {

  // must be in an object because of the implicitly created implict companion method
  implicit class TimeInjector(x: Int) {
    def times(f: => Unit) = {
      for (_ <- 1 to x) f
    }
    def rubyTimes(f: Int => Unit) = {
      for (i <- 1 to x) f(i)
    }
  }

//  implicit def myTimeInjectorWrapper(x: Int) = new TimeInjector(x)

//  3 rubyTimes { i =>
//    println("Maruko " + i)
//  }

  implicit class Squarer(val x: Int) /* extends AnyVal */ {
    def sq = x * x
    def sq3 = x * x * x
  }

  def container() = {
    println(3.sq)
    println(3.sq3)
  }

  container()
}
