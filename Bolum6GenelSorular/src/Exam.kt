fun main(args: Array<String>) {


    print("3 adet sayi giriniz...")
    var toplam:Int=0
    var sayi:Int
    for (i in 1..3)
    {
        sayi= readLine()!!.toInt()
        toplam+=sayi
    }

    var aOrt:Double=(toplam.toDouble()/3)

    println(aOrt)


}


