package com.luizafmartinez.m11_kotlin

import com.luizafmartinez.m11_kotlin.JavaCompanionObject.UsuarioJ

fun main() {

    UsuarioJ.verificarUsuarioLogado()

    val retorno = UsuarioJ.verificarUsuarioLogado()

    println("Usuario logado:$retorno")

   var qtd = UsuarioJ.QUANTIDADE_CONEXOES_SIMULTANEAS;

  println("Qtd conexões: " + qtd);

}