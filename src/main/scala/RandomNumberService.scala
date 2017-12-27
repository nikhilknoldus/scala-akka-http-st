/**
  * Created by knoldus on 29/6/17.
  */
trait RandomNumberService {
  def rand: Double =  {
    Math.random()
  }
}

trait UsersList {
  val users: List[String] = List("mike", "jyo", "nikaa")

  val marks: List[Int] = List(12,34,546,67)

  def listUsersFun() = {
    users.filter(answer => answer.endsWith("aa"))
  }

  def listMarks(): List[Int] = {
    for(n <- marks){
      print(n)
    }
    marks.filter( answer => answer > 10)
  }

  def matchCaseMarks(marks:Int) = {

    marks match  {
      case 70 => "Nod Found"
      case 12 => "Yes found"
      case _ => "List is available"
    }
  }
}
