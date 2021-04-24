package ControlFlow

class MyIterator {
    val data = listOf(1,2,3,4,5)
    var idx = 0
    operator fun hasNext() : Boolean{
        return data.size > idx
    }
    operator fun next() : Int{
        return data[idx++]
    }
}

class MyData{
    operator fun iterator() : MyIterator{
        return MyIterator()
    }
}

fun main() {
    val mydata = MyData()
    for (item in mydata){
        print(item)
    }

}