package src.com.rajasekar.scala.futureexample

object AwaitResult extends App {

 val abc:String = "abc"
 val xyz:String = "abc"

 if(abc==xyz){
  println("yes it is true")
 }
 val eventName:Option[String] = None
 val alarmName:Option[String] = None
 if(eventName.isDefined){
  println("Yes defined")
 }else{
  println("No Defined")
 }

  val str:String = "ramkuamr"
  println(s"the str value$str endofstring")

}
