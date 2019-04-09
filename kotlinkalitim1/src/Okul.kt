
open class Insan(var nameSurname:String,var yas:Int,var cinsiyet:Boolean,var extraBilgi:String){


    open fun bilgileriGoster():String{
        var cins=if (cinsiyet==true)
            "Erkek"
        else
            "Kadın"
        return "Ad Soyad :${this.nameSurname} yas :${this.yas} cinsiyet :$cins"
    }



}



