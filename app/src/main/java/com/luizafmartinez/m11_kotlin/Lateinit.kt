package com.luizafmartinez.m11_kotlin

class Produto {
    //var descricao: String = ""
    //var descricao: String? = null
    lateinit var descricao: String
}

fun main() {

    val produto = Produto()
    produto.descricao = "Notebook"
    println(produto.descricao)





}