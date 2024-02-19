package com.luizafmartinez.m11_kotlin

class ContaBancaria(

    var agencia: String = "",
    var conta: String = "",
    var senha: String = ""
) {
    var usuarioAutenticado: Boolean = false
    var saldo: Double = 0.0

    init {
        this.usuarioAutenticado = true
    }

    fun recuperarSaldo(): Double {

        if (usuarioAutenticado) {
            return this.saldo
        } else {
            return 0.0
        }
    }

    fun depositar(valor: Double) {

        this.saldo += valor
        println("Realizado depósito no valor de R$ $valor")
    }

    fun sacar(valor: Double) {

        if (valor > this.saldo) {
            println("Atenção: Você entrou no Cheque Especial")
        }

        this.saldo -= valor
        println("Realizado saque no valor de R$ $valor")
    }

    fun extrato(dias: Int) {

        println("Extrato dos últimos $dias dias")
    }

    fun extrato(datainicial: String, dataFinal: String) {

        println("Extrato no intervalo: $datainicial e $dataFinal")
    }

}

fun main() {

    val conta = ContaBancaria("0001", "888001", "123456")

    var saldoRecuperado = conta.recuperarSaldo()
    println("Conta Corrente - Agência: ${conta.agencia} , Conta: ${conta.conta} ")
    println("-------------------------------------------------------------------")
    println("Saldo: $saldoRecuperado")

    conta.depositar(200.0)
    conta.sacar(500.0)

    //println("Saldo: ${conta.recuperarSaldo()}")
    saldoRecuperado = conta.recuperarSaldo()
    println("Saldo: $saldoRecuperado")

    conta.extrato(5)

    conta.extrato("10/05/2022", "10/06/2022")
}

/*
SAÍDA GERADA:

Conta Corrente - Agência: 0001 , Conta: 888001
-------------------------------------------------------------------
Saldo: 0.0
Realizado depósito no valor de R$ 200.0
Atenção: Você entrou no Cheque Especial
Realizado saque no valor de R$ 500.0
Saldo: -300.0
Extrato dos últimos 5 dias
Extrato no intervalo: 10/05/2022 e 10/06/2022

Process finished with exit code 0

 */