fun main(args: Array<String>) {
    // (1) 인사말 출력
    // (2) 사용자 이름 입력 받기
    // (3) 입력 받은 사용자 이름 출력

    println("안녕하세요, Shopmall에 오신 것을 환영합니다!")
    println("쇼핑을 계속 하시려면 이름을 입력해 주세요: ")

    val name = readLine()   // 화면에서 사용자 입력받기

    println("""
        감사합나다. 반갑습니다. $name 님
        원하시는 카테고리를 입력해주세요.
        ***===============================***
    """.trimIndent())
}