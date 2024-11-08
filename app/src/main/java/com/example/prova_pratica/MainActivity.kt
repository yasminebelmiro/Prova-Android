package com.example.prova_pratica

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var listView: RecyclerView
    private var semestres: List<Semestre> = emptyList()
    private lateinit var adapter: SemestreAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        semestres = SemestreData.getSemestre()


        adapter = SemestreAdapter(this, semestres, onClickSemestre())
        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = adapter
    }

    private fun onClickSemestre(): SemestreAdapter.SemestreOnClickListener {
        return object : SemestreAdapter.SemestreOnClickListener {
            override fun onClickSemestre(holder: SemestreAdapter.SemestreViewHolder?, idx: Int) {

                val intent = Intent(baseContext, MainActivity2::class.java)
                val txtCpf = findViewById<EditText>(R.id.editTextCPF)
                val txtSaque = findViewById<EditText>(R.id.editTextSaque)
                intent.putExtra("CPF",  txtCpf.text.toString())
                intent.putExtra("Valor",  txtSaque.text.toString())

                startActivity(intent)

            }
        }
    }
}