package com.luizafmartinez.m11_kotlin

open class Carro {

    //var modelo = ""

    protected open fun injetarCombustivel() {

        println("Injeção de combustível")
    }

    fun acelerar() {

        injetarCombustivel()
        println("Acelerar o carro")
    }
}

class Gol : Carro() {

    override fun injetarCombustivel() {

        super.injetarCombustivel()
    }
}

class Ferrari : Carro() {

}

fun main() {
    val carro = Carro()
    carro.acelerar()


}