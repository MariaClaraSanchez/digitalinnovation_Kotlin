package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Funcionario

class imprimeRelatorioFuncionario {
    companion object{
        fun printar(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}