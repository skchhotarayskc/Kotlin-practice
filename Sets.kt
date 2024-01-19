fun main(){
    val readOnlyFruits: Set<String> = setOf("Apple", "Banana", "Grapes", "Grapes")
    val fruits: MutableSet<String> = mutableSetOf("Apple", "Banana", "Grapes", "Grapes")

    println(readOnlyFruits)
    println(fruits)
    println("This set has ${fruits.count()} no. of items")
    println("Banana" in readOnlyFruits)

    fruits.add("Guava")
    println(fruits)

    fruits.remove("Grapes")
    println(fruits)
}