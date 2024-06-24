package LucasGodoy1.com.github.alugames.principal

import LucasGodoy1.com.github.alugames.modelo.Gamer

fun main(){

    val gamer1 = Gamer("Lucas", "lucas@email.com")
    val gamer2 = Gamer("Lucas", "lucas@email.com", "14/11/196","LucasGodoy1")

    println(gamer1)
    println(gamer2)

    gamer1.let {
        it.dataNascimento = "14/11/1996"
        it.usuario= "LucasGamer27"
    }

    println(gamer1)

}