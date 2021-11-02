package Assignment3

/*
1.	Write a function literal that takes two integers and returns the higher number.
    Then write a higher-order function that takes a 3-sized tuple of integers plus this function literal and uses it to return
    the maximum value in the tuple.
 */
object question1 extends App{

  def functionLiteral (a : Int, b: Int) : Int = {
    if (a >= b) return a
    else b
  }

  def hofLiteral (f : (Int,Int) => Int, sizedThreeTuple : (Int, Int, Int)) : Int = {
       f(f(sizedThreeTuple._1,sizedThreeTuple._2),sizedThreeTuple._3)
    }

  println(hofLiteral(functionLiteral,Tuple3(8,9,11)))
}