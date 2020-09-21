package br.com.digitalhouse.ex2

fun main() {
    val animais: MutableList<String>? = null
    animais?.add("Pato")
    animais?.add("Cachorro")
    animais?.add("Gato")

    println("Animal da posicao 2: ${animais?.get(2)}")
}