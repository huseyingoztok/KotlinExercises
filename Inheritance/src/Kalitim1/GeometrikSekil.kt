package Kalitim1

open class GeometrikSekil {

    var en:Int=0
    var boy:Int=0

    open fun alanHesapla():String
    {
        return "Geometrik Şeklin Alanı :"+en*boy
    }

}


class Kare: GeometrikSekil()
{
    override fun alanHesapla(): String {
        return "Karenin Alanı :"+en*boy
    }
}


class  Dikdortgen:GeometrikSekil(){
    override fun alanHesapla(): String {
        return "Dikdortgenin alani :"+en*boy
    }
}


fun main(args: Array<String>) {
    var gNesnesi:GeometrikSekil=GeometrikSekil()
    gNesnesi.en=4
    gNesnesi.boy=6
    println(gNesnesi.alanHesapla())

    var kNesnesi:Kare=Kare()
    kNesnesi.boy=6
    kNesnesi.en=6

    println(kNesnesi.alanHesapla())


    var dNesnesi:Dikdortgen= Dikdortgen()
    dNesnesi.en=6
    dNesnesi.boy=5

    println(dNesnesi.alanHesapla())

}












