// P15.scala
// Duplicate the elements of a list a given number of times

object P15 {
	def duplicateN[A](n: Int, l: List[A]): List[A] = l match {
		case Nil => Nil
		case head :: tail => List.fill(n)(head) ::: duplicateN(n, tail)
	}
}
