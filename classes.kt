class Contact(val id: Int, var email: String = "examples@gmail.com") {
    var category: String = "work"
    fun printContact() {
        println("ID : $id , Email : $email , Category : $category")
    }
}

// class Person {
//     var name: String = ""
//     var age: Int = 0

//     fun speak() {
//         println("Hello my name is $name and i am $age years old")
//     }
// }

class Student {
    var name: String = ""
    var age: Int = 0
    var roll: Int = 0

    // primary constructor with default values
    constructor()

    // secondary constructor with parameters
    constructor(name: String, age: Int, roll: Int) {
        this.name = name
        this.age = age
        this.roll = roll
    }

    fun showDetails() {
        println("Name: $name, Age: $age, Roll: $roll")
    }
}

// primary constructor and initializer blocks
class Person(fName: String, personAge: Int){
    val firstName: String = fName
    var age: Int = personAge

    // initializer block
    // when an instance of the class is declared then this block will be executed
    init{
        println("First Name = $firstName")
        println("Age = $age")
    }
}

open class Log {
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String) {

    }
    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}

class AuthLog: Log {
    constructor(_data: String): this("From AuthLog -> " + _data, 10) {
    }

    constructor(_data: String, _numberOfData: Int): super(_data, _numberOfData) {
    }
}

fun main() {
    // val person1 = Person()
    // person1.name = "Sushant"
    // person1.age = 22
    // person1.speak()

    val contact1 = Contact(101, "skc@gmail.com")
    contact1.category = "cook"
    contact1.printContact()

    val contact2 = Contact(102)
    contact2.printContact()

    val student1 = Student()
    student1.showDetails()

    val student2 = Student("Sushant", 22, 10)
    student2.showDetails()

    // println(student2.toString())

    val person1 = Person("Sushant", 22)

    val p1 = AuthLog("Bad Password")
}
