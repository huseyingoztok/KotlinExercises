class Person {
    var yas:Int=0
    get() = field
    set(value) {
        if (value<0){
            var istisna=IllegalArgumentException("Personel yaşı 0dan küçük olamaz")
            throw istisna
        }else{
            field=value
        }

    }





}