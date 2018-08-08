package src.com.rajasekar.scala

class ListExampleClass {

  var notInitilzeList:List[String] = List("raja")

}

object ListExample extends App{

  var strList:List[String] = List("one","two","three")

  //Defining empty list

  var emptyList:List[Int] = Nil



  //strList(0) = "ONE" //ERROR: Can't be update because simple List is immutable

  println(strList)

  strList = "ONE" :: strList

  println(strList)

  //Fill and Tabulate example

  val fillList = List.fill(10)(10)
  println(fillList)

  val tabulateList = List.tabulate(10)(x=>x*x)
  println(tabulateList)
}
