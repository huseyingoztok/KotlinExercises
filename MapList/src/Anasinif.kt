fun main(args: Array<String>) {
    //Değiştirilemez Listelerdir (Update,Delete,insert yapılamaz) sadece okunabilirler...
    var mapList= mapOf<Int,String>(1 to "Hüseyin",2 to "Hasan",3 to "Ahmet",4 to "Vali")

    println(mapList.get(1))
    println("***********************************************")
    for (mapVal in mapList.values){
        println(mapVal)
    }

    print("Aranacak Liste elemenını giriniz :")
    var aranacak= readLine()

    if (mapList.containsValue(aranacak)){
        println("Aranacak ifade ($aranacak) bulundu")
    }
    else{
        println("Aranacak ifade ($aranacak) bulunamadı")
    }



}