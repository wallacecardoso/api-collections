package one.digitalinnovation.collections

fun main() {
    val values = IntArray(6)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2
    values[5] = 4

    for (valor in values) { /* para qualquer valor (val valor) dentro da array (values) farei... */
        println(valor)
    }
    println("-----")
    values.forEach {valor -> /* para cada ítem (val valor) dentro da array (values) farei... */
        println(valor)
    }

    println("-----")
    for (index in values.indices) { // Printo usando como referência o índice da array e não o elemento atribuído.
        println(values[index])
    }

    println("-----")
    values.sort() // Ordeno do maior para o menor e depois exibo na tela a array.
    for (valor in values) {
        println(valor)
    }
}