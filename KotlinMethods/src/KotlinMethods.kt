fun main(args: Array<String>) {

    /*
    var isim:String
    print("İsminizi giriniz :")
    isim= readLine()!!
    println()
    var result=selamVer(isim)

    print(result)
    */
    /*
    print("Vize notunuzu giriniz : ")
    var Vize:Int= readLine()!!.toInt()
    println()
    print("Final notunuzu giriniz : ")
    var finalN= readLine()!!.toInt()

    var result=ortHesapla(Vize,finalN)


    println("Ortalamanız :$result")

    */


    var sayi:Int
    print("Faktoriyeli alınacak sayıyı giriniz :")
    sayi = readLine()!!.toInt()

    var faktoriyelSonuc =faktorial(sayi)

    print(faktoriyelSonuc)
}

fun faktorial(sayi: Int): Int {
    var sonuc:Int =1
    for (i in 1..sayi)
        sonuc*=i
    return  sonuc
}

/*
fun ortHesapla(vize: Int, finalN: Int): Double {
    var ort=(vize*0.4+finalN*0.6).toDouble()

    return ort
}
*/
/*
fun selamVer(fisim:String): String {

    return "Hi "+fisim+" !!!"
}
*/