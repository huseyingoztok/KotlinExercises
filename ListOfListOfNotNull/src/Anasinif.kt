fun main(args: Array<String>) {
    var degistirilemezListe= listOf("Hüseyin",1,2,3,true,null,false)

    println(degistirilemezListe.first())

    println(degistirilemezListe[0])
    //degistirilemezListe[0]=5 değiştirilemez olduğu için sete izin vermiyor...

    var degistirilmezNotNullListe= listOfNotNull("Hasan","Hüseyin",1,2,null,false)
    println(degistirilmezNotNullListe.get(4))
    println(degistirilmezNotNullListe.size)
}