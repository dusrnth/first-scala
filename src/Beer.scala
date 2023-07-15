import scala.io.Source

object Beer {
  def main(args: Array[String])= {
    2 to 6 foreach { n => println(s"$n bottles of beer on the wall")}

    val authorsToAge = Map("Raoul" -> 23, "Mario" -> 40, "Alan" -> 53)
    val authors = List("Raouol", "Mario", "Alan")

    val numbers = Set(1, 2, 3, 4)
    val newNumbers = numbers + 6
    println(newNumbers)
    println(numbers)

    val fileLines = Source.fromFile("data.txt").getLines().toList
    val linesLongUpper = fileLines.filter(l => l.length() > 10).map(l => l.toUpperCase())
    val linesLongUpper2 = fileLines filter(_.length() > 10) map(_.toUpperCase())
  }
}
