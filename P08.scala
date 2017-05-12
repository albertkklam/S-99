// P08.scala
// Eliminate consecutive duplicates of list elements

object P08 {
	def compress[A](l: List[A]): List[A] = l match {
		case Nil => Nil
		case head :: tail => head :: compress(tail filterNot(_ == head))
	}
}
