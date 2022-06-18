package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray (3)
    salarios [0] = 2000.0
    salarios [1] = 1000.0
    salarios [2] = 500.0

    salarios.forEach{println(it)}
    println("---")

    var aumento = 1.1

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumento //Dei um aumento para cada salário com o valor contido
    }                                        // na variável "aumento"
    salarios.forEach{println(it)}
    println("------")

    val salarios2 = doubleArrayOf(1300.0, 1200.0, 500.0)
    salarios2.forEachIndexed { index, salario ->
        salarios2[index] = salario * aumento
    }
    salarios2.sort()
    salarios2.forEach{println(it)}
}