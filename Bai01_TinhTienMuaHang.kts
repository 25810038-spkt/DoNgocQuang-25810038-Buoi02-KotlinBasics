fun TinhTienMuaHang() {
    val soluong: Int = 2
    val dongia: Double = 2.0
    val soluongCasted: Double = soluong.toDouble()
    var tienhang = (soluong * dongia)
    tienhang += (tienhang * 8) / 100
    print("$tienhang VND")
}

TinhTienMuaHang()