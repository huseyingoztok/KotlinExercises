fun main(args: Array<String>) {

    print("Notunuzu giriniz :")
    var Notunuz:Int= readLine()!!.toInt()

    var result=when(Notunuz){

        in 1..44 ->{
           println("1-44 bloguna girdiniz")
            1
        }

        in  45..54->{
            println("45-54 bloguna girdiniz")
            2
        }

        in 55..69 ->{
            println("55-69 bloguna girdiniz")
            3
        }

        in 70..84 ->{
            println("70-84 bloguna girdiniz")
            4
        }

        in 85..100 ->{
            println("85-100 bloguna girdiniz")
            5
        }

        else ->{
            "Hatalı Giriş yaptınız"
            "Error"
        }

    }

    println("Notunuz ==> $result")
}