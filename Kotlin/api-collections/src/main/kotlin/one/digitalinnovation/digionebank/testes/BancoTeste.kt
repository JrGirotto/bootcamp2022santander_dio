package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 2)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Nubank")
    //println(banco2.nome)
    //println(banco2.numero)
    println(banco2.info())
}
