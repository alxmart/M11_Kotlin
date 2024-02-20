package com.luizafmartinez.m11_kotlin

abstract class Animal2 { // Classe pai ou super classe , Abstrata

    var cor: String = ""
    var tamanho = ""
    var peso = 0.0

    open fun correr() = println("Correr como um ")   // Método inline

    abstract fun dormir()

}

class Cao2 : Animal2() {  // Subclasse ou classe filha , Concreta

    fun latir() = println("Latir")

    override fun correr() {
        // Polimorfismo de sobreposição
        super.correr()   // Chama a implementação padrão da superclasse, método correr
        println("cão de 4 patas")
    }

    override fun dormir() {
        println("Dormir como um cão")
    }

}

class Passaro2 : Animal2() {  // Subclasse ou classe filha, Concreta

    fun voar() = println("Voar")

    override fun correr() {
        // Polimorfismo de sobreposição
        super.correr()
        println("pássaro de 2 patas")
    }

    override fun dormir() {
        println("Dormir como um pássaro")
    }
}

fun main() {

    /*val animal = Animal2()
    animal.correr()*/

   val cao = Cao2()
    cao.correr()
    // cao.latir()

    val passaro = Passaro2()
    passaro.correr()
    // passaro.voar()

}