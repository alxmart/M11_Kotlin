package com.luizafmartinez.m11_kotlin

class Carro {

    var cor = "vermelho"

    fun acelerar() {

        // ******
    }
}

fun main() {

    var carro: Carro? = null

    carro = Carro()

    val cor = carro?.cor ?: "cor padrão" // Se nulo, exibe cor padrão


//    if (carro != null) {
//
//        println(carro.cor)
//    }

    // println(carro?.cor) // Chamada segura. Testa se não está nulo para fazer a chamada

    println(cor)

}

