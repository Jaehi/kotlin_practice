package ControlFlow

import java.util.*

fun main() {
    var scanner : Scanner = Scanner(System.`in`)
    var a : Int = scanner.nextInt()
    var b : Int = scanner.nextInt()
    var max : Int?
    if (a < b)
        max = b
    else
        max = a

    println(max)

}