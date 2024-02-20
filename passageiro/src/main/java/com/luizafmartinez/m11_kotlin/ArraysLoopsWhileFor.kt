package com.luizafmartinez.m11_kotlin

fun main() {

    val nomes = arrayOf(
        "Homer",
        "Bart",
        "Lisa"
    )
    println(nomes[0])

    nomes[0] = "Moe"
    println(nomes[0])

    var num = 1
    while ( num <= 5) {
        println("numero: $num")
        num++
    }

    num = 0
    while ( num <= 2) {
        println("nome: ${nomes[num]}")
        num++
    }

    num = 1
    while ( num <= 5 ) {
        println("numero: $num")
        num++
    }

    val postagens = arrayOf(
        "Viagem para Lisboa",
        "Viagem para Londres",
        "Viagem para Tallinn"
    )

    for ( (index, posts) in postagens.withIndex() ) {
        println("$index: $posts")
    }

    for ( x in 1..6) {
        println(x)
    }



}