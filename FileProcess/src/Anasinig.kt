import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    /*
    var dosya=FileWriter("ilkdosya.txt")

    var liste=Array<String>(4){""}

    for (i in 0..liste.size-1){
        print("${i+1}. eleman :")
        liste[i]= readLine()!!
        println()
        dosya.write(liste[i]+"\n")

    }
    */


    var dosya = FileReader("ilkdosya.txt")
    var okunan: Int = 0

    /*
    while (okunan != -1) {

        print(okunan.toChar())
        okunan=dosya.read()




    }
    */
    //println(dosya.readText()) ===>Bo satır dosyanın tamamını okur...

    /*
    * Bir diğer yol
     */

    dosya.forEachLine {
        println(it)
    }


    dosya.close()


}