package learning

object String {
   
    val str1 = "Hi Cindy where are we going today?"
    val str2 = Basic.mike + ": " + Basic.addTen(Basic.age) + ", " + Basic.hasWife
   

    // String methods
    val equalsIgnoreCase = "mike equals MIKE: " + "mike".equalsIgnoreCase("MIKE")
    val contains = "\"Mai Wang\" contains \"Wang\"" + "Mai Wang".contains("Wang")
    val length = "\"four\" has length: " + "four".length
    val replace = "Mike/Sam/Smith".replace("/", " ")
    def split = "cindy,21,student".split(',').foreach(println)
    val startsWith = "http://cindyfeng".startsWith("http://")
    val toLowerCase = "CINDY FENG".toLowerCase
    val toUpperCase = "cindy feng".toUpperCase
    val trim = "    cindy feng    ".trim

    val url1 = "https://music.com"
    val url2 = "HTTPS://tv.com"
    val url3 = "  https://supermarket.com"

    def isHttps(url: String): Boolean = url.trim.toLowerCase.startsWith("https")
}
