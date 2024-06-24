package LucasGodoy1.com.github.alugames.principal

import LucasGodoy1.com.github.alugames.modelo.Gamer

fun main(){

    val gamer1 = Gamer("   ", "lucas@email.com")
    val gamer2 = Gamer("Lucas", "lucas@email.com", "14/11/196","LucasGodoy1")

    println(gamer1)
    println(gamer2)


    println("============================")

    println(gamer1)
    gamer1.usuario = "lukinhas"
    println(gamer1)
}