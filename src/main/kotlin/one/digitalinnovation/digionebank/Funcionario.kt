package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    name: String,
    cpf: String,
    val salario: Double,
) : Pessoa(name,cpf){
    protected abstract fun calculoAuxilio() : Double

    override fun toString(): String = """
        Nome: $name
        cpf:$cpf
        salario:$salario
        auxilio :  ${calculoAuxilio()}
    """.trimIndent()
}