package BasicSyntax

fun main() {
    val items = listOf("choco","hime","one","direction")
    for (item in items){
        println(item)
    }

    val itemss = setOf("apple","watermelon","melon")
    when{
        "apple" in itemss -> println("apple in itemss")
        "Nothing" in itemss -> println("sorryyyyyyyy")
    }

    val fruits = listOf("banana","melon","avocado","apple","peach")
    fruits.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach{ println(it)}
}