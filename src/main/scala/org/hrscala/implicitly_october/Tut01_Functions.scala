package org.hrscala.implicitly_october

class MyFirst {
  implicit def ImasaoenukhgacrounoheutringLength234234Adaper(x: String) = x.length + 3
}

class MySecond extends MyFirst {
  implicit def Imas12345aoenukhgacrounoheutringLength234234Adaper(x: String) = 1337
}

class MyFirst2 {
  implicit def name(x: String) = x.length + 3
}

class MySecond2 extends MyFirst2 {
  implicit override def name(x: String) = 1337
}

object Tut01_Functions extends App {

  new MySecond2 {
    val a: Int = "123432"
    println(a)
  }

  def printBigInt(bi: BigInt) = println(bi)
  printBigInt(123)

  implicit def ImasaoenukhgacrounoheutringLength234234Adaper(x: String) = x.length + 3

  def ImtakinganInt(x: Int) = println("I got: " + x)

  println(ImtakinganInt("Heya!"))
}
