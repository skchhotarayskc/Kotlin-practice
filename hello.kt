fun main(){
    // val nums: List<Int> = listOf(1, 3, 5, 7, 30, 12)
    // var userInput = readLine()
    // if(userInput != null){
    //     try {
    //         val userNums = userInput.toInt()
    
    //         if(userNums in 1..100) println(true)
    //         else println(false)
    //     }
    //     catch(e: NumberFormatException) {
    //         println("Not a valid integer")
    //     }
    // }
    // else{
    //     println("Input is null")
    // }

    // val maxIntegerValue: Int = Int.MAX_VALUE
    // println(maxIntegerValue)

    // val name = '3'
    // println(name)


    // var x = 5
    // val y = 3

    // println("x + y = ${x + y}")
    // println("x - y = ${x - y}")
    // println("x * y = ${x * y}")
    // println("x / y = ${x.toFloat() / y}")
    // println("x % y = ${x % y}")

    // var result = x + y
    // result += 2
    // println(result)
    // result++
    // println(result)

    // println("result++ = ${result++}")
    // println(result)
    // println("++result = ${++result}")
    // println(result)

    // val nullableString: String? = null
    // println(nullableString?.length)
    println(sum(1,2))
}

fun sum(a: Int, b: Int): Int = a+b