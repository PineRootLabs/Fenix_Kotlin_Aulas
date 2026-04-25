package OOP

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Int,
    val genero: String,
    val paginas: Int
)

fun main() {
    val biblioteca = listOf(
        Livro("O Hobbit", "J.R.R. Tolkien", 1937, "Fantasia", 310),
        Livro("1984", "George Orwell", 1949, "Distopia", 328),
        Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, "Fábula", 96),
        Livro("Sapiens", "Yuval Noah Harari", 2011, "História/Antropologia", 464),
        Livro("O Alquimista", "Paulo Coelho", 1988, "Ficção", 208),
        Livro("Frankenstein", "Mary Shelley", 1818, "Terror/Ficção Científica", 280),
        Livro("Duna", "Frank Herbert", 1965, "Ficção Científica", 688)
    )

    for (livro in biblioteca) {
        infoLivro(livro)
    }
}

fun infoLivro(livro: Livro) {
    println("-_ $livro _-")
}