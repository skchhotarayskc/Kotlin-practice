fun main(){
    // val a = 1
    // val b = 2
    // println(if(a>b) a else b)

    // var obj = "1"

    // when(obj){
    //     "1" -> println("One")
    //     "Hello" -> println("Hello")
    //     "SKC" -> println("SKC")
    //     else -> println("Unknown")
    // }

    // obj = "SKC"
    // val result = when(obj){
    //     "1" -> "One"
    //     "Hello" -> "Hello"
    //     "SKC" -> "Sushant Kumar Chhotaray"
    //     else -> "Unknown"
    // }
    // println(result)


    // val temp = 18

    // val description = when{
    //     temp < 0 -> "Very Cold"
    //     temp < 10 -> "A bit cold"
    //     temp < 20 -> "Warm"
    //     else -> "Hot"
    // }
    // println(description)

    // for(x in 1..9){
    //     print("$x  ")
    // }
    // println()
    // for(x in 1..<5){
    //     print("$x  ")
    // }
    // println()
    // for(x in 4 downTo 1){
    //     print("$x  ")
    // }
    // println()
    // for(x in 1..10 step 2){
    //     print("$x  ")
    // }
    // println()
    // for(x in 8 downTo 0 step 3){
    //     print("$x  ")
    // }
    // println()
    // for(x in 'a'..'m'){
    //     print("$x  ")
    // }
    // println()
    // for(x in 'z' downTo 'p'){
    //     print("$x  ")
    // }
    // println()
    // for(x in 'z' downTo 'j' step 2){
    //     print("$x  ")
    // }

    // val cakes: List<String> = listOf("carrot", "cheese", "chocolate")

    // for(cake in cakes){
    //     println("yummy, it's a $cake cake!")
    // }

    // var x = 0
    // while(x <= 10){
    //     print("${x++}  ")
    // }

    val button = "A"
    var res = when(button){
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    }
    println(res)
}