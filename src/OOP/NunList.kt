package OOP
fun NunList(lista: List<Int>): Int {
    var soma = 0
    for (numero in lista) {
        soma += numero
    }
    return soma
}

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val resultado = NunList(numeros)
    val listaFormatada = numeros.joinToString(",")
    println("A soma da lista $listaFormatada é: $resultado")
}