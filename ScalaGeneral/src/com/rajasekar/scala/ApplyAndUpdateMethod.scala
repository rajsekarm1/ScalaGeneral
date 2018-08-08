package src.com.rajasekar.scala

class ApplyAndUpdateMethod(val strArray:Array[String]) {

  def apply(index:Int): String = {
    strArray(index)
  }

  def update(index:Int,newValue:String):Unit = {
    strArray(index) = newValue
  }

  override def toString: String = {
    strArray.mkString(",")
  }

}


object ApplyAndUpdateMethod extends App {

  def apply(strArray:Array[String]):ApplyAndUpdateMethod = {
    new ApplyAndUpdateMethod(strArray)
  }

  val _instance:ApplyAndUpdateMethod = ApplyAndUpdateMethod(Array("One","Two","Three"))
  println(_instance(0))
  _instance(1)="two"
  println(_instance)
}
