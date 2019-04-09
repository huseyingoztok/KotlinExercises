fun main(args: Array<String>) {

    print(toplaFun(2,1,3,4,"Hüseyin","Göztok",1.5,2.5,3.2))

}


fun toplaFun(a:Int,b:Int):Int{

    return a+b
}

fun toplaFun(a:Double,b:Double):Double{

    return a+b
}

fun toplaFun(vararg a:Any):String{

    var toplamSonuc=0
    var toplamKelime:String=""
    for (i in a){
        if (i is Int||i is Double){
            toplamSonuc+=i

        }
        else
            toplamKelime+="$i "
    }

    return  "$toplamSonuc $toplamKelime"

}

