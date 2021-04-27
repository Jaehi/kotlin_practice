package Class

class Customer(data : Int) {
    init {
        println("Customer data is $data")
    }


}

fun main() {
    val obj = Customer(12)
    println(obj)
}