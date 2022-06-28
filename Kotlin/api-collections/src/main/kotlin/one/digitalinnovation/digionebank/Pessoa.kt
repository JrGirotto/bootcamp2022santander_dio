package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Junior"
    var cpf: String = "123.123.123-90"
    private set

    constructor()

    fun pessoaInfo() = "$nome + $cpf"

//    inner class Endereco {
//        var rua: String = "Rua dos Códigos"
//    }
}
fun main() {
    val junior = Pessoa()

    println(junior)
    println(junior.nome)
    println(junior.pessoaInfo())

//    println(junior.Endereco().rua)
}