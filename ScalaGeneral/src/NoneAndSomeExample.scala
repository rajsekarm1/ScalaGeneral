

object NoneAndSomeExample {
  
  def main(array:Array[String]):Unit ={
    val strOption = returnOptionalMethod(5)
    strOption match {
      case None => print("There is no value exists")
      case some => print(some.get)
      
    }
  }
  
  def returnOptionalMethod(a:Int):Option[String]={
    if(a==6){
      return Some("value is 5")
    }else{
      return None;
    }
  }
  
  
}