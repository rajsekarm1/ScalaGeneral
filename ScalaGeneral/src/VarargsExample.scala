

object VarargsExample {
  def main(str: Array[String]) :Unit={
    //println("Rajasekar")
    varArgumentMethod("a","b","c");
    varArgumentMethod("d","e","f","g")
  }
  
  def varArgumentMethod(varArgs:String*){
    for(vararg <- varArgs){
      println(vararg)
    }
  }
}