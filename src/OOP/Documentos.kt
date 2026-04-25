package OOP

abstract class Documentos {
    fun processarDocumento() {
        print("Digite seu CPF ou CNPJ: ")
        val numero = readln()

        println(verificar(numero))
    }
    fun verificar(numero: String): String {
        return when (numero.length) {
            11 -> "Documento: $numero | Tipo: CPF | Status: Válido"
            14 -> "Documento: $numero | Tipo: CNPJ | Status: Válido"
            else -> "Erro: O documento $numero é inválido digite seu CPF ou CNPJ."
        }
    }
}
class Cpf : Documentos()
class Cnpj : Documentos()

fun main() {
    val app = Cpf()
    app.processarDocumento()
}