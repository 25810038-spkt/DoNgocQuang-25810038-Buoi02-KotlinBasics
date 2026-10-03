fun WhileVaRepeat() {
    var demso = 10

    // dùng while khi không biết số lần lặp
    while (demso >= 1) {
        println(demso)
        demso--
    }

    // dùng repeat khi biết chính xác số lần lặp
    repeat(5) {
        println("in")
    }
}

WhileVaRepeat()