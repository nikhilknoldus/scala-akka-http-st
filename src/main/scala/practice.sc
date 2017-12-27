


















def isPali(a:List[Int]): Unit = a match {
  case Nil => println("Empty List")
  //case oneEle => if(a.length == 1) println("It's Pali")
  case check => {
    var x = a
    var y = a.reverse
    if (x == y) println("pali") else println("its not")
    println(x + "asdfas df"+ y)
  }
}

isPali(List(1,2,5,1))