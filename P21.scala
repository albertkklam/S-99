// P21.scala
// Insert an element at a given position into a list

object P21 {
	def insertAt[A](element: A, n: Int, l: List[A]): List[A] = (l.take(n) :+ element) ::: l.drop(n)
}