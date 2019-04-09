import sun.rmi.runtime.Log


class NesneYonelimliDers1 {

    var adSoyad:String = String()
    var yas:Int=0
    var TCKN:Long =0

}


fun main(args: Array<String>) {
    var nesne:NesneYonelimliDers1=NesneYonelimliDers1()

    nesne.adSoyad="Hüseyin GÖZTOK"
    nesne.yas=23
    nesne.TCKN= 43432443423423

    println(nesne.adSoyad+"\n"+nesne.yas+"\n"+nesne.TCKN)
}