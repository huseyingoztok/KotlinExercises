package InnerClassPack

class DisSinif{

    var disSinifVar="Selam"

    fun selamVerDisSinif(){
        println("Dis sinif selam verdi")
    }


    inner class IcSinif(){
        var icSinifVar="Selam 2"

        fun selamVerIcSinif(){
            println("Ic sinif selam verdi")
        }


        inner  class enIctekiSinif(){
            var enIctekiSinif="Selam 3"

            fun selamVerEnIctekiSinif(){
                println("En İçteki Sinif Selam Verdi")
            }
        }

    }


}


fun main(args: Array<String>) {
    /*
    var disNesne=DisSinif()

    disNesne.selamVerDisSinif()
    */

    var enicSinifNesne=DisSinif().IcSinif().enIctekiSinif()

    enicSinifNesne.selamVerEnIctekiSinif()
}