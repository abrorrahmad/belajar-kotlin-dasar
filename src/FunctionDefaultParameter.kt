
fun hallo(firstName: String, lastname:String? = null){

    if (lastname == null){
        println("hello $firstName")
    }else{
        println("Hello $firstName $lastname")
    }

}

fun main(){
    hallo("Abror")
    hallo("abror", "Rahmad")
    hallo("budi")
    hallo("aku","kamu")

}