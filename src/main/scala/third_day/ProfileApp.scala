package third_day

import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks


class Person(age: Int, name: String, place: String) {
  override def toString = age + " " + name + " " + place
        def this(age: Int, name: String) = {
          this(age, name, "Pune")
        }
}

object ProfileApp extends App
{
  var detailsListBuffer = ListBuffer[Person]()
  var break = new Breaks

  while (choice((startPoint()))!=0)
  { }

  def startPoint(): Int =
  {
    println("Welcome to App")
    println("1. add your information  2. Display your info   3.Edit your age and name")
    println("enter your choice")
    var x = readInt();
    return x;
  }

  def fillingList(x:Person): Unit =
  {
    println(">>> x: "+ x)
    detailsListBuffer = detailsListBuffer :+ x
  }

   def getPersonInfo(): (Int,String,String)=
  {
    println("enter your age");
    var age = readInt();
    println("enter your name");
    var name = readLine();
    println("enter your place ")
    var place = readLine();
    (age,name,place)
  }

  def getUpdatePersonInfo(): (Int,String)=
  {
    println("enter your update age");
    var age = readInt();
    println("enter your update name");
    var name = readLine();
    (age,name)
  }

  def choice(x:Int): Unit = x match
  {
        case 1 => {
          println("add ur info");
          var result = getPersonInfo();
           var newUser = new Person(result._1,result._2,result._3)
          fillingList(newUser);
        }

        case 2 => {
          println("Info to Display");
          println(">>>>>>: YOUR DATA = >>>"+ detailsListBuffer.toString())
        }

        case 3 => {
          println("selected to Edit data")
          var result = getUpdatePersonInfo()
          var updateNewUser = new Person(result._1,result._2);
          fillingList(updateNewUser);
        }

        case 0 => break;
  }
}




