fun main(args: Array<String>) {
    var liste:Array<String> = arrayOf("Hüseyin", "Hasan","Sevim")
    var liste2: Array<Any> = arrayOf("Hüseyin",'A',1,3.14)
    var numbers:Array<Int> = arrayOf(25,32,57,12,87)
    var toplam=0
    /*
    for (model in liste)
    {
        println(model)

    }
    */
    /*
    for (model2 in liste2)
    {
        println(model2)
    }

    */
    /*
    for (numb in numbers)
    {
        toplam+=numb
    }

    print(toplam)
    */

    /*
    for (i:Int in 1 until 100 step 2 )
        println(i)
    */
    /*
    for (i:Int in 100 downTo 1 step 3)
        println(i)
        */

    var toplamSayi : Int=0
    for (i :Int in 2  until   102 step 2 )
    {
        println(i)
        toplamSayi+=i
    }

    println(toplamSayi)
}