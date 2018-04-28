// P06.scala

// Find out whether a list of integers is a palindrome
object P06 {
	def isPalindrome(l: List[Int]): Boolean = {
		return l.reverse == l
	}
}