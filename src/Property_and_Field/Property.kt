package Property_and_Field

fun main() {
    var ad  = Adress()
    println(ad.name)

}

class Adress{
    var name : String = "Kotlin"

       //Custom accessors
        get() {
            return field + "!"
        }
        set(value) {
            field = value
        }
}