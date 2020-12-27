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

    val Sarah = Pegawai()
    Sarah.nik = "19367"
    Sarah.nama = "Sarah Villoid"
    Sarah.alamat = "Tangerang"
    Sarah.perkenalan()
    Sarah.gaji = 6000000
    Sarah.bekerja()
    Sarah.jabatan = "Pegawai Sekolah"
    Sarah.bertugas()

    val Ismail = PenjagaSekolah()
    Ismail.nik = "00000"
    Ismail.nama = "Ismail Zukki"
    Ismail.alamat = "Sikka Flores"
    Ismail.perkenalan()
    Ismail.gaji = 1200000
    Ismail.bekerja()
    Ismail.jabatan = "Penjaga Sekolah"
    Ismail.bertugas()

    val Udin = PembersihSekolahh()
    Udin.nik = "00000"
    Udin.nama = "Udin Ibrahim"
    Udin.alamat = "Ende Flores"
    Udin.perkenalan()
    Udin.gaji = 800000
    Udin.bekerja()
    Udin.jabatan = "Pembersih Sekolah"
    Udin.bertugas()

    val Aisyah = Guru()
    Aisyah.nik = "02020"
    Aisyah.nama = "Aisyah Suwetty"
    Aisyah.alamat = "Ende Flores"
    Aisyah.perkenalan()
    Aisyah.gaji = 4500000
    Aisyah.bekerja()
    Aisyah.kelas = "Guru"
    Aisyah.mengajar()

    val Suwaldi = Murid()
    Suwaldi.nim = "191341"
    Suwaldi.nama = "Suwaldi Syariff"
    Suwaldi.alamat = "Ende Flores"
    Suwaldi.perkenalan()
    Suwaldi.kelas = "Siswa Kelas 12"
    Suwaldi.belajar()

    val Amirul = satpam()
    Amirul.nik = "191341"
    Amirul.nama = "Amirul Mukminin"
    Amirul.alamat = "Ende Flores"
    Amirul.perkenalan()
    Amirul.gaji = 2100000
    Amirul.pos = "Security Garda Terdepan"
    Amirul.menjaga()

}

