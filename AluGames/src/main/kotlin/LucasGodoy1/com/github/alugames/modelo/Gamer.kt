package LucasGodoy1.com.github.alugames.modelo

import kotlin.random.Random

data class Gamer(var nome:String, var email:String){

    var dataNascimento:String? = null
    var usuario:String? = null
    var idInterno:String? =  null
        private set

    constructor(nome: String, email: String, dataDeNascimento:String, usuario:String):this(nome, email) {
        this.dataNascimento = dataNascimento
        this.usuario = usuario
        this.criarIDIntero()
    }

    override fun toString(): String {
        return "Gamer(nome='$nome', email='$email', dataNascimento=$dataNascimento, usuario=$usuario, idInterno=$idInterno)"
    }

    fun criarIDIntero(){
        val numero = Random.nextInt(10000)
        val tag = String.format("%04d", numero)
        this.idInterno = "$usuario#$tag"
    }


}
