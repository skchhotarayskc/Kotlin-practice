fun main(){
    var x: String
    x = "Sushant"
    println(x)
    x = "skc"
    println(x)

    val y: String
    y = "Sanjukta"
    println(y)
    // y = "sds"
    // println(y)

    lateinit var z: String
    z = "nksd"
    println(z)
    z = "sdsd"
    println(z)
}

// lateinit in Kotlin is useful in a scenario when we do not want to initialize a variable at the time of the declaration and want to initialize it at some later point in time, but we make sure that we initialize it before use.

// The lateinit keyword says to compiler that: let them declare it for now, I assure you they will initialize it before accessing or using it.

// lateinit is used specifically for mutable properties (variables), and it is applicable only for non-null types. The property must be declared with the var keyword (mutable).