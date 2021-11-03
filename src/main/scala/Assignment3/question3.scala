package Assignment3

object question3 extends App {
      def hof (a : Int) : (Int => Int) = x => a * x
      // so basically hof takes a Int in this case it took 7 as a parameter
      // and returned me a function which internally looks like this
      // x => 7 * x
      // then apply 6 to this function which will return 42
      println(hof(7)(6)) // curried function
      // or store the function in a variable
      val returnedFunctionFromHof = hof(7)
      // then apply 6 to returnedFunctionFromHof like this
      println(returnedFunctionFromHof(6))

}
