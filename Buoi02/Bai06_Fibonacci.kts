fun Fibonacci() {
    var first = 0
    var second = 1
    println("index: 0, fibonacci: $first")
    println("index: 1, fibonacci: $second")

    for (i in 2..11) {
        val tmp = second
        second += first
        first = tmp
        println("index: $i, fibonacci: $second")
    }
}

Fibonacci()