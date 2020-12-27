package inheritance

class Sekretaris {
    var nik: String = ""
    var nama: String = ""
    var alamat: String = ""

    var gaji: Int = 0
    var jabatan: String = ""

    fun perkenalan() {
        println("Halo kawan, Perkenalkan nama saya $nama, Saya berasal dari $alamat")
    }

    fun bekerja() {
        println("Saya bekerja dengan gaji $gaji")
    }

    fun bertugas() {
        println("saya bertugas sebagai $jabatan")
    }
}