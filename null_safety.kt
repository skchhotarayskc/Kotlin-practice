fun main(){
    var neverNull: String = "This can't be null"
    println(neverNull)

    // throws compiler error (null can not be a value of a non-null type String)
    // neverNull = null

    var nullable: String? = "You can keep a null here"
    println(nullable)

    // this is ok
    nullable = null
    println(nullable)

    fun strLength(notNull: String): Int{
        return notNull.length
    }

    //throws compiler error
    // println(strLength(nullable));

    println(strLength(neverNull));

    // checking if null or not
    println(describeString("Sushant"))
    println(describeString(null))

    // example of safe calls
    println(lengthString("Sushant"))
    println(lengthString(null))
    println(lengthString(""))

    println(elvisOperatorExample("skc"))
    println(elvisOperatorExample(null))

    // nullString is null so the invocation of .uppercase() is skipped and null is returned
    var nullString: String? = null
    println(nullString?.uppercase())  // null

    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for(item in listWithNulls){
        item?.let {println(it)} // prints Kotlin and ignores null
    }

    // If either `person` or `person.department` is null, the function is not called:
    // person?.department?.head = managersPool.getManager()

    // the not-null assertion operator(!!)
    // val b: String? = null
    // val l = b!!.length
    // println(l)
    //     Exception in thread "main" java.lang.NullPointerException
    //     at Null_safetyKt.main(null_safety.kt:50)
    //     at Null_safetyKt.main(null_safety.kt)

    // collection of nullable types
    val nullableList: List<Int?> = listOf(2, 4, null, 10)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)
}

fun describeString(maybeString: String?): String{
    // if the string having length zero or null
    if(maybeString != null && maybeString.length > 0){
        return "String of length ${maybeString.length}"
    }
    else{
        return "Empty string or null"
    }
}

// use safe call operator => (?.)
fun lengthString(maybeString: String?): Int? = maybeString?.length

// use Elvis operator => (?:)
// if str is null so the safe call to access the length property returns a null value.
// as a result the Elvis operator returns 0
fun elvisOperatorExample(str: String?): Int? {
    return str?.length ?: 0 
}

