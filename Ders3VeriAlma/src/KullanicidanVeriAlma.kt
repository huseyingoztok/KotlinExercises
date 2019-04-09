fun main(args: Array<String>) {

    print("Vize notunuzu giriniz :")
    var vizem :Int? = readLine()?.toInt()
    println()
    print("Final notunuzu giriniz :")
    var finalm:Int?= readLine()?.toInt()


    println()

    var ort:Double?

    ort= (vizem!! *0.4+finalm!!*0.6).toDouble()


    println("Ortalamanız :$ort")





}