package Class

class Person2(val name : String) {
    constructor(name : String, parent : Person2):this(name){

    }
    constructor() : this("파인애플",Person2()){

    }
}