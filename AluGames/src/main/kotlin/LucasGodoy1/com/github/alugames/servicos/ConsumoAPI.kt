package LucasGodoy1.com.github.alugames.servicos

import LucasGodoy1.com.github.LucasGodoy1.com.github.alugames.modelo.InfoJogo
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse


class ConsumoAPI {

    fun buscaJogo(id: String): InfoJogo?{
        val endereco = "https://www.cheapshark.com/api/1.0/games?id=$id"
        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build()

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val json = response.body()
        val gson = Gson()

        return try {
            gson.fromJson(json, InfoJogo::class.java)
        } catch (ex: JsonSyntaxException) {
            println("Erro ao converter JSON: ${ex.message}")
            null
        } catch (ex: IllegalStateException) {
            println("Estado ilegal ao ler JSON: ${ex.message}")
            null
        }
    }
}
