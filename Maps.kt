fun main(){
    val readOnlyMenu: Map<String, Int> = mapOf("apple" to 100, "orange" to 200, "banana" to 300)
    println(readOnlyMenu)

    val menu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "orange" to 200, "banana" to 300)
    println(menu)

    println("The value of the apple juice is ${readOnlyMenu["apple"]}")

    menu.put("grapes", 150)
    menu.put("guava", 250)
    println(menu)

    println("The value of guava juice is ${menu["guava"]}")

    menu.remove("orange")
    println(menu)

    println(readOnlyMenu.containsKey("orange"))

    println(readOnlyMenu.keys)
    println(readOnlyMenu.values)

    println("orange" in readOnlyMenu.keys)
    println(200 in readOnlyMenu.values)
}