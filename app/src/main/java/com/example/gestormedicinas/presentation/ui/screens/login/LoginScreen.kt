package com.example.gestormedicinas.presentation.ui.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.gestormedicinas.R
import com.example.gestormedicinas.presentation.navigation.Screen
import com.example.gestormedicinas.presentation.viewmodel.UsernamePasswordViewModel


@Composable
fun LoginScreen(
    navController: NavController,
    usernamePasswordViewModel: UsernamePasswordViewModel
) {
    val username by usernamePasswordViewModel.username.collectAsState() // Valor inicial requerido
    val password by usernamePasswordViewModel.password.collectAsState() // Valor inicial requerido // Agregando un campo para la contraseña

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .background(Color.Transparent)
                    .clip(RoundedCornerShape(16.dp))
                    .width(110.dp)
                    .height(110.dp),
                contentDescription = "Logo"
            )
            Spacer(modifier = Modifier.height(70.dp)) // Separador
            // Campo para el nombre de usuario
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                value = username,
                onValueChange = { usernamePasswordViewModel.setUsername(it)  },
                placeholder = { Text(text = "Username") }
            )
            Spacer(modifier = Modifier.height(20.dp)) // Separador

            // Campo para la contraseña
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                value = password,
                onValueChange = { usernamePasswordViewModel.setPassword(it) },
                placeholder = { Text(text = "Password") },
                visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.height(16.dp)) // Separador

            // Botón de login
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp), // Espacio entre botones
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                // Botón de login
                Button(
                    onClick = {
                        if(usernamePasswordViewModel.isValidLogin()) {
                            navController.navigate(Screen.Medicinas.route)
                        } else {

                        }
                              },
                    modifier = Modifier
                        .weight(1f) // Hacer que los botones tengan el mismo ancho
                ) {
                    Text(text = "Login")
                }

                // Botón de registro
                Button(
                    onClick = { usernamePasswordViewModel.clear() },
                    modifier = Modifier
                        .weight(1f) // Hacer que los botones tengan el mismo ancho
                ) {
                    Text(text = "Limpiar")
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen() {
    LoginScreen(navController = rememberNavController(), viewModel())
}
