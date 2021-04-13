package BasicSyntax

fun maxOf(a:Int, b:Int):Int{
    if (a > b ){
        return a
    }else {
        return b
    }
}

fun minOf(a : Int, b: Int) = if (a<b) a else b

fun main() {

    println(maxOf(10,20))
    println(minOf(10,20))

}