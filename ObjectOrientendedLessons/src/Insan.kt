class Insan {

    var isim: String = ""
    var soyad: String = ""
    var yas: Int = 0

    constructor(isim: String, soyad: String) {
        this.isim = isim
        this.soyad = soyad


        println("Adınız :${this.isim} Soyadınız :${this.soyad}")
    }


    constructor(isim: String, soyad: String, yas: Int) {
        this.isim = isim
        this.soyad = soyad

        if (yas < 0)
            this.yas = 1
        else
            this.yas = yas

        println("Adınız :${this.isim} Soyadınız :${this.soyad} Yaşınız :${this.yas}")
    }


}

fun main(args: Array<String>) {
    var insanNesnesi: Insan = Insan("Hüseyin", "Göztok")
    var insanNesnesi2: Insan = Insan("Hasan", "Göztok",5)
}