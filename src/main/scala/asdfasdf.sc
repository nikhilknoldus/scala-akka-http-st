//import scala.collection.mutable.ArrayBuffer
//
//object Demo {
//  def main(args: Array[String]): Unit ={
//    println(matchTest(3))
//  }
//
//  def matchTest(a:Int) = a match {
//case  1 => println("1")
//case 2 => println("2")
//case _ => println("unknown")
//  }
//}


//class Point(val x: Int, y: Int)
//val point = new Point(1, 2)
//println("Value is " + point.x)


//finding the last element in the list
//def last(a:List[Int]): Unit = a match {
//  case Nil => 1
//  case last => println("Last Value is: " + a(a.length-1))
//  case _=> throw new NoSuchElementException("LIST IS EMPTY")
//}
//last(List(1,2,34,23));


//Finding the nth element given by user
//def nth(x: Int, a:List[Int]): Unit = a match {
//  case Nil => 1
//  case nth => println(" value is there "+ a.filter(z => z == x))
//}
//
//nth(3,List(2,3,4))


//finding the length of the list: tarika 1
//def listLength(aa:List[Int]): Unit = aa match {
//
//  case Nil => println("empty list")
//  case length  => println("the length is "+ aa.length)
//  case _ => "not possible"
//}
//listLength(List(12,12))
//listLength(List())
def pali(a: List[Int]): Unit ={
  val x = a.slice(0,a.length/2)
  val y = a.reverse
  if (x == y) println("pali") else println("its not")
}

def isPali(a:List[Int]): Unit ={
  case Nil => println("Empty List")
  case oneEle => if(a.length == 1) println("It's Pali")
  case check => pali(a)
}

isPali(List(1,2,1,1,2))

//reversing the list
//def reverserList (a: List[Int]): Unit = a match {
//  case Nil => println("Empty List")
//  case reverseList => println("Reverse List is " + a.sorted(Ordering.Int.reverse))
//}
//
//var ls = List(2,4,6)
//reverserList(List())
//

//finding the length of the list: tarika 2

//def listLength2( aaa:List[Int]): Unit = aaa match {
 // case Nil => 1
  //case listLength => aaa.filter()
//}


//
//trait Pet {
//  val name:String
//}
//
//class Cat(val name:String) extends Pet
//class Dog (val name:String) extends Pet
//
//val doggy = new Dog("Harry")
//val pussy = new Cat("Cheeni")
//
//var animals = ArrayBuffer.empty[Pet]
//
//animals.append(doggy)
//animals.append(pussy)
//
//animals.foreach(x => println(x.name))
//




