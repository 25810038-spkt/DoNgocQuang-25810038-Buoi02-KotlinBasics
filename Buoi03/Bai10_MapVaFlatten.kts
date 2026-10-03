fun mapVaFlatten() {
    val songuyen = listOf(1,2,3,4,5,6,7,8,9)
    println(songuyen.map{it * 2})
    val danhsach = listOf(setOf(1,2,3),setOf(4,5,6))
    println(danhsach.flatten())
}

mapVaFlatten()