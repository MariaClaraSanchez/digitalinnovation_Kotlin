package one.digitalinnovation.digionebank

class Cliente(
    name: String,
    cpf: String,
    val clienteTIpo: ClienteTIpo,
    val senha: String
):Pessoa(name = name,cpf = cpf),Logavel{
    override fun login():Boolean = "123456" == senha

    override fun toString(): String = """
        Nome:$name
        cpf:$cpf
        Tipo:${clienteTIpo.descricao}
        """.trimIndent()
}
