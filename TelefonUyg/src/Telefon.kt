import kotlin.math.sign

class Telefon {

    var kisiLitesi=ArrayList<Kisi>()

    fun kisiEkle(name:String,telNno:String):Boolean{

        if (kisiVarmi(name,telNno)){
           return false
        }
        kisiLitesi.add(Kisi.kisiOlustur(name,telNno))

        return true


    }

     fun kisiVarmi(name: String,telNno: String):Boolean {
         for (kisi in kisiLitesi){
             if (kisi.name==name&&kisi.telNo==telNno){
                 return true
             }

         }
         return false
     }

    fun Listele() {
        for(kisi in kisiLitesi){
            println("Ad :${kisi.name} -- Telefon :${kisi.telNo}")
        }
    }

    fun kisiSil(kisi:Kisi) {
        kisiLitesi.remove(kisi)
    }


}