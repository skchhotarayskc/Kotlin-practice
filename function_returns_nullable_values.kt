fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if(x != null && y != null){
        println("The product is ${x * y}")
    }
    else{
        println("Either $arg1 or $arg2 is not a number")
    }
}

fun main(){
    printProduct("3", "5")
    printProduct("a", "7")
    printProduct("10", "c")
}