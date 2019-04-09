fun main(args: Array<String>) {
    print("Bir dizi boyutu giriniz :")
    var boyut:Int= readLine()!!.toInt()
    var dizi=Array<String>(boyut){""}


    for (indeks in 0..boyut-1)
    {
        dizi[indeks]= readLine()!!

    }

    /*
    for (indeks in 0..boyut-1)
    {
        println(dizi[indeks])
    }
    */

    addMastar(dizi)


}


fun addMastar( Dizi:Array<String>){
    for (index in 0..Dizi.size-1){
        println(Dizi[index])
    }


}