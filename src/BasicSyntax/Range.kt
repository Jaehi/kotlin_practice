package BasicSyntax

fun main(args : Array<String>) {
    val x = 3
    if (x in 1..10){
        println("들어있음!")
    }

    for (x in 1..10){
        println(x)
    }
}