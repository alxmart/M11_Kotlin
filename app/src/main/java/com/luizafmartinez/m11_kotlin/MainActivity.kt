package com.luizafmartinez.m11_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private lateinit var texto: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textNome)
        texto.setText("Inicial")
    }

    fun alterarTexto() {
        texto.setText("Alterado")
    }

}