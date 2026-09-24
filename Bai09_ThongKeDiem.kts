fun ThongKeDiem() {
    val diemso = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var tongdiem = 0.0
    var diemcaonhat = diemso[0]
    var diemthapnhat = diemso[0]

    for (d in diemso) {
        tongdiem += d
        if (d > diemcaonhat) {
            diemcaonhat = d
        }
        if (d < diemthapnhat) {
            diemthapnhat = d
        }
    }

    println("Điểm trung bình: ${tongdiem / diemso.count()}")
    println("Điểm cao nhất: ${diemcaonhat}")
    println("Điểm thấp nhất: ${diemthapnhat}")
}

ThongKeDiem()