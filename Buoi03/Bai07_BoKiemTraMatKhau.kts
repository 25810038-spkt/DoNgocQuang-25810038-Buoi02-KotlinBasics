fun BoKiemTraMatKhau() {
    val kiemTraDoDai: (String) -> Boolean = { input -> input.length > 8 }
    println(kiemTraDoDai("asdfghjk"))
    println(kiemTraDoDai("asdfghjkl"))
    println(kiemTraDoDai("asdfghj"))
}

BoKiemTraMatKhau()