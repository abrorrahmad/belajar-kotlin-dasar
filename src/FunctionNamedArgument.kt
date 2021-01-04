fun fullName(
    firstname:String,
    midlename:String,
    lastname:String
){
    println("hello $firstname $midlename $lastname")

}

fun main() {

    fullName("Abror","rahmad","aja")

    fullName(lastname = "aja",
    firstname = "abror",
    midlename = "rahmad"
    )

}