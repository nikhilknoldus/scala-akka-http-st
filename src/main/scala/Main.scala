import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._


object Main extends App with RandomNumberService with UsersList {

 implicit val actor = ActorSystem("myActor")

 implicit val matrlzer = ActorMaterializer()

  val port = 9090

  val randNumRoute: Route =
    path("rand" / "num") {
      get {
        complete{
          "Random Number :" + rand
        }
      }
    }

  val testRoute: Route =
    path("user" / "detail") {
        get {
          complete{
            "Route hit"
          }
        }
    }


  val listNamesRoute: Route =
    path("users" / "list") {
     get {
       complete {
         "data" + listUsersFun().asJson
       }
     }
    }

  val listMarksRoute: Route =
    path("users" / "marks") {
      get {
        complete {
          "data" + listMarks().asJson
        }
      }
    }

  val caseRoute: Route =
    path("match" / "case") {
      get {
        parameters("marks") { marks =>
          complete {
            "Match Case :" + matchCaseMarks(marks.toInt)
          }
        }
      }
    }


  val addUser: Route =
    path("user" / "add") {
      (post & entity(as[String])) { data =>
        //If you want to give url parameter mandatory parameter
        parameter("accessToken") { accessToken =>
          complete {
            //"Data : " + data + accessToken
            "User stored !!"
          }
        }
      }
    }


  val routes = testRoute ~ randNumRoute ~ addUser ~ listNamesRoute ~ listMarksRoute ~ caseRoute

  Http().bindAndHandle(routes,"localhost",port)
  println(s"Application started at $port")
}
