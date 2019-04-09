import javax.print.Doc


interface DocumentRead {

    fun Oku()
}


class kitap : DocumentRead{
    override fun Oku() {
        println("Kitap okuyorum...")
    }

}


fun main(args: Array<String>) {
    var kitapNesnesi=kitap()
    kitapNesnesi.Oku()



    var anonymClass=object :DocumentRead{
        override fun Oku() {
            println("Kitabı sınıfa gerek duymadan okuyorum")
        }
    }

    anonymClass.Oku()
}