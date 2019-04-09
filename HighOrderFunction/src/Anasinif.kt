import org.omg.CORBA.INTERNAL

class Matematik{
    fun topla(a:Int,b:Int,sonuc:(x:Int,y:Int)->Int){
        var toplam=sonuc(a,b)
        println(toplam)
    }







    fun carp(s1:Int,s2:Int,sonuc:(sayi1:Int,sayi2:Int)->Int){
        var carpim=sonuc(s1,s2)
        println(carpim)
    }





    fun cikar(x:Int,y:Int,fark:(s1:Int,s2:Int)->Int){
        var sonuc=fark(x,y)
        println(sonuc)
    }













    fun tertenYazdir(yazi:String,tersYazi:(rYazi:String)->String){
        var tYazi=tersYazi(yazi)
        println(tYazi)
    }









}









fun main(args: Array<String>) {
    var mat=Matematik()
    var lambdaToplam={z:Int,t:Int->z+t}
    mat.topla(5,4,{z:Int,t:Int->z+t})
    mat.topla(5,4,{z:Int,t:Int->z+t})  // 3 Farklı yazım stili var
    mat.topla(5,4){z:Int,t:Int->z+t}

    println("********************************************************************************")
    var lambdaCarpim={a:Int,b:Int->a*b}
    mat.carp(4,9,{a:Int,b:Int->a*b})
    mat.carp(4,9,lambdaCarpim)
    mat.carp(4,9) {a:Int,b:Int->a*b}

    println("********************************************************************************")
    var lambdaFark={a:Int,b:Int->a-b}
    mat.cikar(12,9,{a:Int,b:Int->a-b})
    mat.cikar(12,9,lambdaFark)
    mat.cikar(12,9){a:Int,b:Int->a-b}

    println("********************************************************************************")

    var lamdaTersYazi={a:String->a.reversed()}
    mat.tertenYazdir("Hüseyin",{a:String->a.reversed()})
    mat.tertenYazdir("Hüseyin",{it.reversed()}) //Tek parametreli fonsiyonlarda direkt olarak bu
    // kullanım kullanılabilir...
    mat.tertenYazdir("Hüseyin",lamdaTersYazi)
    mat.tertenYazdir("Hüseyin"){a:String->a.reversed()}
























}