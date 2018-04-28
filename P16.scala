// P16.scala
// Drop every Nth element from a list

object P16 {
	def drop[A](n: Int, l: List[A]): List[A] = {
		l.zipWithIndex.map{case (k,v) => (k,v+1)}.filter(_._2 % n != 0).map(_._1)
	}
}
 