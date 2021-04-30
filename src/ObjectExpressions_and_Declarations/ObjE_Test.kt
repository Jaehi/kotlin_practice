package ObjectExpressions_and_Declarations

//class MyRunnable: Runnable{
//    override fun run() {
//        println("niku")
//    }
//
//}

class C{
    private fun foo() = object {val x : String = "x"}
    fun publicfoo() = object {val x : String = "X"}

    fun bar(){
        println(foo().x)
        println(publicfoo())
    }
}

fun main() {
//    val t = Thread(MyRunnable())
//    t.run()
    val tt = Thread(object  : Runnable{
        override fun run() {
            println("Niku")
        }
    })

    tt.run()

    val obj = object{
        val x = 15
        val y = 20
    }

    println(obj.x + obj.y)

    C().bar()
}