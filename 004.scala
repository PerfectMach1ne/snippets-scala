// https://docs.scala-lang.org/tour/basics.html
// https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html
// Read-studying code and study-coding in the browser thingy.
// https://scastie.scala-lang.org/pEBYc5VMT02wAGaDrfLnyw
//
class Point():
  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x: Int = _x // Getter
  def x_=(newValue: Int): Unit = // Setter; _= is part of special setter name syntax!! 
    if newValue < bound then
      _x = newValue
    else
      printWarning()

  def y: Int = _y // Getter
  def y_=(newValue: Int): Unit = // Setter; _= is part of special setter name syntax!! 
    if newValue < bound then
      _y = newValue
    else
      printWarning()

  private def printWarning(): Unit = 
    println("WARNING: Out of bounds!")
end Point

@main def run() = 
  val pt1 = Point()

  println(pt1.x)
  println(pt1.y)
  pt1.x = 99
  println(pt1.x)
  pt1.y = 100 // [0,100)
  println(pt1.y)