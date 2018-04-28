// P17.scala
// Split a list into two parts

object P17 {
	def split[A](n: Int, l: List[A]): (List[A],List[A]) = l.splitAt(n)
}