data class User(val name: String, val id: Int)

fun main(){
    val user1 = User("Sushant", 10)
    val user2 = User("Sushant", 10)
    val user3 = User("Sanjukta", 20)
    
    println(user1)
    println(user2)
    println(user3)

    println("user1 == user2 : ${user1 == user2}")
    println("user2 == user3 : ${user2 == user3}")

    println(user1.copy("Priyanka"))
}