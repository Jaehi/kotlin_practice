package BasicType

fun main() {
    var array : Array<String> = arrayOf("다랑어포","감자")
    println(array.size)
    println(array[0])
    println(array.get(1))
    println(array.set(0 , "연어"))
    for (x in array){
        println(x)
    }

    val a = arrayOf("a","b","c","d","e")
    val b = Array(5, { i -> i.toString()})

    for (c in a){
        println(c)
    }
    for (c in b){
        println(c)
    }

    val x : IntArray = intArrayOf(1,2,3,4,5)
    x[0] = 7
    println(x[0])
    println(x.get(0))
    println(x.size)

    var s : String = "P1harmony"

    println(s.get(3))
    println(s[1])
    println(s.length)
    for (i in s){
        print(i)
    }

    val so = "String\n"
    val me = """
        "'HIHIHIhI
        reallllll
        hiiiiiii'"
        """

    println(so)
    println(me)

}