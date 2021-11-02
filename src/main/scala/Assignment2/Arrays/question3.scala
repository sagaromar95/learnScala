package Assignment2.Arrays

class question3 extends App {
  def maxDifference(array : Array[Int]) : Int = {
    var maxValue : Int = Int.MinValue
    if (array.length == 0) return 0
    for (i <- 0 to array.length - 1) {
      for(j <- i+1 to array.length - 1){
        if(array(j) > array(i) && (array(j) - array(i) > maxValue)){
          maxValue = array(j) - array(i)
        }
      }
    }
    maxValue
  }

  println(maxDifference(Array(0, 3, 1, 7, 9, 5, 11, 3, 5)))
}
