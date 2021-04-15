package BasicSyntax

fun described(obj : Any){
    when(obj){
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown"
    }
}