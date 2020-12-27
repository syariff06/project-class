package inheritance

class Guru {
    var nik: String = ""
    var nama: String = ""
    var alamat: String = ""

    var nim: String = ""
    var gaji: Int = 0
    var kelas: String = ""

    fun perkenalan() {
        println("Hay anak anak, kenalkan nama saya $nama, Saya berasal dari $alamat")
    }

    fun bekerja() {
        println("Saya bekerja dengan gaji yang sepadan ialah $gaji")
    }

    fun mengajar() {
        println("saya mengajar sebagai $kelas")
    }
}