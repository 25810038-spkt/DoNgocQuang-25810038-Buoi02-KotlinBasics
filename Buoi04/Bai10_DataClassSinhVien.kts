data class SinhVien(val mssv: Int, val hoTen: String, val diemTrungBinh: Double) {

}
val sv1 = SinhVien(1,"A", 1.1)
val sv2 = SinhVien(1,"A", 1.1)
println(sv1)
println(sv1 == sv2)
val sv3 = sv1.copy(diemTrungBinh = 3.3)
println(sv3)