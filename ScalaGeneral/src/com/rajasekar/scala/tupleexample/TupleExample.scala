package src.com.rajasekar.scala.tupleexample

object TupleExample extends App{

  val stuff = (42,"stuff")
  println(stuff.getClass)
  println(s"The first element in the tuple ${stuff._1}")
  println(s"The first element in the tuple ${stuff._2}")

  val(name,age,sex) = ("Raja","23","Male")
  println(s"The name value $name")

}
