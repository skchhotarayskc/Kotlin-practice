fun main(){
    val readOnlyShapes: List<String> = listOf("Triangle", "Rectangle", "Circle")
    // println(readOnlyShapes)
    // println("${"Circle" in readOnlyShapes}")
    println("Circle" in readOnlyShapes)
    
    val shapes: MutableList<String> = mutableListOf("Triangle", "Rectangle", "Circle")
    // println(shapes)
    shapes[0] = "Square"
    // println(shapes)

    // val shapesLocked: List<String> = shapes
    // println(shapesLocked)
    // shapes[1] = "Apple"
    // println(shapes)
    // println(shapesLocked)

    // println("The first item of the list is ${shapes.first()} and the last item is ${shapes.last()}")
    // println("The number of items in this list are ${shapes.count()}")

    shapes.add("Grapes")
    println(shapes)
    shapes.remove("Rectangle")
    println(shapes)
    shapes.add(1, "Apple")
    println(shapes)
    shapes.removeAt(2)
    println(shapes)
}