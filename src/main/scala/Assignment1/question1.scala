package Assignment1
/*
    Create a new string which is 4 copies of the 2 front characters of a given string. If the given string length is less than 2 return the original string.
    Input  Given string = “India”
    Expected Output  In, In, In, In  InInInIn
 */
object question1 extends App {

  def printWordTailRecursively(word: String, times: Int, accumulator: String): String = {
    if (word.length < 2) word
    else if (times < 1) accumulator
    else printWordTailRecursively(word, times - 1, accumulator + word.substring(0, 2)) //end index in substring is not inclusive
  }

  println(printWordTailRecursively("Ramya", 4, ""))
}
