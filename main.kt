package inheritance
fun main() {
    val Ibrahim = KepalaSekolah()
    Ibrahim.nik = "12345"
    Ibrahim.nama = "Ibrahim Akbar"
    Ibrahim.alamat = "Ende Flores"
    Ibrahim.perkenalan()
    Ibrahim.gaji = 10000000
    Ibrahim.bekerja()
    Ibrahim.jabatan = "Kepala Sekolah"
    Ibrahim.bertugas()

    val Siwa = WakilKepsek()
    Siwa.nik = "67890"
    Siwa.nama = "Siwa Mandaro"
    Siwa.alamat = "Ngada Flores"
    Siwa.perkenalan()
    Siwa.gaji = 9000000
    Siwa.bekerja()
    Siwa.jabatan = "Wakil Kepala Sekolah"
    Siwa.bertugas()

    val Nur = Sekretaris()
    Nur.nik = "62367"
    Nur.nama = "Nur Rizkiya"
    Nur.alamat = "Lembata Flores"
    Nur.perkenalan()
    Nur.gaji = 8300000
    Nur.bekerja()
    Nur.jabatan = "Sekretaris Sekolah"
    Nur.bertugas()

    val Ayu = Bendahara()
    Ayu.nik = "53367"
    Ayu.nama = "Ayu Azzahra"
    Ayu.alamat = "Manggarai Flores"
    Ayu.perkenalan()
    Ayu.gaji = 8100000
    Ayu.bekerja()
    Ayu.jabatan = "Bendahara Sekolah"
    Ayu.bertugas()

}