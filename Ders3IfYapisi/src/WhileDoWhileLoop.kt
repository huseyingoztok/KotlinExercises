fun main(args: Array<String>) {


    var i:Int =1
    var toplam:Int=0

    while (i<=10) {
        toplam += i
        i++
    }
    println(toplam)


    do{
        toplam+=i
        i++
    }while (i<=10)

    println(toplam)


}