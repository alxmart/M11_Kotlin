package com.luizafmartinez.m11_kotlin

class Jogador {

    //var nome: String = "Homer"
    var kart = ""
    var pneu = ""
    var planador = ""


    fun acelerar(aceleracao: Int = 0) {

        println("Acelerando na velocidade de $aceleracao km")
    }

    /*
    fun retornarPoder(): String {

       return "Casco Vermelho"
    }
    */

    fun retornarPoder(): String = "Casco Vermelho"

}


fun main() {

    // JAVA:   jogador jogador = new jogador();

    val jogador = Jogador()

    //jogador.kart = "Kart do Mario"

    jogador.acelerar(80)

    jogador.acelerar()

    jogador.acelerar(aceleracao = 80)

    //println(jogador.kart)

    println(jogador.retornarPoder())



}