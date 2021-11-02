package Assignment2.Lists

/*
For a given list with integers, return a new list removing the elements at odd positions.
Input Format
integers contained in the list are given in Sample Input below
Output Format
Output the list with the integers at odd positions removed i.e., the first element, the third element and so on. The relative positions of the remaining even-position elements should be the same as they were in the original array. Each integer will be on a separate line.
NOTE: By odd positions, we mean the first, third, fifth, etc position of the array needs to be filtered out. As per programming language conventions, these might (and they often do) correspond to indices and so on.
Sample Input
List [ 2, 5, 3, 4, 6, 7, 8, 9]
Sample Output
5
4
7
9
 */
object question2 extends App {
  def removeOddPosElement(arr: List[Int]): Unit = {
    val finalList = arr.zipWithIndex.filter(_._2 % 2 == 0).map(_._1).toList
    finalList.foreach(println)
  }

  removeOddPosElement(List(1, 2, 3, 4, 5, 6))
}
