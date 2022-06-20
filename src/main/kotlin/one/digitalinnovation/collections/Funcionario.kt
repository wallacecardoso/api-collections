package one.digitalinnovation.collections

data class Funcionario (
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String = // recurso do Kotlin para formatar o retorno.
        """
            Nome:    $nome
            Salário: $salario
            
        """.trimIndent()

}