package one.digitalinnovation.digionebank

class Pessoa {
    var nome : String = "Maria"
    var cpf : String = "128.348.496-09"
    private set

}

fun main() {
    val maria = Pessoa()

    println(maria.nome)
    println(maria.cpf)



}