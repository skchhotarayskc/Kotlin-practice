fun main(){
    val x: String by lazy {
        println("Lazy")
        "Skc"
    }

    println(x)
    println(x)
}