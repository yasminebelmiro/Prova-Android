package com.example.prova_pratica


import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener

import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    private lateinit var textCpf: TextView
    private lateinit var textValor: TextView
    private lateinit var textResumo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val intent = intent
        val CPF = intent.getStringExtra("CPF")
        val Valor = intent.getStringExtra("Valor")
        textCpf = findViewById(R.id.editTextCPF2)
        textValor = findViewById(R.id.editTextValor)

        textResumo = findViewById(R.id.textResumo)

        textCpf.text = CPF
        textValor.text = Valor


    }
     fun onClickSaque(view: View){
         val intent = intent
         val CPF = intent.getStringExtra("CPF")
         val Valor = intent.getStringExtra("Valor")
         textCpf = findViewById(R.id.editTextCPF2)
         textValor = findViewById(R.id.editTextValor)

         textResumo = findViewById(R.id.textResumo)

         textCpf.text = CPF
         textValor.text = Valor
        val semestre = SemestreData.getSemestre()
        if(semestre.equals("1° Semestre 2020") || semestre.equals("1° Semestre 2020")){
            textResumo.text = ((Valor?.toInt() ?: 0) * 0.1).toString()
        }else textResumo.text = "nada aqui"
    }
}