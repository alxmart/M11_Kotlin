package com.luizafmartinez.m11_kotlin

class Usuario2 {


    fun logar(email: String, senha: String) {

        println("Logado com e-mail: $email e senha: $senha")
    }

    fun logar(token:Int) {

        println("Logado com Token: $token")
    }

    fun logar(numeroTelefone: String) {

        println("Logado com Telefone: $numeroTelefone")
    }

}



fun main() {

    val usuario = Usuario2()
    //usuario.logar("homer@nuclear.com", "123456")
    //usuario.logar("124578986532")
    usuario.logar("(11)1111-2222")




}