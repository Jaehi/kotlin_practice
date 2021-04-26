package Class

class Person public  constructor(val Fname : String , val Lname : String) {
    init {
        println("Hi $Lname $Fname")
    }
}

fun main() {
    val kangfine  = Person("Kang","Fine")
}