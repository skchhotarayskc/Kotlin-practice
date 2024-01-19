fun main(){
    val fruits = listOf("apple", "orange", "banana", "grapes", "avocardo", "kiwi", "ababa")

    fruits
    .filter { it.startsWith("a") }
    .sortedBy { it }
    .map { it.uppercase() }
    .forEach { println(it) }
}