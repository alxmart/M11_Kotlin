package com.luizafmartinez.m11_kotlin

fun main() {

    val notaAluno = 9
    val condicao = notaAluno >= 6

    if (condicao) {
        println("Aluno aprovado")
    } else {
        println("Aluno Reprovado !")
    }

    val opcao = 10

    if (opcao == 1) {
        println("Conta Corrente")
    } else if (opcao == 2) {
        println("Cartão de Crédito")
    } else if (opcao == 3) {
        println("Aplicações")
    } else if (opcao == 4) {
        println("Empréstimos")
    } else {
        println("Digite uma opção válida")
    }

    val opt = 6
    if ( opt in 1..3 ) {
        println("opções 1 a 3")
    } else if ( opt in 4..8 ) {
        println("opções 4 a 8")
    } else {
        println("Diigte opcao válida, de 1 a 8")
    }


}