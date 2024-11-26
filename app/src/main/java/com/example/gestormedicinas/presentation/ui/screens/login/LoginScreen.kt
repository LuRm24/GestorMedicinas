package com.example.gestormedicinas.presentation.ui.screens.login

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
import androidx.compose.runtime.* // Para remember, mutableStateOf
import androidx.compose.ui.Modifier // Para Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation // Para visualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp // Para valores de padding y spacing (dp)


@Composable
fun LoginScreen() {
    var username by remember { mutableStateOf("") } // Valor inicial requerido
    var password by remember { mutableStateOf("") } // Agregando un campo para la contraseña

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            // Campo para el nombre de usuario
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                value = username,
                onValueChange = { username = it },
                placeholder = { Text(text = "Username") }
            )
            Spacer(modifier = Modifier.height(16.dp)) // Separador

            // Campo para la contraseña
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                value = password,
                onValueChange = { password = it },
                placeholder = { Text(text = "Password") },
                visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.height(16.dp)) // Separador

            // Botón de login
            Button(
                onClick = { /* Acciones del botón */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text(text = "Login") // Texto dentro del botón
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen() {
    LoginScreen()
}
