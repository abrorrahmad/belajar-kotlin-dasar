fun main() {

    fun hello(name:String, tranformer:(String) -> String):String {

        val nameTransform = tranformer(name)
        return "hello $nameTransform"
    }

    val upper = fun(value:String):String{
        if (value == ""){
            return "UPS"
        }else{
            return value.toUpperCase()
        }
    }

    println(hello("Abror",upper))
    println(hello("",upper))

    println(hello("Rahmad",fun(value:String):String{
        return value.toLowerCase()
    }))



}