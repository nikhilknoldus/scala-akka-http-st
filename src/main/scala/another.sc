
def flat(a:List[Any]): List[Any] = a flatMap {
  case x: List[Any] => flat(x)
  case y => List(y)
}

flat(List(List(1, 1), 2, List(3, List(5, 8))))


var l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
println("answer list is "+ l.distinct)

