package com.example.gestormedicinas.presentation.ui.screens.medicines

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.gestormedicinas.presentation.navigation.Screen

@Composable
fun AddMedicinaActivity(navController: NavController) {

    var idMedicamento by remember { mutableStateOf("") }
    var nombreMedicamento by remember { mutableStateOf("") }
    var tipoMedicamento by remember { mutableStateOf("") }
    var distribuidora by remember { mutableStateOf("") }
    var composicion by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier
            //q llene toda la pantalla
            .statusBarsPadding()
        // hace que los componentes no se superpongan
        //  a las barras de estado
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)// Añadir margen alrededor del contenido

        ) {
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp), // Aumentar altura
                value = idMedicamento,
                onValueChange = { idMedicamento = it },//it es el texto q introduce
                label = { Text("ID medicamento") }
            )
            Spacer(modifier = Modifier.height(10.dp))

            //TextField para ingresar texto
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp), // Aumentar altura
                value = nombreMedicamento,
                onValueChange = { nombreMedicamento= it },//it es el texto q introduce
                // la persona q acaba de escribir
                label = { Text("Nombre de medicamento") }
            )
            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp), // Aumentar altura
                value = tipoMedicamento,
                onValueChange = { tipoMedicamento = it },//it es el texto q introduce
                // la persona q acaba de escribir
                label = { Text("Tipo de medicamento") }
            )
            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp), // Aumentar altura
                value = distribuidora,
                onValueChange = { distribuidora = it },//it es el texto q introduce
                // la persona q acaba de escribir
                label = { Text("Distribuidora") }
            )
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp), // Aumentar altura
                value = composicion,
                onValueChange = { composicion= it },//it es el texto q introduce
                // la persona q acaba de escribir
                label = {
                    Text("Composicón")
                }
            )
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = { navController.navigate(Screen.Medicinas.route) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 120.dp)
            ) {
                Text(text = "Añadir") // Texto dentro del botón
            }

        }

    }
}
@Preview(showBackground = true)
@Composable
fun AddMedicinaActivityPreview() {
    AddMedicinaActivity(navController = rememberNavController())
}