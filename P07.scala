// P07.scala
// Flatten a nested list structure

object P07 {
	def flatten(l: List[Any]): List[Any] = l.flatMap {
		case lists: List[_] => flatten(lists)
		case elements => List(elements)
	}
}
