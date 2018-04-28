// P07.scala

// Flatten a nested list structure

object P07 {
	def myFlatten(l: List[Any]): List[Any] = l.flatMap {
		case lists: List[_] => myFlatten(lists)
		case elements => List(elements)
	}
}

