fun main(args: Array<String>) {
    var degistirilebilirListe= hashMapOf<Int,String>(1 to "Hasan" , 2 to "Hüseyin")

    degistirilebilirListe.put(3,"Sevim")
    degistirilebilirListe.put(4,"Selim")

    for(currentElement in degistirilebilirListe.values){
        println(currentElement)
    }
    println("*****************************************************")
    degistirilebilirListe.set(1,"Hasan Guncellendi")

    println("Sevim Silinecek")

    degistirilebilirListe.remove(3)

    for (currentElement in degistirilebilirListe.values){
        println(currentElement)
    }


}