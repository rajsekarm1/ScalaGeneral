package src.com.rajasekar.scala.classexample

class A {
  def Amethod():Unit = {
    println("A class Amethod")
  }
}

object A {
  def AObj(): Unit ={
    println(s"AObject")
  }
}

class B extends A {
  override def Amethod():Unit = {
      println("B class Amethod")
      A.AObj()
  }
}

class C extends B {
 // override def Amethod(): Unit = super[A].Amethod()
}




object ClassExample extends App{
    val c:C= new C()
  c.Amethod()
}
