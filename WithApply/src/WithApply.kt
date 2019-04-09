class Person{
    var ad:String=""
    var yas:Int=0

    fun kendiniTanit(){
        println("Ad :$ad \nYas:$yas")
    }
}

fun main(args: Array<String>) {
    var p=Person()

    with(p){
        ad="Hüseyin"
        yas=29
    }
    p.kendiniTanit()


    p.apply {
        ad="Hasan"
        yas=23
    }.kendiniTanit()















}