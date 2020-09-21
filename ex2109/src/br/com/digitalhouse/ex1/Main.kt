package br.com.digitalhouse.ex1

fun main() {
    try {
        var animais = listOf("Pato", "Cachorro", "Gato")
        println("conteudo da posicao 3: ${animais.get(3)}")
    }
    catch (erro: Exception) {
        println("Erro: ${erro.message}")
        erro.stackTrace
    }
}
