fun main(args:Array<String>){
    val name : String = "응엥"
    val age : Int = 29
    val address : String = "서울"

    println("$name 는 현재 $age 살이고 $address 에 살고있다")

    var a = 1
    var s1 = "a is $a"
    a = 2
    println("${s1.replace("is","was")},but now is $a")
}