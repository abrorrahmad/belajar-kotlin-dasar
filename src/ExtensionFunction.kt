fun String.hello():String = "Hello $this"

fun String.printHello(): Unit = println("helo $this")


fun main() {
    val name = "Abror"
    println(name.hello())


    name.printHello()

}