package ControlFlow

import parseInt
import java.util.*

fun main() {
    var x : Int = Scanner(System.`in`).nextInt()
    var y : Boolean = Scanner(System.`in`).nextBoolean()

    when(x){
        1 -> print("1")
        2 -> print("2")
        else->{
            print("wooo")
        }
    }

    var res = when(x){
        100 -> "A"
        90 -> "B"
        80 -> "C"
        else -> "F"
    }

    var ress = when(y){
        true -> "맞다"
        false -> "틀리다"
    }

    when (x){
        0,1 -> print("x == 0 or x == 1")
        else -> print("Another")
    }
    when(x){
        1 + 3 -> print("4")
        else -> print("he")

    }

    val validNumbers = listOf(3,6,9)
    when (x){
        in validNumbers -> print("x is valid")
        in 1..10 -> print("x is in range")
        !in 10..20 -> print("x is outside the range")
        else -> print("No")
    }


}

fun hasPrefix(x : Any) = when(x){
    is String -> x.startsWith("prefix")
    else -> false
}
fun aa(x : Any){

}