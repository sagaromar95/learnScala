package Assignment2.Arrays

object question2 extends App {
      def getMaxProductOfTwoElements (array : Array[Int]) : Int = {

        if (array.length == 0) return 0
        else if (array.length == 2) return array(0) * array(1)
        // remove duplicates
        val sortedArray : Array[Int] = array.toSeq.sorted.toArray
        sortedArray(sortedArray.length - 1) * sortedArray(sortedArray.length - 2)

      }

      def getMaxProductWithoutAnyApis (array : Array[Int]) : Int = {

        if (array.length == 0) return 0
        else if (array.length == 2) return array(0) * array(1)

        var a = array(0)
        var b = array(1)

        for(i <- 0 to array.length-1) {
          for (j <- i + 1 to array.length-1) {
            if (array(i) * array(j) > a * b) {
              a = array(i)
              b = array(j)
            }
          }
        }
        a * b
      }
      println(getMaxProductOfTwoElements(Array(2, 3, 5, 7, -7, 5, 8, -5)))
      println(getMaxProductWithoutAnyApis(Array(2, 3, 3)))
}
