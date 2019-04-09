import sun.util.calendar.CalendarDate
import java.util.*

fun main(args: Array<String>) {
    /*
    println("Dizi boyutunu giriniz :")
    var arraySize= readLine()!!.toInt()
    println()
    var myArray=Array<Int>(arraySize){0}


    for (indis in 0..myArray.size-1)
    {
        print("${indis+1}. sayiyi giriniz :")
        myArray[indis]= readLine()!!.toInt()
        println()
    }


    for (indis in 0..myArray.size-1)
    {
        println(myArray[indis])
    }
    */
    /*
    print("Dizinin boyutunu giriniz :")
    var boyut = readLine()!!.toInt()

    var dizi = Array<Int>(boyut) { 0 }

    for (i in 0..dizi.size - 1)
    {
        print("${i+1}. eleman :")
        dizi[i]= readLine()!!.toInt()
        println()
        dizi[i]=faktorialCalc(dizi[i])
    }


    for (i in 0..dizi.size-1){
        println(dizi[i])
    }

*/
    println(ayDonder())
}

/*
fun faktorialCalc(sayi: Int): Int {
    var result = 1
    for (i in 1..sayi) {
        result *= i
    }
    return result
}
 */

fun ayDonder():String{
    var calendar=Calendar.getInstance()

    var ay=calendar.get(Calendar.MONTH)

    return ay.toString()
}