package OOP

fun List(){
    val numero = listOf(1,2,3,4,5,6,7,8,9)
    val pares = numero.filter { it % 2 == 0 }
    println("A lista $numero possui os pares ${pares}")
}
fun main(){
    List()
}