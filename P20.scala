// P20.scala
// Remove the Kth element from a list

object P20 {
	def removeAt[A](r: Int, l: List[A]): (List[A],A) = {
		(l.take(r) ::: l.drop(r + 1), l(r))
	}
}