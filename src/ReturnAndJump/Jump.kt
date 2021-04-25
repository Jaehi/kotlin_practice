package ReturnAndJump

fun sum(a : Int, b : Int) : Int{
    println("a : $a, b : $b")
    return a+b
}

fun main() {

    sum(10,20)
    for (y in 1..10){
        if (y >2){
            break
        }
        println("y : $y")
    }
    for (x in 1..10){
        if (x < 2){
            continue
        }
        println("x : $x")
    }
}