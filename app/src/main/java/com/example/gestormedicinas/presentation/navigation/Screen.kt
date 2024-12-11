package com.example.gestormedicinas.presentation.navigation

sealed class Screen(val route: String){

     data object Login: Screen("login")

    data object Medicinas: Screen("medicinas")

    data object AddMedicine: Screen("addmedicine")
}