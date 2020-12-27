package inheritance

class Murid {
    var nik: String = ""
    var nama: String = ""
    var alamat: String = ""

    var nim: String = ""
    var kelas: String = ""

    fun perkenalan() {
        println("Halo teman teman, nama saya $nama, alamat tempat tinggal saya di $alamat")
    }

    fun belajar() {
        println("saya siswa kelas $kelas sekolah menengah atas")
    }
}