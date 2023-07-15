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

    val raoul = ("Raoul", "+44 007007007")
    val mario = ("Mario", "+34 123456789")

    val tupleBooks = (2018, "Modern Java In ACtion", "Raoul-Gabriel Urma")
    val tupleNumbers = (24, 1337, 0, 3, 114)
    println(tupleBooks._2)
    println(tupleNumbers._4)
  }
}
