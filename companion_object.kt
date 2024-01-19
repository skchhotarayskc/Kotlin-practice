class A{
    fun call() = println("Hello")
}

// Here we have created a class A and to access its members we have to create an instance of the class A then we can access all its properties. That's how normally things work

// But in kotlin we can directly access the properties of a class by the class name and for that we have to create a companion object

// Companion object is bassically associated with the class that is the properties declared inside the companion object are associated directly with the class not with its objects

class Employee{
    companion object{
        fun callMe() = println("I'm called")
        val x: Int = 123
    }
}

fun main(){
    val a = A()
    a.call()

    //accessing the properties of Employee via companion object
    Employee.callMe()
    println(Employee.x)
}