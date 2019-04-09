class Ogrenci {

    var ad: String = ""
    var soyad: String = ""
    var yas: Int = 0


    constructor() {
        println("Ad : ${this.ad} Soyad :${this.soyad} Yaş :${this.yas}")
    }

    constructor(ad: String) {
        this.ad = ad
        println("Ad : ${this.ad} Soyad :${this.soyad} Yaş :${this.yas}")
    }

    constructor(ad: String, soyad: String) {
        this.ad = ad
        this.soyad = soyad
        println("Ad : ${this.ad} Soyad :${this.soyad} Yaş :${this.yas}")
    }

    constructor(ad: String, soyad: String, yas: Int) {
        this.ad = ad
        this.soyad = soyad
        if (yas < 0)
            this.yas = 18
        else
            this.yas = yas

        println("Ad : ${this.ad} Soyad :${this.soyad} Yaş :${this.yas}")
    }
}


fun main(args: Array<String>) {
    var ogrNesnesi: Ogrenci = Ogrenci("Hasan", "GOZTOK", -5)
}