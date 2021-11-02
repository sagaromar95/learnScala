package Assignment2.Lists

object question4 extends App {

  def replaceWithAbsoluteValueWithAbsFunciton(elementsList: List[Int]): List[Int] = {
    elementsList.map(Math.abs(_))
  }

  println(replaceWithAbsoluteValueWithAbsFunciton(List(7, 8, 9, -1, -2, -3)))
}
