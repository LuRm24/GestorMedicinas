package com.example.gestormedicinas.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gestormedicinas.presentation.ui.screens.login.LoginScreen
import com.example.gestormedicinas.presentation.ui.screens.medicines.AddMedicinaActivity
import com.example.gestormedicinas.presentation.ui.screens.products.AddProductScreen

// El startDestination define la pantalla que se cargará cuando se abre la aplicación
@Composable
fun NavGraph(startDestination: String = Screen.Login.route) {
    // Cargamos el navController
    val navController = rememberNavController()

    // Creamos un NavHost que arranque con la pantalla de inicio
    NavHost(navController = navController, startDestination = startDestination) {
        // Definimos que para la ruta Screen.Home.route se cargue el composable HomeScreen(navController)
        composable(Screen.Login.route) {
           LoginScreen(navController)
        }
        // Definimos que para la ruta Screen.Login.route se cargue el composable LoginScreen(navController)
        composable(Screen.Medicinas.route) {
            AddMedicinaActivity(navController)
        }
        composable(Screen.Productos.route) {
            AddProductScreen(navController)

        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {

}
