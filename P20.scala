// P20.scala
// Remove the Kth element from a list

object P20 {
	def removeAt[A](k: Int, l: List[A]): (List[A], A) = (l.take(k) ::: l.drop(k + 1), l(k))
}
