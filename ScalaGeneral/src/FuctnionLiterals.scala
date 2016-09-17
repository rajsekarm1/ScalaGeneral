

object FuctnionLiterals {
 
  def main(str:Array[String]):Unit={
    val list = List.range(1, 10)
    val evenList = list.filter(_%2==0)
    print(list)
    println(evenList)
  }
  
  def singleLineMethod() = "Say Hello"
  
  def singleLineMethodWoParanthesis ="Hello"
  
}