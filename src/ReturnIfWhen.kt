fun main() {

    fun Sayhello(name:String = ""):String{
//        return if (name == ""){
//            "hallo Bro"
//        }else{
//            "Hello $name"
//        }

        return when(name){
            "" -> "Hallo Bro"
            else -> "Hello $name"

        }
    }

    println(Sayhello())
    println(Sayhello("Abror"))
}