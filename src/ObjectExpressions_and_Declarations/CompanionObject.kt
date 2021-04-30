package ObjectExpressions_and_Declarations

interface Facttory<T>{
    fun create() : T
}

class MyClasss{
    companion object : Facttory<MyClasss>{
        override fun create(): MyClasss = MyClasss()

    }
}

class MyClass{
    companion object Factory{
        fun createe() : MyClass = MyClass()
    }
}

fun main() {
    val instance = MyClass.createe()

}