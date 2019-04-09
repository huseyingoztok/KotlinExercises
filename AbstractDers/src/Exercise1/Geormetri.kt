package Exercise1

abstract class Geometri {


    abstract fun alanHesapla()


}


class  Kare: Geometri() {

    override fun alanHesapla() {
       println("Karenin alani hesaplanacak...")
    }
}

class Dikdortgen : Geometri(){
    override fun alanHesapla() {
        println("Dikdortgenin alani hesaplanacak...")
    }
}


fun main(args: Array<String>) {
    var dikdortgenNesnesi:Dikdortgen= Dikdortgen()

    dikdortgenNesnesi.alanHesapla()
}