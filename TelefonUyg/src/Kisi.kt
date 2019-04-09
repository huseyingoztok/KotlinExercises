class Kisi(var name:String,var telNo:String) {


    companion object {
        fun kisiOlustur( name:String, telNo:String):Kisi{
            return Kisi(name, telNo)
        }
    }

}