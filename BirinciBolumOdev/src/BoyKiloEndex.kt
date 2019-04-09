fun main(args: Array<String>) {

    var ad:String ="Hüseyin"
    var soyad:String= "Göztok"
    var yas:Int =23
    var cinsiyet:Char ='E'

    var boy :Double =1.95
    var kilo:Int=100


    var endex:Double
    endex=(kilo/(boy*boy)).toDouble()

    println("Adınız :$ad \nSoyadınız :$soyad \nYaşınız :$yas \nCinsiyetiniz :$cinsiyet \nVücut Kitle Endexiniz :$endex")
}