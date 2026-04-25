package OOP

fun calculador(num1: Int, num2: Int) {
    var numeros1 = num1
    var numeros2 = num2
    println("Calculador")
    print("Digite o Primeiro número:")
    numeros1 = readln().toInt()
    print("Digite a chave:")
    val chave = readln()
    print("Digite o Segundo número:")
    numeros2 = readln().toInt()
    val res = when (chave) {
        "+" -> numeros1 + numeros2
        "-" -> numeros1 - numeros2
        "*" -> numeros1 * numeros2
        "/" -> numeros1 / numeros2
        "%" -> numeros1 % numeros2
        else -> "Erro de chave"

    }
    return println("O Calculo de $numeros1 $chave $numeros2 = $res")

}
fun main() {
    calculador(0 , 0)
}