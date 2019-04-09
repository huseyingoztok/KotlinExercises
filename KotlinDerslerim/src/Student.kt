class Student(name:String,tc:String,age:Int):Insan(name, tc, age) {
    var studentNo:Int?=null

    constructor(name: String,tc: String,age: Int,studentNo:Int):this(name, tc, age){
        this.studentNo=studentNo
    }

    override fun getInfo(): String {
        return super.getInfo()+"\nOgrenci Numarası: ${this.studentNo}"
    }

}