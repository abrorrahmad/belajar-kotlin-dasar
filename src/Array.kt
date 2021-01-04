fun main() {

    val name: Array<String> = arrayOf("abror","Rahmad","bogor")

    println(name[0])

    val nilai: Array<Int> = arrayOf(10,9,8)

    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(4)
    members[0]= "Abror"
    members[2]= "Anjay"
    members[3]= "Abror"
    members[4]= "Abror"
    members[5]= "Abror"
    println(members[0])
}