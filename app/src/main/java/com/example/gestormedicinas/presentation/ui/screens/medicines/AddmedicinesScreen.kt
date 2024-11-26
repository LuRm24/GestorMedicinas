package com.example.gestormedicinas.presentation.ui.screens.medicines

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AddMedicinaActivity() {
    var text by remember { mutableStateOf("") }
    Surface(
        modifier = Modifier
            //q llene toda la pantalla
            .statusBarsPadding()
        // hace que los componentes no se superpongan
        //  a las barras de estado
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()

        ) {
            TextField(
                modifier = Modifier,//modifier cambia cosas
                value = text,
                onValueChange = { text = it },//it es el texto q introduce
                // la persona q acaba de escribir
                label = { Text("ID medicamento") }
            )
            Spacer(modifier = Modifier.height(10.dp))

            //TextField para ingresar texto
            TextField(
                modifier = Modifier,//modifier cambia cosas
                value = text,
                onValueChange = { text = it },//it es el texto q introduce
                // la persona q acaba de escribir
                label = { Text("Nombre de medicamento") }
            )
            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                modifier = Modifier,//modifier cambia cosas
                value = text,
                onValueChange = { text = it },//it es el texto q introduce
                // la persona q acaba de escribir
                label = { Text("Tipo de medicamento") }
            )
            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                modifier = Modifier,//modifier cambia cosas
                value = text,
                onValueChange = { text = it },//it es el texto q introduce
                // la persona q acaba de escribir
                label = { Text("Distribuidora") }
            )
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                modifier = Modifier,//modifier cambia cosas
                value = text,
                onValueChange = { text = it },//it es el texto q introduce
                // la persona q acaba de escribir
                label = {
                    Text("Composicón")
                })

        }

    }
}
