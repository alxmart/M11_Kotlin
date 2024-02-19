package com.luizafmartinez.m11_kotlin

fun somarv3(num1: Int, num2: Int = 0, num3: Int = 0) { // valor padrão = 0

    println( num1 + num2 )

}

fun main() {

    //somarv3(2,5)

    somarv3(num1 = 3, num2 = 9)
    somarv3(15) // Resultado: 15( assume valor padrão para num1 e num2)

}

