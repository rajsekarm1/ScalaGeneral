

object PatternGuardsAndOrExpression {
  
  def main(args:Array[String]) :Unit={
    println("Testing")
    
    var day:String = "sfsafasd"
    var otherDay:String =""
    
    var strValue:String = day match {
      case "Monday" => "MONDAY"
      case  "Tuesday" | "Wednesday" => "Tuesday & Wednesday"
      case otherD if(otherD == "Thursday" || otherD == "Friday") => "Other Day"
      case _ => "Other than above case matches"
    }
    println(strValue)
  }
}