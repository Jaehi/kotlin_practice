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

    // val max = if(a > b) a else b

//    val max = if (a > b){
//        print("a")
//        a
//    }else{
//        print("b")
//        b
//    }

    println(max)

}