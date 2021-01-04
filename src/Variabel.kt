const val APPLICATION = "Belajar Kotlin Dasar"
const val VERSION = "0.0.1"

fun main() {

    val NamaDepan = "Abror"
    val umur = 23

    println(NamaDepan)
    println(umur)

    val name:String? = null
    println(name)
    println(name?.length)

    println("$APPLICATION : $VERSION")

}