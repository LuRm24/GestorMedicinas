package com.example.gestormedicinas.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.gestormedicinas.domain.model.Medicina
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MedicinaViewModel : ViewModel() {
    private val _medicina = MutableStateFlow(
        Medicina(0, "", 0.0, "")
    )
    val medicina: StateFlow<Medicina> = _medicina

    fun setId(id: Int) {
        _medicina.value = medicina.value.copy(
            idMedicamento = id
        )
    }

    fun setNombre(nombre: String) {
        _medicina.value = medicina.value.copy(
            nombreMedicamento = nombre
        )
    }

    fun setDosisMg(dosis: Double) {
        _medicina.value = medicina.value.copy(
            dosisMg = dosis
        )
    }
    fun setTipoMedicamento(tipo: String) {
        _medicina.value = medicina.value.copy(
            tipoMedicamento = tipo
        )
    }
}