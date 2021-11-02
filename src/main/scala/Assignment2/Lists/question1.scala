package Assignment2.Lists

/*
Input Format
The first line contains the integer where is the number of times you need to repeat the elements.
The next lines each contain an integer. These are the elements in the array.
Output Format
Output each element of the original list times, each on a separate line. You have to return the list/vector/array of integers. The relative positions of the values should be the same as the original list provided in the input.
Sample Input
Number of times to repeat an integer  3
Elements in an Array [1, 2, 3, 4]

 */
object question1 extends App {
  def printNDuplicates(x: Int, arr: List[Int]): List[Int] =
    arr.flatMap(List.fill(x)(_))

  println(printNDuplicates(10, List(1, 2, 3)))
}
