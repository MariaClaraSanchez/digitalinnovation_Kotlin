package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista

fun main() {

    println("***************************************************")
    val Mary = Analista(name = "Maria Clara", cpf = "12345678910", salario = 2000.0)

    imprimeRelatorioFuncionario.printar(Mary)
}