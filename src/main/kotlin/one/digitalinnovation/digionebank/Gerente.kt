package one.digitalinnovation.digionebank

class Gerente (
    name: String,
    cpf: String,
    salario: Double
): Funcionario(name = name, cpf = cpf, salario = salario){
    override fun calculoAuxilio() = salario * 0.4
}
