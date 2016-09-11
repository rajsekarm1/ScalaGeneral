

object Hello {
  def main(args: Array[String]):Unit = {
    var value = "rajasekar"
    var value2 ="checking"
    value = "chvalue"
    /*print(value)
    print("Hello World")*/
    /*print(value+value2)
    var multilineString = """ line1
                        |line 2
                        |line 3
                        |line 4"""
    
    print(multilineString);*/
    
    var placeholderString = " $name show welcome message"
    var name = "rajasekar"
    //print(f"placeholderString ${name*2}");
    //print(anyValueFuncWithParam(5, 6));
    printAny("rajasekar");
    printTest("ramkumar")
    testNullornull(null);
    var stringvalue:String = null;
    
  }
  def testNullornull(nullVar:Null){
    print("rajasekar")
  }
  def printTest(test:Any) = print(test)
  def printAny(any:Any):String = {
    println(any)
    return "rajasekar"
  }
  
  
  
  def anyValueFuncWithParam(a:Int, b:Int): AnyVal = {
      var sum:Int = a+b
      return sum
      
  }
  
  def anyValueFunc(): AnyVal =  {
    return 1
  }
}