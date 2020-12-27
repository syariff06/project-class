package inheritance

class Bendahara {
    var nik: String = ""
    var nama: String = ""
    var alamat: String = ""

    var gaji: Int = 0
    var jabatan: String = ""

    fun perkenalan() {
        println("Halo Assalamualaikum, kenalkan nama saya $nama, Saya berasal dari $alamat")
    }

    fun bekerja() {
        println("Saya bekerja dengan gaji $gaji")
    }

    fun bertugas() {
        println("saya bertugas sebagai $jabatan")
    }
}