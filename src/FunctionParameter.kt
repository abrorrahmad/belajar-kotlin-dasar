
fun hello(FirstName:String, lastName: String?) {

    if (lastName == null) {
        println("Hello $FirstName")

    } else {
        println("Hello $FirstName $lastName")
    }
}
    fun main() {
        hello("Abror", "Rahmad")

    }
