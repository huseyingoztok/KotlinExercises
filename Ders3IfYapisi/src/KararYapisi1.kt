fun main(args: Array<String>) {


    var vize:Int
    var final:Int
    var ort:Double
    print("Vize notunuzu giriniz :")
    vize= readLine()!!.toInt()
   println()
    print("Final Notunuzu giriniz :")
    final= readLine()!!.toInt()

    ort=(vize*0.4+final*0.6).toDouble()
    println()
    var harfNotunuz =if (ort in 0..44){
        println("Notunuz 1")
        'E'
    }
    else if (ort in 44..54) {
        println("Notunuz 2")
        "D"
    }
    else if (ort in 55..69){
        println("Notunuz 3")
        "C"
    }
    else if (ort in 70..84)
    {
        println("Notunuz 4")
        "B"
    }
    else if(ort in 85..100)
    {
        println("Notunuz 5")
        "A"
    }
    else{
        println("Hatalı not girdiniz...")
        "Error"
    }

    println("Ortalamanız $ort \nHarf Notunuz $harfNotunuz")



}