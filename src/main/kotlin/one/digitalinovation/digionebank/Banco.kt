package one.digitalinovation.digionebank

data class Banco(val nome: String, val numero: Int){
    fun info(): String = "Nome do Banco = ${nome}; Número do banco = ${numero}"
}
