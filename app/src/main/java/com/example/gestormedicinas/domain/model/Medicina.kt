package com.example.gestormedicinas.domain.model

import java.util.Date

data class Medicina(
    val idMedicamento: Int,
    val nombreMedicamento: String,
    val tipoMedicamento: String,
    val distribuidora: String,
    val composición :String
)