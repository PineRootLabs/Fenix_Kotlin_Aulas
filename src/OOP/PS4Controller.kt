package OOP

class PS4Controller {
    class Button(val name: String) {
        fun press() {
            println("$name botão: pressionado!")
        }
    }
    val triangulo = Button("Triangulo")
    val circulo = Button("Circulo")
    val cruz = Button("Cruz")
    val quadrado = Button("Quadrado")
    val l1 = Button("L1")
    val r1 = Button("R1")

    val todosOsBotoes = listOf(triangulo, circulo, cruz, quadrado, l1, r1)

    fun press() {
        println("PS4 Controller com Triangulo, Circulo, Cruz, Quadrado, L1, R1")
        print("Digite o nome de um botão: ")
        val entrada = readln()

        val botaoEncontrado = todosOsBotoes.find { it.name.equals(entrada, ignoreCase = true) }

        if (botaoEncontrado != null) {
            // Se achou, ele usa a função press() que a gente criou na classe Button
            botaoEncontrado.press()
        } else {
            // Se não achou, eu mostro os nomes certinhos usando o "map"
            val nomesValidos = todosOsBotoes.joinToString(", ") { it.name }
            println("$entrada : Erro!! - - Os Botões Funcionais são: $nomesValidos")
        }
    }
}

fun main() {
    val meuControle = PS4Controller()
    meuControle.press()
}