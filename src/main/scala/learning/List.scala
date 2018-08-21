package learning

object ListLearning {
    val intList: List[Int] = List(1, 2, 3, 5)
    val boolList: List[Boolean] = List(true, false)
    val stringList: List[String] = List("yesterday", "today", "tomorrow")

    val listLength: Int = intList.length

    val map1 = intList.map((x: Int) => x * x)

    val map2 = stringList.map(x => x.startsWith("t"))

    def foreach = map2.foreach(println)

    val filter = intList.filter(x => x < 3)
}