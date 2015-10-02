package org.hrscala.implicitly_october

import rapture.json._
import jsonBackends.jackson._
import rapture.core.modes.returnTry._
//import rapture.core.modes.returnOption._

object Tut03_Behaviors extends App {

  val hw = Json.parse("""

  [{"hello":
    "world!"}, 1

    2]

  """)

  println(hw)
}
