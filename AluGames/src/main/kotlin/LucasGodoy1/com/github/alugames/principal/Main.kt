package LucasGodoy1.com.github.LucasGodoy1.com.github.alugames.principal

import LucasGodoy1.com.github.LucasGodoy1.com.github.alugames.modelo.Jogo
import LucasGodoy1.com.github.alugames.servicos.ConsumoAPI
import java.util.Scanner


fun main() {
    val sc = Scanner(System.`in`)

    println("Digite o codigo do jogo para buscar: ")
    val busca = sc.nextLine();


    val buscaAPI = ConsumoAPI()
    var informacaoJogo = buscaAPI.buscaJogo(busca)

    if (informacaoJogo == null) {
        println("Jogo inexistente Tente outro ID")
        return
    }

    var meuJogo: Jogo? = null

    val tratamentoDeException = runCatching {
        meuJogo = Jogo(
            informacaoJogo.info.title ,
            informacaoJogo.info.thumb)
    }

    tratamentoDeException.onFailure {
        println("Jogo inexistente. Tente outro ID")
    }
    tratamentoDeException.onSuccess {
        println("Dseja inserir uma descrição perssonalizada? [S / N]")
        val opcao = sc.nextLine()
        if (opcao.equals("s", true)) {
            println("Insira a descrição Personalizada para o Jogo")
            val descricao = sc.nextLine()
            meuJogo?.descricao = descricao

        }else{
            meuJogo?.descricao = meuJogo?.titulo
        }
            println(meuJogo)

    }
    sc.close()


}
