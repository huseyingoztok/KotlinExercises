
class GenericYazdir<Genel>(var dizi:Array<Genel>){

    fun yazdir(){
        for (diziEleman in dizi){
            println(diziEleman)
        }
    }

}

fun main(args: Array<String>) {

    var diziNesnesi=GenericYazdir<String>(arrayOf("Hüseyin","Hasan","Ahmet"))

    diziNesnesi.yazdir()

    var dizinesnesiInt=GenericYazdir<Int>(arrayOf(1,2,3,4,5))

    dizinesnesiInt.yazdir()


}