package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0,"PJ")

    val funcionarios = listOf(joao, pedro, maria) // listOf

    funcionarios.forEach { println(it) }

    println("-------")
    println(funcionarios.find { it.nome == "Maria" })
    println(funcionarios.count {it.nome == "João" })

    println("-------")
    funcionarios
        .groupBy { it.tipoContratacao } //Organiza por... (ordem crescente)
        .forEach{ println( it ) }
}