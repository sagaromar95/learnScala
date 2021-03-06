package Assignment3

import scala.math

/*
The library function util.Random.nextInt returns a random integer.
Use it to invoke the “max” function with two random integers plus a function that returns the larger of two given integers.
Do the same with a function that returns the smaller of two given integers, and then a function that returns the second integer
every time.
*/


object question2 extends App {
    def returnHighestAndLowest (f: (Int,Int) => Int,tup : (Int,Int,Int)) : Int = {
        println(tup)
        f(f(tup._1,tup._2),tup._3)
    }

   println(returnHighestAndLowest(math.max,Tuple3(util.Random.nextInt,util.Random.nextInt,util.Random.nextInt)))
   println(returnHighestAndLowest(math.min,Tuple3(util.Random.nextInt,util.Random.nextInt,util.Random.nextInt)))
}
