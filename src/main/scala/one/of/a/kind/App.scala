package one.of.a.kind

import scala.io.Source

object App {
  def main(args: Array[String]) {
    if(args.isEmpty) {
      println("Usage: cat <textfile>")
      return
    }
    println(Source.fromFile(args(0)).getLines().mkString("\n"))
  }
}
