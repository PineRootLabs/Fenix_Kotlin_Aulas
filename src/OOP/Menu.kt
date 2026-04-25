package OOP
import java.lang.IO.readln

val Menu = listOf(
    TipoDeCafe.CaféTradicional,
    TipoDeCafe.Expresso,
    TipoDeCafe.CaféGelado,
    TipoDeCafe.Capuccino,
    TipoDeCafe.Latte,
    TipoDeCafe.Mocha,
    TipoDeCafe.Macchiato,
    TipoDeCafe.Irish
)

enum class TipoDeCafe  {
    CaféTradicional,
    Expresso,
    CaféGelado,
    Capuccino,
    Latte,
    Mocha,
    Macchiato,
    Irish
}

fun FazerPedido() {
    val fazerPedido = readln(":")
    val pedido = fazerPedido
    println("Você pediu um: $pedido")
}

fun main() {
    println("Menu de: $Menu")
    FazerPedido()
}