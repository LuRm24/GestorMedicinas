package com.example.gestormedicinas.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gestormedicinas.presentation.ui.screens.login.LoginScreen
import com.example.gestormedicinas.presentation.ui.screens.medicines.AddMedicinaActivity
import com.example.gestormedicinas.presentation.ui.screens.products.MedicinasScreen
import com.example.gestormedicinas.presentation.viewmodel.MedicinasViewModel
import com.example.gestormedicinas.presentation.viewmodel.UsernamePasswordViewModel

// El startDestination define la pantalla que se cargará cuando se abre la aplicación
@Composable
fun NavGraph(startDestination: String = Screen.Login.route) {
    // Cargamos el navController
    val navController = rememberNavController()

    val usernamePasswordViewModel: UsernamePasswordViewModel = viewModel()
    val medicinesViewModel: MedicinasViewModel = viewModel()


    // Creamos un NavHost que arranque con la pantalla de inicio
    NavHost(navController = navController, startDestination = startDestination) {
        // Definimos que para la ruta Screen.Home.route se cargue el composable HomeScreen(navController)
        composable(Screen.Login.route) {
           LoginScreen(navController,usernamePasswordViewModel)
        }
        // Definimos que para la ruta Screen.Login.route se cargue el composable LoginScreen(navController)
        composable(Screen.AddMedicine.route) {
            AddMedicinaActivity(navController)
        }
        composable(Screen.Medicinas.route) {
            MedicinasScreen(navController, medicinesViewModel)

        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {

}
