package com.example.prova_pratica
data class Semestre(val semestre: String)

object SemestreData{
    fun getSemestre(): List<Semestre>{
        return listOf(
            Semestre("1° Semestre 2020"),
            Semestre("2° Semestre 2020"),
            Semestre("1° Semestre 2021"),
            Semestre("2° Semestre 2021"),
            Semestre("1° Semestre 2022"),
            Semestre("2° Semestre 2022"),
            Semestre("1° Semestre 2023"),
            Semestre("2° Semestre 2023"),
            Semestre("1° Semestre 2024"),
            Semestre("2° Semestre 2024"),
        )
    }
}