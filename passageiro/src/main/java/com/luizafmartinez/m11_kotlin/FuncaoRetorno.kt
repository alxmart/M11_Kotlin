package com.luizafmartinez.m11_kotlin

fun somando(): Unit {  // Unit => Sem retorno, pode omitir no código
    println( 3 + 4 )
}

fun somarv2(): Int {
    // println( 5 + 5 )
    var soma = 5 + 5
    return soma
}

fun main() {

    //println(somarv2())
    val retorno = somarv2()
    println( retorno * 2 )



}