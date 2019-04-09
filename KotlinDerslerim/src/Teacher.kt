class Teacher(name:String,tc:String,age:Int):Insan(name, tc, age){
    var salary:Double?=null

    constructor(name:String,tc:String,age:Int,salary:Double):this(name,tc,age){
        this.salary=salary
    }


    override fun getInfo(): String {
        return super.getInfo()+"\nMaaş:${this.salary}"
    }
}