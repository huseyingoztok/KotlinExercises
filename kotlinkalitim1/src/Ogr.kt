

class Ogrenci(var ogrNo:String) : Insan( "Hüseyin", 0, false,ogrNo){

    override fun bilgileriGoster(): String {
        return super.bilgileriGoster()+" OgrNo: $ogrNo"
    }
}