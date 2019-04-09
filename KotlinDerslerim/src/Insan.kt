open class Insan{
    var name:String?=null

    var tc:String?=null

    var age:Int?=null
    get () {
        return field
    }
    set(value) {
        if (value!!<0){
            field=0
        }else{
            field=value
        }
    }

    constructor()

    constructor(name:String,tc:String,age:Int){
        this.name=name
        this.tc=tc
        this.age=age
    }


    open fun getInfo():String{
        return "Ad: ${this.name} \nTc: ${this.tc} \nAge: ${this.age}"
    }
}