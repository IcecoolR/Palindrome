

object Palindrome {
  
  def main(args: Array[String]): Unit = {
    
    val text = scala.io.StdIn.readLine("Palindrome test: ")
    
    println(Palindrome(text))
    
  }
  
  def Palindrome(x: Any): Boolean = {
        
    return x match {      
      case xs: String => if (xs == xs.reverse) true else false
      case xs: Integer => if (xs.toString() == xs.toString().reverse) true else false
      case _ => false
    }
    
  }
  
}