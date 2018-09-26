package src.com.rajasekar.scala

import java.io.File

import scala.io.Source

object FileOperations extends App{
  val source = Source.fromFile("testing.properties")
  val str:String=source.getLines().mkString
  //println(str)
  println(countLines1(source))

  println(listFile(new File("D:\\gitrepo\\aos-common-cim-aos-model\\adva-f3-pronidvm-cim\\src\\main\\model"),List[String]("yang")))

  def countLines1(source:Source):Long ={
    val NEWLINE = 10
    var newLineCount = 0L
    /*for {
      line <- source
      c <- line
      //if char.toByte ==NEWLINE
    } newLineCount + 1*/
    newLineCount
  }


  def listFile(dirName:File,extension:List[String]):List[String] = {
    dirName.listFiles().filter(data => {
        println("First filter")
        data.isFile
      }).toList.filter(data => {
        println("Second for")
        extension.exists(data.getName.endsWith(_))
    }).map(_.getName).toList
  }

}
