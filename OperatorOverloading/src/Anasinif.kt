class Person(var name:String)

fun main(args: Array<String>) {

    var pNesnesi=Person("Hüseyin")
    var pNesnesi2=Person("Hasan")


    // println(pNesnesi+pNesnesi2) Bu işlem için method overloading gerekiyor
    println(pNesnesi.plus(pNesnesi2).name)
    println((pNesnesi+pNesnesi2).name) //Operator keywordü sayesinde + işlemi overload edilmiş oldu
    println((pNesnesi plus pNesnesi2).name)
}


infix operator fun Person.plus(pNes:Person):Person{

    var pGecici=Person(this.name+pNes.name)

    return pGecici
}