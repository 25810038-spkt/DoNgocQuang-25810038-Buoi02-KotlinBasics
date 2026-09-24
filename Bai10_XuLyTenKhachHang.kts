fun XuLyTenKhachHang1() {
    val tenkhachhang: String? = null
    val len: Int? = tenkhachhang?.length
    println("safe call? $len")
}

fun XuLyTenKhachHang2() {
    val tenkhachhang: String? = null
    val ten = tenkhachhang?.length ?: "Khách vãng lai"
    println("Elvis ?: $ten")
}

fun XuLyTenKhachHang3() {
    val tenkhachhang: String? = null
    // bởi vì biến tenkhachhang chứa giá tri null, khi runtime thì bắt gặp lỗi NullPointerException
    val len: Int = tenkhachhang!!.length
    println("!! $len")
}


XuLyTenKhachHang1()
XuLyTenKhachHang2()
XuLyTenKhachHang3()