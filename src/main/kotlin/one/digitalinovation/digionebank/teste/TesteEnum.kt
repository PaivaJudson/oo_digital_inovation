package one.digitalinovation.digionebank.teste

import one.digitalinovation.digionebank.ClienteTipo

fun main() {

    ClienteTipo.values().forEach {
        elemento -> println("${elemento.name} -> ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} -> ${it.descricao}")
    }

    val obj = ClienteTipo.PF

    println(ClienteTipo.printDescricao())

}