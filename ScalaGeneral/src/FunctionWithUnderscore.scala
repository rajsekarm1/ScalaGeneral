

object FunctionWithUnderscore {
  def main(str:Array[String]):Unit ={
    val assignedtest2 = test1
    
    println("Testing")
    println(assignedtest2)
    val (x,y,z) = returnTuple()
    println(x)
    println(y)
    println(z)
  }
  
  def test1 = (str:String) => str+ str
  
  
  
  def test2(x:Int,y:Int) :Unit ={
    println(x+y)
  }
  
  def returnTuple()={
    (100,101,103)
  }
  
  //def main(str:Array[String]):Unit={
}