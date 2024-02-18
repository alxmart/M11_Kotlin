package com.luizafmartinez.m11_kotlin

fun main() {

    //   +, -, /, * , %
    val n1 = 10
    val n2 = 20
    var resultado = n1 + n2
    println(resultado)
    resultado = (2 +2) * 2
    println(resultado)

    //   >, >=, <, <=, ==, !=
    var result = 2 > 5
    println(result) // false

    result = 8 == 5
    println(result) // false

    result = 8 == 8
    println(result) // true

    //   && (AND),  || (OR) , ! (NOT)

    result = true || false
    println(result) // true

    result = 2 > 1 && 5 > 9
    println(result) // false
    println(!result) // true

    val idadePessoa = 30
    val comprasPessoa = 300

    result = idadePessoa >= 50 && comprasPessoa >= 400 // false
    println(result)




}
