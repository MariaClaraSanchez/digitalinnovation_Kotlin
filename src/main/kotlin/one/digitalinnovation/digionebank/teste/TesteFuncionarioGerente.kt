package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {

    println("***************************************************")
    val Joao = Gerente(name = "João Pedro", cpf = "12345678910", salario = 5000.0)

    imprimeRelatorioFuncionario.printar(Joao)

}
fun imprimeRelatorio(funcionario:Funcionario) = println(funcionario.toString())