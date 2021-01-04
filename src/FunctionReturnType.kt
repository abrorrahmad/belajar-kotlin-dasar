fun jumlahkan(a:Int,b:Int): Int{
    val total = a + b
    return total

}

fun bagi(a:Int,b: Int): Int {
    if (b == 0) {
        return 0
    } else {

        val hasil = a / 2
        return hasil
    }
}

fun main() {
    println(jumlahkan(10,10))
    println(jumlahkan(100,100))

    val result = jumlahkan(200,200)
    println(result)

    println(bagi(100, 10))
    println(bagi(100, 0))

}