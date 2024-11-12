package com.example.gestormedicinas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.gestormedicinas.ui.theme.GestorMedicinasTheme

class AddMedicinaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestorMedicinasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AddMedicinaActivityContent(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddMedicinaActivityContent(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Gestor Medicinas") }
            )
        },
        content = {
            padding ->
            Column(Modifier.padding(padding)) {
                Text(
                    text = "Id Medicamento:",
                    color = Color.Blue
                )
                Text(text = "Id Usuario",color = Color.Blue)
                Text(text = "Nombre del medicamento:",color = Color.Blue)
                Text(text = "Dosis:",color = Color.Blue)
                Text(text = "Frecuencia toma:",color = Color.Blue)
                Text(text = "Indicaciones:",color = Color.Blue)
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun AddMedicinaActivityPreview() {
    GestorMedicinasTheme {
        AddMedicinaActivityContent()
    }
}
