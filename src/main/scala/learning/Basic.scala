package learning

object Basic {
  // basic types
  val int: Int = 1
  val double: Double = 3.14
  val string: String = "Hi Cindy"
  val boolean: Boolean = true

  // examples
  val age: Int = 29
  val mike: String = "Mike Smith"
  val hasWife: Boolean = true

  // functions
  def addOne(n: Int): Int = n + 1
  def addTen(n:Int): Int = n + 10
  def add(n: Int, m: Int): Int = n + m

  def add2(n: Int)(m: Int): Int = n + m
  def addTen2: Int => Int = add2(10)
  def addHundred: Int => Int = add2(100)
}
