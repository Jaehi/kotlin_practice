package ObjectExpressions_and_Declarations

object CountManager{
    var count = 0
}

fun main() {
    CountManager.count++
    println(CountManager.count)
    CountManager.count++
    println(CountManager.count)
    CountManager.count++
    println(CountManager.count)
}