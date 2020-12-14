fun main() {

    val waldi : Human = Human("Suwaldi")
    val andi : Human = Human("Andi")

    waldi.email = "syarif06@gmail.com"
    waldi.address = "Condongcatur, sleman, Yogyakarta"

    andi.email = "andi@gmail.com"
    andi.address = "Kotagede,Yogyakarta"

    waldi.talk()
    andi.talk()

    waldi.introduce()
}