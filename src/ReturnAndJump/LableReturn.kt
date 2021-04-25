package ReturnAndJump

fun foo(){
    var ints = listOf(0,1,2,3,4)
    ints.forEach(fun(value : Int){
        if (value == 1)return
        println(value)
    })
    println("End")
}

fun foolamb(){
    var ints = listOf(0,1,2,3,4,5)
    ints.forEach({
        if (it == 1) return
        print(it)
    })
    print("End")
}

fun foo3(){
    var ints = listOf(0,1,2,3)
    ints.forEach lable@{
        if (it == 1)return@lable
        print(it)
    }
    print("End")
}

fun foo4(){
    var ints = listOf(0,1,2,3)
    ints.forEach{
        if (it == 1) return@forEach
        print(it)
    }
    print("End")
}

fun lablereturn(): List<String> {
    var ints = listOf(0,1,2,3,4)
    val result = ints.map {
        if (it == 0){
            return@map "zero"
        }
        "number $it"
    }
    return result
}

fun main() {
    lablereturn()
}