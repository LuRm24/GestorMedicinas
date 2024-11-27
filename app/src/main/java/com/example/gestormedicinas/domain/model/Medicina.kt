package com.example.gestormedicinas.domain.model

import java.util.Date

data class Medicina(
    val idMedicamento: Int,
    val nombreMedicamento: String,
    val dosisMg: Double,
    val tipoMedicamento: String,

)