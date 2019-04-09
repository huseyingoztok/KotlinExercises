class Kisi{
    var id:Int
    var isim:String

    constructor(id:Int,isim:String){
        this.id=id
        this.isim=isim
    }

    override fun toString(): String {
        return "Id :$id Ad :$isim"
    }
}

data  class Kisid(var id:Int,var isim:String){






}
fun main(args: Array<String>) {
    var huseyin=Kisi(1,"Hüseyin")
    var hasan=Kisi(2,"Hasan")
    var ali=hasan
    var ahmet=Kisi(1,"Hüseyin")


    println(huseyin)
    println(hasan)
    println(ali)
    println(hasan.equals(ali))
    println(huseyin.equals(ahmet))


    println("***********************************************************")

    var huseyind=Kisid(1,"Hüseyin")
    println(huseyind)
    var hasand=Kisid(1,"Hüseyin")
    println(huseyind.equals(hasand))

}