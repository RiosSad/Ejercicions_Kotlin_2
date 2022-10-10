fun main() {
    val casas = listOf(
        Casa(2001, 250, 5, true, 'A'),
        Casa(2002, 100, 4, true, 'B'),
        Casa(2005, 50, 1, false, 'B'),
        Casa(2021, 300, 6, true, 'A'),
        Casa(2010, 500, 7, true, 'A')
    )
    println(precio(casas, 500000000.0))
}

class Casa(var anio: Int, var metros: Int, var habitaciones: Int, var garage: Boolean, var zona: Char)

fun precio(casas: List<Casa>, precio: Double): List<Pair<String, Double>> {
    val precioCasa: MutableList<Pair<String, Double>> = mutableListOf()
    var p = 0.0
    for (i in casas.indices) {
        if (casas[i].zona == 'A') {
            p = if (casas[i].garage) {
                ((casas[i].metros * 1000 + casas[i].habitaciones * 5000 + 15000) * (2022 - casas[i].anio / 100)).toDouble()
            } else {
                ((casas[i].metros * 1000 + casas[i].habitaciones * 5000) * (2022 - casas[i].anio / 100)).toDouble()
            }
        } else if (casas[i].zona == 'B') {
            p = if (casas[i].garage) {
                (casas[i].metros * 1000 + casas[i].habitaciones * 5000 + 15000) * (2022 - casas[i].anio / 100) * 1.5
            } else {
                (casas[i].metros * 1000 + casas[i].habitaciones * 5000) * (2022 - casas[i].anio / 100) * 1.5
            }
        }
        if (p <= precio) {
            val cad= "Habitaciones: "+casas[i].habitaciones.toString()+", "+"Año: "+casas[i].anio.toString()+", "+
                    "Garage: "+casas[i].garage.toString()+", "+"Zona: "+casas[i].zona.toString()+", "+
                    "Metros: "+casas[i].metros.toString()+", Precio Total:"
            precioCasa.add(Pair(cad, p))
        }
    }
    return precioCasa
}