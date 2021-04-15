package BasicSyntax

fun getStringLength(obj : Any) : Int? {
    if (obj is String){
        return obj.length
    }else{
        return null
    }
}

fun main(args : Array<String>){

}