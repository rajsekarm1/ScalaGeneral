package src.com.rajasekar.scala.jsonexample

import scala.collection.mutable.ListBuffer

object MapToJsonConversion extends App {

  var fruits = new ListBuffer[Map[String,Any]]()
  fruits += Map("1"-> "One")
  fruits += Map("2"-> "Two")
  //fruits += "Orange"
  fruits.toMap
  println(fruits.toSet)

  def func1(key:String, value:Any):String = {
    key
  }
}