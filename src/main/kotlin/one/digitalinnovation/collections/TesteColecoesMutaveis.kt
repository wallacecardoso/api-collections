package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0,"PJ")

    println("-----LIST----") //lista
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("--ADICIONAMOS--")
    funcionarios.add(pedro)
    for (value in funcionarios)
        println(value)

    println("--REMOVEMOS--")
    funcionarios.remove(joao)
    funcionarios.forEach{println( it )}

    println("-----SET-----") //conjunto
    val funcionariosSet = mutableSetOf(joao)
    //funcionarios.forEach { println(it) }

    funcionariosSet.add(maria)
    funcionariosSet.add(pedro)
    funcionariosSet.forEach{println(it)}
}