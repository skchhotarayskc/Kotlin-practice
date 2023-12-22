// fun main() {
//     println({ string: String -> string.uppercase() }("sushant"))

//     val uppercaseString = { string: String -> string.uppercase() }
//     println(uppercaseString("priyanka"))

//     val numbers = listOf(1, 2, -3, 4, -5, 10, -7)
//     val positives = numbers.filter { x -> x > 0 }
//     val negetives = numbers.filter { x -> x < 0 }

//     println(positives)
//     println(negetives)

//     val doubled = numbers.map {x -> x * 2}
//     val trippled = numbers.map { x -> x * 3 }
//     println(doubled)
//     println(trippled)

//     val upperCaseString1: (String) -> String = {string -> string.uppercase()}
//     println(upperCaseString1("ilu"))
// }

fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> {value -> value*60*60}
    "minute" -> {value -> value*60}
    "second" -> {value -> value}
    else -> {value -> value}
}

fun main(){
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
}