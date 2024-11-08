package com.example.prova_pratica

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SemestreAdapter(
    private val context: Context,
    private val semestres: List<Semestre>?,
    private val onClickListener: SemestreOnClickListener
) : RecyclerView.Adapter<SemestreAdapter.SemestreViewHolder>() {
        interface  SemestreOnClickListener{
            fun onClickSemestre(holder: SemestreViewHolder?, idx: Int)
        }

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): SemestreViewHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.adapter_semestre, viewGroup, false)
        return SemestreViewHolder(view)
    }

    override fun getItemCount(): Int = semestres?.size ?: 0

    override fun onBindViewHolder(holder: SemestreViewHolder, position: Int) {
        val semestre = semestres?.get(position) ?: return
        holder.tSemestre.text = semestre.semestre

        holder.itemView.setOnClickListener {
            onClickListener.onClickSemestre(holder, position)
        }
    }

    class SemestreViewHolder(view: View): RecyclerView.ViewHolder(view){
        val tSemestre: TextView = view.findViewById(R.id.TxtSemestre)
    }
    }



