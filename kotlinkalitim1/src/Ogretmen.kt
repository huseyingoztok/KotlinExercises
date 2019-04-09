

class Teacher(var sicilNo:String):Insan("",0,false,sicilNo ){

    override fun bilgileriGoster(): String {
        return super.bilgileriGoster()+" Sicil No:$sicilNo"
    }

}