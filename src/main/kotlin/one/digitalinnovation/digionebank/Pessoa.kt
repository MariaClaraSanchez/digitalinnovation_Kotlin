package one.digitalinnovation.digionebank

class Pessoa {
    var nome : String = "Maria"
    var cpf : String = "128.348.496-09"
    private set


    constructor()

    fun person() = "$nome e $cpf"


}

fun main() {
    val maria = Pessoa()

    println(maria.person())

}