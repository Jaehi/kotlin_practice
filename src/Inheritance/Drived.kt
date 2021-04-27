package Inheritance

open class Base(p : Int){
    open val name : String
        get() {
            TODO()
        }

    fun test(){

    }
    open fun rtest(aa:String){
        println(aa)
    }
}

class Drived(p : Int) : Base(2) {
    override val name: String
        get() = super.name
    override fun rtest(aa: String) {
        super.rtest(aa)
    }

}