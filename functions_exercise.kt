import kotlin.math.PI
import uppercaseString

fun circleArea(radius: Int): Double{
    return PI*radius*radius
}

fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main(){
    println(circleArea(7))
    println(uppercaseString("hello"))
}
