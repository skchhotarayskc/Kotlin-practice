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
}