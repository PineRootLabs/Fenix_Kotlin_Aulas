package OOP

fun main() {
    val userEmail = "Caio@email.com"
    loginNetflix(userEmail) { email ->
        "usuario $email acessando pelo Smart TV Samsung QLED 4K"
    }
    loginNetflix(userEmail, ::dispositivoIPhone)
}
fun loginNetflix(email: String, dispositivo: (String) -> String) {
    println("conectando com email: $email")
    val conectStatus = dispositivo(email)
    println("dispositivo conectado: $conectStatus")
}
fun dispositivoIPhone(email: String): String {
    return "usuario $email acessando pelo iPhone 16 Pro"
}