fun String.demNguyenAm(): Int {
    var count: Int = 0
    for (char in this.lowercase()) {
        if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
            count += 1
        }
    }
    return count
}
fun Int.laSoNguyenTo(): Boolean {
    if (this <= 1) return false
    for (i in 2..Math.sqrt(this.toDouble()).toInt()) {
        if (this % i == 0) return false
    }
    return true
}
println("abcdefgh".demNguyenAm())
println(3.laSoNguyenTo())