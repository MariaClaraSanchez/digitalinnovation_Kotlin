package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.ClienteTIpo

fun main() {
    ClienteTIpo.values().forEach {  elemento ->
        println("${elemento.name} - ${elemento.descricao}")

    }

    ClienteTIpo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTIpo.PF
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTIpo.PJ
    println(">> ${pj.name} - ${pj.descricao}")


}