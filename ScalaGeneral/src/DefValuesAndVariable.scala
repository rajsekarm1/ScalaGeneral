

object DefValuesAndVariable {
  
  def main(str : Array[String]) : Unit = {
  
    var outerInt:Int = 100
    var expResult = { var innerInt:Int = 20; innerInt*outerInt}
    println(s"The value of the sum of both $outerInt and as well as Inner Int $expResult")
  }
}