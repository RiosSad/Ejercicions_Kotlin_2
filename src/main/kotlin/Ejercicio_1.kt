import kotlin.math.*

fun main() {

    print("Ingresa cualquier numero \n")


    val num = readLine()!!.toInt()
    if(num <= 0){
        println("Error ingresa otro valor que no sea cero")
        val num = readLine()!!.toInt()
        println()
        println("Selecciona la operacion y preciona la letra correspondiente" +
                "\nSeno (s)\nCoseno (c)\nTangente (t)\nExponencial (e)\nLogaritmo (l)")
        val ope = readLine().toString()

        calculator(ope, num)
    }else{
        println()
        println("Selecciona la operacion y preciona la letra correspondiente" +
                "\nSeno (s)\nCoseno (c)\nTangente (t)\nExponencial (e)\nLogaritmo (l)")
        val ope = readLine().toString()

        calculator(ope, num)
    }

}

fun calculator(ope: String, value: Int) {

    for (i in 1..value) {
        val v=
            when (ope) {
                "s" -> sin(i.toDouble())
                "c" -> cos(i.toDouble())
                "t" -> tan(i.toDouble())
                "e" -> exp(i.toDouble())
                "l" -> ln(i.toDouble())
                else -> 0.0
            }
        if(v<0){
            println("$i -> $v")
        }else{
            println("$i ->  $v")
        }
    }
}