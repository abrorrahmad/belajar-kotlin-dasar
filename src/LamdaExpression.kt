fun toUpper(value:String):String = value.toUpperCase()

fun main() {

    val contohlamda: (String, String) -> String = { firsName: String, lastName: String ->
        val result = "$firsName $lastName"
        result

    }

    val result = contohlamda("Abror", "Rahmad")
    println(result)


    val sayhello: (String) -> String = {

        "Hello $it"
    }

    println(sayhello("Abror"))

    val toUpperCase : (String) -> String = :: toUpper
    println(toUpperCase("Abror rahmad"))

}