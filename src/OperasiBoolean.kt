fun main() {

    val nilaiujian = 80
    val nilaiabsen = 80
    val nilaiEktra = 70

    val apakahLulusUjian = nilaiujian > 75
    val apakahLulusAbsen = nilaiabsen > 75
    val apakahLulusExtra = nilaiEktra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra
//    val apakahLulus = (apakahLulusUjian && apakahLulusAbsen) && apakahLulusExtra
//    val apakahLulus = ((apakahLulusUjian && apakahLulusAbsen) && apakahLulusExtra)
    //cara pengerjaan hasil 
    println(apakahLulus)

}