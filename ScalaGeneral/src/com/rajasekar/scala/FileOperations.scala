package src.com.rajasekar.scala

import scala.io.Source

object FileOperations extends App{
  val source = Source.fromFile("testing.properties")
  source.getLines().foreach(println _)


}
