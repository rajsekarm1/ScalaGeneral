package src.com.rajasekar.scala

object ArrayExample extends App {

  var strArray:Array[String] = Array("one","two","three")

  strArray(0) = "ONE"

  strArray.foreach(println _)

  var intArray:Array[Int] = Array(1,2,3)

  for((str,intValue) <- (strArray,intArray).zipped){
    println(s"$str          $intValue")
  }
}
