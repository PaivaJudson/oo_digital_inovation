package one.digitalinovation.digionebank

enum class ClienteTipo(descricao: String) {
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");

    companion object{
        fun printDescricao() = "Pessoa Física e Jurídica"
    }
}