package ReturnAndJump

fun main() {
    loop@ for (i in 1..10){
        println("---i: $i---")
        for (j in 1..10){
            println("j : $j")
            if (i + j > 12){
                break@loop
            }
        }
    }
}