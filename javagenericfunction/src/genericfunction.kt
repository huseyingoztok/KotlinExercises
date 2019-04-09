


abstract class GeometrikSekil{

    abstract fun  alanHesapla():Int
}


class Kare(var uzunluk:Int): GeometrikSekil() {


    override fun alanHesapla() :Int {
        return uzunluk*uzunluk
    }

}


class Dikdortgen(var en:Int,var boy:Int):GeometrikSekil(){

    override fun alanHesapla():Int {
        return en*boy
    }
}


fun main(args: Array<String>) {
    var kare1=Kare(4)
    var kare2=Kare(5)
    println(karsilastirGen(kare1,kare2).alanHesapla())

    var dik1=Dikdortgen(4,5)
    var dik2=Dikdortgen(3,2)

    println(karsilastirGen(dik1,dik2).alanHesapla())

    /*

    var gs1:GeometrikSekil=Dikdortgen(4,5)
    var gs2:GeometrikSekil=Dikdortgen(6,7)

    println(karsilastir(gs1,gs2).alanHesapla())
    */

    var kBir:Kare=Kare(9)
    var kIki:Kare=Kare(8)

    println(karsilastirGen(kBir,kIki).alanHesapla())



}


fun <Genel:GeometrikSekil> karsilastirGen(p1:Genel,p2:Genel):Genel{
    if (p1.alanHesapla()>p2.alanHesapla())
        return p1
    else
        return p2
}



/*
fun  karsilastir(fgs1:GeometrikSekil,fgs2:GeometrikSekil):GeometrikSekil{
    if (fgs1.alanHesapla()>fgs2.alanHesapla())
        return fgs1
    else
        return  fgs2
}
*/
fun karsilastir(k1:Kare,k2:Kare):Kare{

    if (k1.alanHesapla()>k2.alanHesapla())
        return k1
    else
        return k2
}




fun karsilastir(d1:Dikdortgen,d2:Dikdortgen):Dikdortgen{
    if (d1.alanHesapla()>d2.alanHesapla())
        return d1
    else
        return d2
}









