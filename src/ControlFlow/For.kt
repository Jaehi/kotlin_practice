package ControlFlow

fun main() {
    var collection = listOf(1,2,3,4,5,6)
    collection.iterator()
    for(item in collection){
        print(item)
    }

    val array = arrayOf(1,2,3,4,5)
    array.iterator()
    for (i in array){
        println("$i")
    }

    val aaa = arrayOf("가","나","다")
    for (i in aaa.indices){
        println("$i : ${aaa[i]}")
    }
    for ((index,value)in aaa.withIndex()){
        println("$index : ${value}")
    }

}