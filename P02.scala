// P02.scala
// Find the second-last integer of a list of integers

object P02 {
	def penultimate(l: List[Int]): Int = {
		return l.apply(l.length - 2)
	}
}
