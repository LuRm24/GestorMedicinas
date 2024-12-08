package com.example.gestormedicinas.presentation.ui.screens.products


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete


import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.gestormedicinas.domain.model.Medicina

@Composable
fun AddProductScreen(navController: NavController) {
    val medicinas = listOf(
        Medicina(1, "Ibuprofeno", 600.0, "Antiinflamatorio"),
        Medicina(2, "Pregabalina", 100.0, "Anticonvulsivante y modulador del dolor neuropático"),
        Medicina(3, "Lotensil", 10.0, "Hipertensión y presión alta"),
        Medicina(4, "Sintrom", 4.0, "Anticoagulante"),
        Medicina(5, "Dexametasona", 4.0, "Corticoide"),
        Medicina(6, "Paracetamol", 1000.0, "Analgésico y antipirético")
    )
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)

    ) {
        items(medicinas) { medicina ->
            MedicinaCard(medicina = medicina)
        }
    }
}

@Composable
fun MedicinaCard(medicina: Medicina) {
    var isSelected by remember { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = if (isSelected) Icons.Default.Close else Icons.Default.Add,
                    contentDescription = null,
                    tint = Color(0xFFFFD700),
                    modifier = Modifier
                        .size(24.dp)
                        .clickable { isSelected = !isSelected })

                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = medicina.nombreMedicamento,
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.Black
                )

            }
            if (isSelected) {
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "${medicina.dosisMg}mg - ${medicina.tipoMedicamento}",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun AddProductScreenPreview() {
    AddProductScreen(navController = rememberNavController())

}
