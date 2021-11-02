package Assignment1
/*
Create a new string where 'if' is added to the front of a given string. If the string already begins with 'if', return the string unchanged.
 */

object question4 extends App{
    def addIfAtBeginning(statement : String) : String ={
      if(statement.trim.toLowerCase().startsWith("if")) statement
      else s"If $statement"
    }
  println(addIfAtBeginning("iF Sagar"))
}
