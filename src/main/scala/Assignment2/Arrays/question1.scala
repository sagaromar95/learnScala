package Assignment2.Arrays
/*
Replace every element with the next greatest element (from right side) in a given array of integers. There is no element next to the last element, therefore replace it with -1
Input à Array [9, 5, 8, 4, -10, 21, 6, 17, 11]
Output à Array [21, 21, 21, 21, 21, -1, 17, -1, -1]
 */

object question1 extends App {
      def replaceWithGreatestElement (array : Array[Int]) : Array[Int] = {
        var maxValue = Int.MinValue
        var flag = false
        for(i <- 0 to array.length - 1) {
          maxValue = Int.MinValue
          flag = false
          for (j <- i + 1 to array.length - 1) {
            if (array(i) < array(j) && array(j) > maxValue) {
                array(i) = array(j)
                maxValue = array(j)
                flag = true
            }
          }
          if(!flag) array(i) = -1
        }
        array
      }

  println(replaceWithGreatestElement(Array(9, 5, 8, 4, -10, 0, 6, -99, -33)).toList)
}
