

object AssigningFunctionToValues {
  
  var methodVar:(Double) => String = convertToString
  
  def convertToString(doubleValue:Double) :String ={
    return doubleWrapper(doubleValue).toString()
  }
}