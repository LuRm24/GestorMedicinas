package com.example.gestormedicinas.presentation.navigation

sealed class Screen(val route: String){
    // Definimos la pantalla Home en la ruta home
    object Login: Screen("login")
    //  Definimos la pantalla Login en la ruta login
    object Medicinas: Screen("medicinas")

    object AddMedicine: Screen("addmedicine")
}