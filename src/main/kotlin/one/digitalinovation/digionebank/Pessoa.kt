package one.digitalinovation.digionebank

class Pessoa {

    var nome: String = "Judson"
    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "Nome = $nome e CPF = $cpf"

}


fun main() {
    val person = Pessoa()

    println("${person.pessoaInfo()}")

}