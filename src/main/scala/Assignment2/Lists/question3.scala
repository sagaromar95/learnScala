package Assignment2.Lists

/*
Count the number of elements in an array without using count, size or length operators (or their equivalents).
Input Format
A list of integers is given in Sample Input.
Output Format
Output a single integer, the length of the list that was provided as input.
Sample Input
List [2, 5, 1, 4, 3, 7, 8, 6, 0, 9]
Sample Output
10
 */
object question3 extends App {

  def countElementsInList(elementList: List[Int]): Int = {
    var count: Int = 0;
    for (elem <- elementList) {
      count = count + 1
    }
    count

  }

  println(countElementsInList(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
}
