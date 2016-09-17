

object ForLoopExample {
  def main(args: Array[String]): Unit = {
      var strList:List[String] = List("one","two","three","four","five")
      
      var str1List = for( str <-strList) yield{
         str.concat("raja")
      }
      
      print(str1List)
      
      for(counter <- 1 until 3){
        println(counter)
      }
  }
}