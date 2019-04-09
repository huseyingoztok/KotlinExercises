fun main(args: Array<String>) {
    var telNesnesi=Telefon()
    startPhone()
    menuGoster()
    var durum:Boolean=false
    var secim:Int
    var kName= String()
    var kTel= String()
    while (!durum){
        print("Yapmak istediğiniz işlem kodunu giriniz :")
        secim= readLine()!!.toInt()

        when(secim){

            0->{
                durum=true
                println("\nÇıkış Yapılıyor...")
            }
            1->{
                print("Kişinin Adını Giriniz :")
                kName= readLine()!!
                println()
                print("Kişinin Telefon Numarasını Giriniz :")
                kTel= readLine()!!

                if (telNesnesi.kisiEkle(kName,kTel)){
                    println("Kişi Eklendi")
                }
                else{
                    println("Kişi Listede Kayıtlı")
                }
            }
            2->{
                telNesnesi.kisiSil()
            }
            4->{
                telNesnesi.Listele()
            }
            5->{
                menuGoster()
            }
            else->{
                println("Mecut olmayan bir durumu seçtiniz ...")
            }
        }
    }


}

fun menuGoster() {

    println("**************************** MENU ***************************")
    println("0 -- Çıkış")
    println("1 -- Kişi Ekle")
    println("2 -- Kişi Sil")
    println("3 -- Kişi Güncelle")
    println("4 -- Kişileri Listele")
    println("5 -- Menüyü Yeniden Göster")
}
fun startPhone() {
    println("Telefon Başlatılıyor...")
}
