
fun main() {
val mensagem = saudacao()
println(mensagem)
}

fun saudacao(): String{
println("Informe a hora atual:")
val time: Int = readln().toInt()

    return when(time) {
        0,1,2,3,4,5,6 -> "Bom madrugada!"
        7,8,9,10,11,12 -> "Bom dia!"
        13,14,15,16,17,18 -> "Boa tarde!"
        19,20,21,22,23 -> "Bom noite!"
        else -> "Horário invalido. Números validos são de 0 a 23"
    }
}