package com.luizafmartinez.m11_kotlin

// Construtor Primário:
//class Usuario3 constructor(nome: String, sobreNome: String) {
// OU
class Usuario3 (  // Construtor Primário:
    var nome: String,
    var sobreNome: String
) {
   /* var nome: String = ""
    var sobreNome: String = ""*/

    init {
       /* this.nome = nome
        this.sobreNome = sobreNome*/
        println("Objeto inicializado")
        println("nome: $nome , Sobrenome: $sobreNome")
    }

    constructor(nome: String): this(nome, "") {  //Construtor Secundário

        println("Construtor Secundário")
    }

}

fun main() {

    //val usuario = Usuario3(nomeP = "john", sobrenomeP = "Doe")

    //val usuario = Usuario3("john","Doe")
    val usuario = Usuario3("john") // Vai executar o construtor secundario, como sobrecarga


}