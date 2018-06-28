package com.sujeong.a3thseminar
//1번
data class KaKaoData ( //data클래스 같은 경우 소괄호로 연다. 자바에선 생성자들과 메소들을 써줘야만 했는데 코틀린에서 data라고 추가만 해줬는데 이것이 자바의 내용을 다 담고있음
    var profile : Int,
    var name : String,
    var preView : String,
    var date : String
)