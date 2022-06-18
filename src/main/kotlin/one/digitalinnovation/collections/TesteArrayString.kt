package one.digitalinnovation.collections

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Go"
    nomes[1] = "Kotlin"
    nomes[2] = "Java"

    nomes.forEach {println(it)}

    println("-------")
    nomes.sort()
    nomes.forEach {println(it)}

    println("-----")
    val nomes2 = arrayOf("HTML", "CSS", "JavaScript")
    nomes2.forEach { println(it) }

    println("-----")
    nomes2.sort()
    nomes2.forEach{println(it)}

}