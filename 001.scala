// https://docs.scala-lang.org/tour/basics.html
// https://docs.scala-lang.org/tutorials/scala-for-java-programmers.html
// Read-studying code and study-coding in the browser thingy.
// https://scastie.scala-lang.org/pEBYc5VMT02wAGaDrfLnyw
//
import scala.collection.mutable.ArrayBuffer

trait Pet:
  val name: String

class Cat(val name: String) extends Pet
class Dog(val name: String) extends Pet

trait Iterator[A]:
  def hasNext: Boolean
  def next(): A

class IntIterator(to: Int) extends Iterator[Int]:
  private var current = 0
  override def hasNext: Boolean = current < to
  override def next(): Int = 
    if hasNext then
      val t = current
      current += 1
      t
    else
      0
end IntIterator

@main def run() =
  println("Hello, World!")
  // VALues and VARiables
  val constant = 1
  // constant = 2 this will break things
  var variable: Int = 2 - 1
  println(variable)
  variable = 3
  println(variable)
  // The result of the last expression in the block is the result of the overall block, too:
  println({
    val eq = "="
    eq * 7
  })
  val addOne = (x: Int) => x + 1
  println(addOne(56))
  val iterator = new IntIterator(10)
  for
    i <- 0 to 10
  do
    println(i * i)

  val dog = Dog("Harry")
  val cat = Cat("Sally")
  val animals = ArrayBuffer.empty[Pet]
  animals.append(dog)
  animals.append(cat)
  animals.foreach(pet => print(pet.name))  // Prints HarrySally
   