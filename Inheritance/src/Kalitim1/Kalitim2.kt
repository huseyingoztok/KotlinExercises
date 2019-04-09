package Kalitim1

open class Insan constructor(isim:String,cinsiyet:Boolean,yas:Int,TCKN:String)
{



    var isim:String=""
    var cinsiyet:Boolean=false
    var yas:Int=0
    var TCKN:String=""
    var cins:String=""
    init {
        this.isim=isim
        this.cinsiyet=cinsiyet
        this.yas=yas
        this.TCKN=TCKN
    }
    override fun toString(): String {
        if (yas<0){
            yas=1
        }
        cins=if (cinsiyet) "Erkek" else "Kadın"
        return "isim :$isim yas :$yas tckn :$TCKN cinsiyet: $cins "
    }
}


class Ogrenci(isim:String,cinsiyet:Boolean,yas:Int,TCKN:String,brans:String):Insan(isim, cinsiyet, yas, TCKN){

    var brans:String
    init {
        this.brans=brans
    }

    override fun toString(): String {
        return super.toString()+" brans :$brans"
    }
}


fun main(args: Array<String>) {

    var insanNesnesi:Insan= Insan("Hüseyin",true,-5,"32453452343")
    println(insanNesnesi)


    var ogrNesnesi:Ogrenci=Ogrenci("Selin",false,21,"23423412345","Software Developer")

    println(ogrNesnesi)

}












