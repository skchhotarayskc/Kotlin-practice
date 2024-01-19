// const name = "Kotlin" //syntax error
// const val should be always declared at the top level (global)
const val name = "Kotlin" // okay

// const val funName = getName() 
// Const 'val' initializer should be a constant value that is it has to be initialized at the compile time not at the run time 

fun main(){
    val courseName = "Android" // okay

    println(name) 
    println(courseName)

    val funCourseName = getCourseName()
    println(funCourseName)
    
}

fun getName(): String{
    return "Kotlin"
}

fun getCourseName(): String{
    return "Android"
}