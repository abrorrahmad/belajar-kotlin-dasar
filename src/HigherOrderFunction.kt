fun main() {

    fun hello(name:String, tranformer:(String) -> String):String {

        val nameTransform = tranformer(name)
        return "hello $nameTransform"
    }

    val lamdaUpper = {value:String -> value.toUpperCase()}
   println( hello("Abror", lamdaUpper))

    println(hello("Abror", {value:String -> value.toLowerCase() }))

    val result = hello("Abror"){ value : String ->
        value.toLowerCase()

    }
}