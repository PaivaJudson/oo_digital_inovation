package one.digitalinovation.digionebank.teste

import one.digitalinovation.digionebank.Banco

fun main() {

    val bfa = Banco("BFA", numero = 2)
    val bpi = bfa.copy(nome = "BPI")


    println("Nome do Banco = ${bfa.nome}; Número = ${bfa.numero}")
    println("Nome do Banco = ${bpi.nome}; Número = ${bpi.numero}")
    println(bpi.info())
}