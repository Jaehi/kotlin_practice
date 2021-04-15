package BasicSyntax

fun main(args : Array<String>) {
    val items = listOf("apple","banana","peach")
    var index = 0
    while (index < items.size){
        println("item at $index is ${items[index]}")
        index++
    }
}