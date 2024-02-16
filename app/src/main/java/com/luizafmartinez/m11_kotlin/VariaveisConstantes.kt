package com.luizafmartinez.m11_kotlin

class Usuario {

}

fun retornaNomeUser() {
    // Processa e retorna o nome
}

// Constante Global | tempo de compilação
const val mentor = "Jamilton Damasceno"

fun main() {

    println("Hello world !")

    var nome = "Jamilton"
    nome = "Homer"
    println("Nome: $nome")

    val nomeDog: String = "\"Camarelo\"" // Constante em tempo de execução
    //nomeDog = "Bob" // imutável
    println("Nome do cachorro é: $nomeDog")

    val num1 = 20
    val num2 = 10
    val resultado= num1 + num2
    println("Resultado: $resultado")

    // Tipos:
    // Byte, Int, Short, Long, Double, Float, Boolean, Char

    var preco: Double = 9.99
    println("Preço: $preco")

    val maxAlunosTurma: Int = 45
    println("O número máximo de alunos por turma é: $maxAlunosTurma")

    println("My Android's Mentor name is: $mentor")

    val nomeUsuario = retornaNomeUser()

    val usuario = Usuario() // Instanciando objeto usuario

 // var usuario = new Usuario();  ( JAVA )

}