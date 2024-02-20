package com.luizafmartinez.m11_kotlin

class Carro2(
    var modelo: String = "",
    var velocidade: Int = 0
) {

    companion object {  // Não precisa instanciar Carro2 para utilizar

        const val VELOCIDADE_MAX_PERMITIDA = 120   // Atributo de classe, não de instância

        fun exibirVelocidadeMaxima() {  // Método de classe, não de instância
            println("A velocidade máxima é: ${VELOCIDADE_MAX_PERMITIDA}")
        }
    }

    fun exibirInformacoes() {
        println("Informações: $modelo e $velocidade")
    }
}

class Usuario4() {

    //companion object regras {
    companion object {
        fun verificarUsuarioLogado(): Boolean {
            // Verificar se user está logado, etc
            return true
        }
    }

}

fun main() {

    println("Velocidade máxima: ${Carro2.VELOCIDADE_MAX_PERMITIDA}")

    Carro2.exibirVelocidadeMaxima()

    val fusca = Carro2("Fusca", 100)
    fusca.exibirInformacoes()

    println("PI: ${Math.PI}") // Não criou instância

    val ferrari = Carro2("Ferrari", 200)
    ferrari.exibirInformacoes()

    //---------------------------------------------------------

    //    val usuario = Usuario4()
    //    usuario.verificarUsuarioLogado()

    //val retorno = Usuario4.regras.verificarUsuarioLogado() //Método de classe,usou companion object
    val retorno = Usuario4.verificarUsuarioLogado() //Método de classe,usou companion object
    println("Usuario logado: $retorno")

}

/*

//=====================================================
// JAVA   JAVA   JAVA   JAVA   JAVA
//=====================================================

class Usuario4 {

    final static int QUANTIDADE_CONEXOES_SIMULTANEAS = 2;

    static boolean verificarUsuarioLogado() {
        //Verificação
        return true;
    }
}

class Companion_object {

    public static void main(String[] args) {

        boolean retorno = Usuario4.verificarUsuarioLogado();

        int qtd = Usuario4.QUANTIDADE_CONEXOES_SIMULTANEAS;

        System.out.println("Usuario logado:" + retorno);

        System.out.println("Qtd conexões:" + qtd);
    }
}

*/