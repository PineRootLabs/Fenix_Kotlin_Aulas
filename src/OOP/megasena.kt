package OOP

import kotlin.random.Random

fun main() {
    val quantidadeNumeros = 6
    val numerosGerados = megaSena(quantidadeNumeros)
    println("Lista gerada: $numerosGerados")
}
fun megaSena(quantidade: Int): List<Int> {
    val numeros = mutableSetOf<Int>()

    while (numeros.size < quantidade) {
        val numeroAleatorio = Random.nextInt(1, 60)
        numeros.add(numeroAleatorio)
    }
    return numeros.sorted()
}