package ReturnAndJump

fun main() {
    loop@ for (i in 1..10){
        println("---i : $i---")
        for (j in 1..10){
            if (j < 2){
                continue@loop
            }
            println("j : $j")
        }
    }
}