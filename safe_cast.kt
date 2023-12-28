fun main(){
    processValue("Sushant")
    processValue(100)
}

// safe cast
fun processValue(value: Any){
    val stringValue: String? = value as? String

    if(stringValue != null){
        println("String value: $stringValue")
    }
    else{
        println("Not a String")
    }
}

// safe cast operator is used to handle the exception if the type missmatched and return null instead of exception

// val obj: Any = "Hello"
//val intValue: Int? = obj as? Int  // No ClassCastException, intValue will be null

// The regular cast operator performs the casting operation but may throw a ClassCastException if the cast is not valid.

// val obj: Any = "Hello"
// val intValue: Int = obj as Int  // ClassCastException if the cast is not valid