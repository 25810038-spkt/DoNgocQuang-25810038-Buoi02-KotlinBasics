fun PhanLoaiBMI() {
    val cannang = 55
    val chieucao = 1.75
    val chisocothe = cannang / (chieucao * chieucao)
    print("Chỉ số: $chisocothe")
    if (chisocothe < 10) {
        print(" - Gầy")
    } else if (chisocothe < 20) {
        print(" - Bình thường")
    } else {
        print(" - Thừa cân")
    }
}

PhanLoaiBMI()