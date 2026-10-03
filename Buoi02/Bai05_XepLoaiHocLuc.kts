fun XepLoaiHocLuc() {
    val diemtrungbinh: Double = 9.9

    when (diemtrungbinh) {
        in 9.0..10.0 -> print("Xuất sắc")
        in 8.0..8.9 -> print("Giỏi")
        in 6.0..7.9 -> print("Khá")
        in 5.0..5.9 -> print("Trung bình")
        else -> print("Yếu")
    }
}

XepLoaiHocLuc()