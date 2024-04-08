// https://docs.scala-lang.org/tour/basics.html
// https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html
// Read-studying code and study-coding in the browser thingy.
// https://scastie.scala-lang.org/pEBYc5VMT02wAGaDrfLnyw
//
class Point(val x: Int, val y: Int)
val point = Point(1, 2)
point.x = 3  // <-- does not compile

class Point(x: Int, y: Int)
val point = Point(1, 2)
point.x  // <-- does not compile
// Primary constructor parameters with val and var are public. However, because vals are immutable, you can’t write the following.