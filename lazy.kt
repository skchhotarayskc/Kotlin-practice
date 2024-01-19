fun main(){
    val x: String by lazy {
        println("Lazy")
        "Skc"
    }

    println(x)
    println(x)
}

class Mentor{

}

// lazy in Kotlin is useful in a scenario when we want to create an object inside a class, but that object creation is expensive and that might lead to a delay in the creation of the object that is dependent on that expensive object.

// class Session{
//     private val mentor: Mentor = Mentor()
// }

// Suppose Mentor is an expensive object. And Session is the object that is dependent on the Mentor object. If Mentor object creation takes time, it will delay the creation of Session object.

class Session{
    private val mentor: Mentor by lazy { Mentor() }
}

// The object mentor will get initialized only when it is accessed for the first time, else it will not get initialized.

// It will lead to the fast creation of the Session object in the above example because the Mentor object will not get initialized unnecessarily during the object creation of Session. It will get initialized when it is accessed for the first time.