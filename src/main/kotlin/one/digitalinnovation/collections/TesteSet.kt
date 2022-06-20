package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0,"PJ")

    val funcionarios1 = setOf(pedro, maria)
    val funcionarios2 = setOf(joao)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("-------------")
    val funcionarios3 = setOf(joao, maria, pedro)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it) }

    println("-------------")
    val resultIntersect = funcionarios3.intersect(funcionarios1)
    resultIntersect.forEach { println(it) }
}