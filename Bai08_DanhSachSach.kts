fun DanhSachSach() {
    val bookList: MutableList<String> = mutableListOf("Sách A","Sách E","Sách D","Sách C","Sách B")
    println(bookList)
    bookList.add("Sách G")
    bookList.add("Sách F")
    bookList.remove("Sách A")
    bookList.sort()
    println(bookList)
}

DanhSachSach()