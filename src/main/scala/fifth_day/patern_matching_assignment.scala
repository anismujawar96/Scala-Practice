package fifth_day


trait Furniture

case class Table(color:String,leg:Int) extends Furniture
case class Sofa(color: String,leg:Int,length: Int) extends Furniture
case class Chair(color:String,leg:Int,height:Int) extends Furniture


object test extends App{

  def matchFurniture(x: Furniture) = {
    x match {
      case Table(c,l) =>"color is "+c+ " == legs are "+l
      case Sofa(c,l,le) =>"color is "+c+ " == legs are "+l+ " == length is "+le
      case Chair(c,l,h) =>"color is "+c+ " == legs are "+l+ " == length is "+h
      case _ => "Only Furniture without any Specification"
    }
  }
  println(matchFurniture(Table("red",4)));
  println(matchFurniture(Sofa("grey",6,20)));
  println(matchFurniture(Sofa("black",2,10)));
}



