package Assignment1
/*
    Create a new string with the last char added at the front and back of a given string of length 1 or more.
    Input  Given String = “Scala”
    Expected Outputs  aScalaa

 */
object question3 extends App {

  def addLastCharAtEnds(word : String) : String ={
    word.charAt(word.length-1)+word+word.charAt(word.length-1)
  }

  println(addLastCharAtEnds("Ramya"))
}
