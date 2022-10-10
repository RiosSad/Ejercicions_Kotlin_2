fun main() {
    val lista = listOf("calculo" to 70, "programacion" to 69, "fisica" to 90, "quimica" to 10, "lectura" to 100)
    println(grades(lista))
}

fun grades(notes: List<Pair<String, Int>>): List<Pair<String, String>> {
    val Notas: MutableList<Pair<String, String>> = mutableListOf()
    for (i in notes.indices) {
        val effort = when (notes[i].second) {
            in 0..69 -> "Insuficiente"
            in 70..74 -> "Suficiente"
            in 75..84 -> "Bueno"
            in 85..94 -> "Notable"
            in 95..100 -> "Excelente"
            else -> " "
        }
         Notas.add(Pair(notes[i].first.uppercase(), effort))
    }
    return Notas
}