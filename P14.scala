// P14.scala
// Duplicate the elements of a list

object P14 {
	def duplicate[A](l: List[A]): List[A] = l match {
		case Nil => Nil
		case head :: tail => head :: head :: duplicate(tail)
	}
}
