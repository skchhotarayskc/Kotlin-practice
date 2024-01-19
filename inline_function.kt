inline fun higherfunc(str: String, mycall: (String) -> Unit) {
    mycall(str)
}

fun main() {
    print("Hello there This is Sushant: ")
    higherfunc("A Computer Science undergraduate form VSSUT", ::print)
}
