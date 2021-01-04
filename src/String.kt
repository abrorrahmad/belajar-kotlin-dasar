fun main() {

    var NamaDepan: String = "Abror"
    var NamaBelakang: String = "Rahmad"

    var address: String = """
        |Jalan Curug Rt 07 Rw 12 
        |Pakan Sari Cibinong
        |Bogor 
        """.trimMargin()

    println(NamaDepan)
    println(NamaBelakang)
    println(address)

    var fullName: String ="$NamaDepan $NamaBelakang"

    print(fullName)

    var dec: String = "$fullName length = ${fullName.length}"
    println(dec)

}