package Assignment3
/*
  Let’s say that you happened to run across this function while reviewing another developer’s code:
  def fzero[A] (x: A) (f: A => Unit): A = {f(x); x}
  What does this function accomplish? Can you give an example of how you might invoke it?
 */
object question4 extends App {
    def fzero[A] (x : A) (f : A => Unit) : A ={
      f(x)
      x
    }

    def returnsUnit[A] (x : A) : Unit = {
      println("Sagar")
    }

  val returnFunctionDefReturnsUnit = fzero(7)(returnsUnit)
  println(returnFunctionDefReturnsUnit)

}
