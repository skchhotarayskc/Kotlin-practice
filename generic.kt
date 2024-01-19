class A(text: String){
    var x = text
    init{
        println(x)
    }
}

class B<T> (text: T){
    var x = text
    init{ 
        println(x)
    }
}

fun main(){
    var name: A = A("Sushant")
    // var rank: A = A(12) // gives compile time error
    
    var fName: B<String> = B<String>("SKC")
    var fRank: B<Int> = B<Int>(12)
}