fun main(args: Array<String>) {


    var res: Int
    var sayi1: Int
    var sayi2: Int
    res = menuGoster()

    while (res != 5) {
        print("1. sayiyi giriniz :")
        sayi1 = readLine()!!.toInt()
        println()
        print("2. sayiyi giriniz :")
        sayi2 = readLine()!!.toInt()
        println()
        when (res) {
            1 -> topla(sayi1, sayi2)
            2 -> cikar(sayi1, sayi2)
            3 -> carp(sayi1, sayi2)
            4 -> bol(sayi1, sayi2)
        }
        res = menuGoster()
    }

    println("Programı sonlandırdınız ...")
}

fun bol(sayi1: Int, sayi2: Int) {
    println(sayi1.toDouble() / sayi2.toDouble())
}

fun carp(sayi1: Int, sayi2: Int) {
    println(sayi1 * sayi2)
}

fun cikar(sayi1: Int, sayi2: Int) {
    println(sayi1 - sayi2)
}

fun topla(sayi1: Int, sayi2: Int) {
    println(sayi1 + sayi2)
}


fun menuGoster(): Int {
    println("*************** MENU ******************")
    println("Topalama ==>1")
    println("Çıkarma ==>2")
    println("Çarpma ==>3")
    println("Bölme ==>4")
    println("Çıkmak için ==>5")
    print("Seçiminiz :")
    var secim = readLine()!!.toInt()

    return secim

}