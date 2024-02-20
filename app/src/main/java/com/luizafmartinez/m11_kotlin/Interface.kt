package com.luizafmartinez.m11_kotlin

interface Presidenciavel {

    fun candidatarse()
}


abstract class Pessoa {

    fun comer() = println("Comer")

    //abstract fun candidatarse()
}


class DesenvolvedorAndroid()  : Pessoa() {

    fun programar() = println("programar")
}


class DesenvolvedorWeb()  : Pessoa() {

}


class Jornalista()  : Pessoa(), Presidenciavel  { //Implementa interface Presidenciavel

    fun escrevernoticia() = println("Escrever notícia")

    override fun candidatarse() {

        println("Fazer processo para se candidatar.")
    }
}


class FuncionarioPublico() : Pessoa() {

}

fun main() {

    val devAndroid = DesenvolvedorAndroid()
    devAndroid.comer()
    println("---------------------------------")

    val jornalista = Jornalista()
    jornalista.comer()
    jornalista.candidatarse()

}
