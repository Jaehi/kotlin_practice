fun main(args:Array<String>){
    var name1 : String = "이름" //읽기 쓰기 가능
    val name2 : String = "이름" // 읽기만 가능
    name1 = "atom"

    // name2 = "buzz" val은 값을 바꿀수 없어 오류가 난다.
    print(name1) // atom 출력
    print(name2) // 이름 출력

   // var number : Int = null number란 변수는 Non-null 타입이라 null값을 가질 수 없다
    var number : Int? = null
}