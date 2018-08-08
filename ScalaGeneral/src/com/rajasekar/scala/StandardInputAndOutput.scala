package src.com.rajasekar.scala

import scala.io.StdIn

object StandardInputAndOutput extends App {
  println("Enter the name")
  val name = StdIn.readLine()
  println(s"Print the name:${name}")
}
