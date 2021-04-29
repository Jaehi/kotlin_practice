package Data_and_NestedClasses

class NestedOuter(){
    private val bar : Int = 1
    class Nested{
        fun foo() = 2
    }
}

class InnerOuter(){
    private val bar : Int = 2
    inner class Innner{
        fun foo() = bar
    }
}


val demo = NestedOuter.Nested().foo()
//val demo2 = InnerOuter.Innner().foo()