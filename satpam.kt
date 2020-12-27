package inheritance

class satpam {
    var nik: String = ""
    var nama: String = ""
    var alamat: String = ""

    var nip: String = ""
    var gaji: Int = 0
    var pos: String = ""

    fun perkenalan() {
        println("Halo, nama saya $nama, alamat saya di $alamat")
    }

    fun bekerja() {
        println("Saya bekerja dengan gaji $gaji")
    }

    fun menjaga() {
        println("saya menjaga di pos $pos")
    }
}