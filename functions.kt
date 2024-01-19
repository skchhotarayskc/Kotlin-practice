fun main(){
    val x = 3
    val y = 4
    println(summ(x, y))
    println(sub(x,y))

    printMessage(prefix = "World", message = "Hello")
    printMessage2(prefix = "World", message = "Hello")
    printMessage2(message = "Hello")
}

fun summ(a: Int, b: Int): Int = a+b

fun sub(a: Int, b: Int): Int = a-b

fun printMessage(message: String, prefix: String){
    println("[$prefix] $message")
}

fun printMessage2(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}