package Assignment1
/*
    Remove the character in a given position of a given string. The given position will be in the range 0...string length -1 inclusive.
    Input  Given String = “Scala”
    Expected Outputs  Sala, cala, Scal
 */

object question2 extends App {

  def removeCharAtIndex(word: String, index: Int): String = {
    if (index < 0 || index >= word.length) "Index out of Bound"
    else word.substring(0, index) + word.substring(index + 1, word.length)
  }

  println(removeCharAtIndex("Sagar", 3))
}
