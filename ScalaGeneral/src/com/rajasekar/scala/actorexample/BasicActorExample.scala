package src.com.rajasekar.scala.actorexample

import akka.actor.{Actor, ActorSystem, Props}

class HelloActor extends Actor {

  override def receive: Receive = {
    case "hello" => println("Received hello message")
    case _ => println("Other Dummy message")
  }

}

object BasicActorExample extends App{
     val system = ActorSystem("HelloSystem")
    val helloActor = system.actorOf(Props[HelloActor])
  val strValue = helloActor.getClass.getName

  helloActor ! "hello"
  println(strValue)
  system.terminate()
}
