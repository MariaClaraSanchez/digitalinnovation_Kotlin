package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTIpo


fun main(){
    val jose  = Cliente(
        name =  "Jośe da Silva",
        cpf = "123.456.789-10",
        clienteTIpo = ClienteTIpo.PF ,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)

}
