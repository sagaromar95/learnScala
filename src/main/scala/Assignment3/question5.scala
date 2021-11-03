package Assignment3

object question5 extends App {
    def conditional[A] (x: A,p : (A => Boolean),f : (A => A)) : A = {
        if(p(x)) f(x)
        else x
    }

    def predicateFunction[A] (x : A) : Boolean = {
       true
    }

    def functionF[A] (x: A) : A ={
        x
    }

    println(conditional(9,predicateFunction[Int],functionF[Int]))
}
