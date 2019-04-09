package Exercises1

open class Insan{

   var isim:String
    var tc:String
    var yas:Int
    var cinsiyet:Boolean
    var cinsiyet2:String=""
    constructor(isim:String,tc:String,yas:Int,cinsiyet:Boolean){
        this.isim=isim
        this.tc=tc
        this.yas=yas
        this.cinsiyet=cinsiyet
    }




    override fun toString(): String {
        cinsiyet2=if (cinsiyet) "Erkek" else "Kadın"
        return "isim :$isim tc :$tc yas :$yas cinsiyet :$cinsiyet2"
    }
}


class Ogrenci:Insan{
    var ogrNo:String

    constructor(isim:String,tc:String,yas:Int,cinsiyet:Boolean,ogrNo:String):super(isim, tc, yas, cinsiyet){
     this.ogrNo=ogrNo
    }


    override fun toString(): String {
        return super.toString()+" ogrNo: $ogrNo"
    }

}


fun main(args: Array<String>) {
    var ogrNesnesi:Ogrenci= Ogrenci("Hüseyin","4543234234234",23,false,"1030520398")

    println(ogrNesnesi)
}