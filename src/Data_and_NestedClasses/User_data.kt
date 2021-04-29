package Data_and_NestedClasses

data class User(val name : String, val age : Int)
class Nodata(var name : String, val age : Int)
data class NUser(val name : String = "", val age : Int = 0)

fun main() {
    val obj = User("coc",1)
    val nodata = Nodata("ww",1)
    val objj = NUser()
    print(obj)
    print(nodata)
    println(objj)
    val obj2 = obj.copy(age = 5)
    val obj3 = obj2.copy("zz")

    val soul = User("SOUL",17)
    val (name,age) = soul

    println("$name 이는 $age 살")

    print(obj2)
    print(obj3 )
}