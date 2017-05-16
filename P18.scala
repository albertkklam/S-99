// P18.scala
// Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list

object P18 {
	def slice[A](start: Int, end: Int, l: List[A]): List[A] = l.drop(start).take(end - start)
}
