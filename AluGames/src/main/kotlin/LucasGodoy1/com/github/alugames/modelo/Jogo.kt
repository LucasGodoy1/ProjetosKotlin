package LucasGodoy1.com.github.LucasGodoy1.com.github.alugames.modelo


data class Jogo (val titulo: String,
            val capa: String) {
    var descricao:String? = null


    override fun toString(): String {
        return  "Meu Jogo \n" +
                "Titulo: $titulo \n" +
                "Capa $capa \n" +
                "Descrição: $descricao"
    }


}