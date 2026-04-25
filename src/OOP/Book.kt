package OOP

class Book(val title: String, val author: String, var price: Double) {
    class Chapter(val title: String, val number: Int) {
        fun getChapterInfo(): String {
            return "$title - $number"
        }
    }
    fun getInfo(): String{
        return "livro: $title - $author - $price"
    }
}