fun main() {
     val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
     val resultado = listaEmDobro(numeros)
     println("A lista ${numeros.joinToString(",")} em dobro seria: $resultado")
}
fun listaEmDobro(lista: List<Int>): List<Int> {
     return lista.map { it * 2 }
}