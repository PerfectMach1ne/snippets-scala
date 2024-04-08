// https://docs.scala-lang.org/tour/basics.html
// https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html
// Read-studying code and study-coding in the browser thingy.
// https://scastie.scala-lang.org/pEBYc5VMT02wAGaDrfLnyw
//
// Unified types - Any is the supertype of all and has two subclasses
// AnyVal for Scala object values, and AnyRef for java.lang.Object values (IF we're working with a JRE)
// Unified type examples: Double, Float, Int, Unit, Char, Boolean ,Byte, a few more
// https://docs.scala-lang.org/tour/unified-types.html
class User

class Point(var x: Int, var y: Int):

  def move(dx: Int, dy: Int): Unit =
    x = x + dx
    y = y + dy
    
  override def toString: String = 
    s"($x,$y)"

end Point

@main def run() = 
  val list: List[Any] = List(
    "a string",
    732,  // an integer
    'c',  // a character
    true, // a boolean value
    () => "an anonymous function returning a string"
  )

  list.foreach(element => println(element))

  val user1 = new User
  val user2 = User()
  val user3 = new User()
  val point = Point(5, 7)
  println(point.x + point.y)
  println(point.x.toString + point.y.toString)
  println(point)  