fun TaiKhoanNganHang() {
    // số dư ban đầu không thay đổi giá trị vì vậy dùng val
    val sodubandau = 5_000_000
    // số dư hiện tại có thể thay đổi vì vậy dùng var
    var sodu = sodubandau
    sodu += 2_000_000
    sodu -= 1_500_000
    print("Số dư: $sodu")
}

TaiKhoanNganHang()