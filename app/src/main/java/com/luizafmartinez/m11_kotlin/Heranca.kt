package com.luizafmartinez.m11_kotlin

open class Animal { // Classe pai ou super clasee

    var cor: String = ""
    var tamanho = ""
    var peso = 0.0

    open fun correr() = println("Correr como um ")   // Método inline

    open fun dormir() {
        println("Dormir como um ")
    }
}

class Cao : Animal() {  // Subclasse ou classe filha

    fun latir() = println("Latir")

    override fun correr() {
        // Polimorfismo de sobreposição
        super.correr()   // Chama a implementação padrão da superclasse, método correr
        println("cão de 4 patas")
    }
}

class Passaro : Animal() {  // Subclasse ou classe filha

    fun voar() = println("Voar")

    override fun correr() {
        // Polimorfismo de sobreposição
        super.correr()
        println("pássaro de 2 patas")
    }
}

fun main() {

    val cao = Cao()
    cao.correr()
    // cao.latir()

    val passaro = Passaro()
    passaro.correr()
    // passaro.voar()
    
}