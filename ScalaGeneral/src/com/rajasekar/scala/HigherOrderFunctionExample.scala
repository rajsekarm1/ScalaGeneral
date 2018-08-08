package src.com.rajasekar.scala

object HigherOrderFunctionExample extends App{

  def by2 = (y:Int) => y *2

  println(multiplyBy(6,by2))

  def multiplyBy(x:Int, f: Int => Int):Int ={
        f(x)
  }

}
