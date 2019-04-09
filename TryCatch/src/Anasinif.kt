import java.lang.Exception

fun main(args: Array<String>) {

    var dizi=List<Int>(5){0}
    /*
    try {
        for (i in 0..dizi.size){
            println(dizi[i])
        }
    }catch (ex:Exception){
        println("Hata :${ex.toString()}")
    }
    finally {
        println("Program sonlandı")
    }
    */
    var p=Person()
    p.yas=-9
    println(p.yas)

}