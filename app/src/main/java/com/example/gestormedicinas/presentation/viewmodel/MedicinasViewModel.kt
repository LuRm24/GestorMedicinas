package com.example.gestormedicinas.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.gestormedicinas.domain.model.Medicina
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MedicinasViewModel : ViewModel() {
    private val _medicinas = MutableStateFlow<List<Medicina>>(
        listOf(
            Medicina(1, "Ibuprofeno", 600.0, "Antiinflamatorio"),
            Medicina(2, "Pregabalina", 100.0, "Anticonvulsivante y modulador del dolor neuropático"),
            Medicina(3, "Lotensil", 10.0, "Hipertensión y presión alta"),
            Medicina(4, "Sintrom", 4.0, "Anticoagulante"),
            Medicina(5, "Dexametasona", 4.0, "Corticoide"),
            Medicina(6, "Paracetamol", 1000.0, "Analgésico y antipirético")
        )
    )
    val medicinas: StateFlow<List<Medicina>> = _medicinas

    fun addMedicina(medicina: Medicina) {
        _medicinas.value = _medicinas.value + medicina
    }


}