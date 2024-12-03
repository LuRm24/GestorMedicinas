package com.example.gestormedicinas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.gestormedicinas.presentation.navigation.NavGraph
import com.example.gestormedicinas.ui.theme.GestorMedicinasTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestorMedicinasTheme {
                NavGraph()
            }
        }
    }
}

