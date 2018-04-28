// P19.scala
// Rotate a list N places to the left

object P19 {
	def rotate[A](m: Int, l: List[A]): List[A] = {
		val n = if (l.isEmpty) 0 else m % l.length
		if (n >= 0) l.drop(n) ::: l.take(n)
		else l.takeRight(-n) ::: l.dropRight(-n)
	}
}