package one.digitalinovation.digionebank

class Pessoa {

    var nome: String = "Judson"
    var cpf: String = "123.123.123-11"

}

fun main() {
    val person = Pessoa()

    println("Nome = ${person.nome}; CPF = ${person.cpf}")
}