fun main() {
    val lista = listOf(10, 20, 30, 70, 80, 50, 100, 33, 0, 100)
    println(grades(lista))
}

fun grades(notes: List<Int>): List<Pair<Int, String>> {
    val Notas: MutableList<Pair<Int, String>> = mutableListOf()
    for (i in notes.indices) {
        val effort = when (notes[i]) {
            in 0..69 -> "Insuficiente"
            in 70..74 -> "Suficiente"
            in 75..84 -> "Bueno"
            in 85..94 -> "Notable"
            in 95..100 -> "Excelente"
            else -> " "
        }
        Notas.add(Pair(notes[i], effort,))
    }
    return Notas
}