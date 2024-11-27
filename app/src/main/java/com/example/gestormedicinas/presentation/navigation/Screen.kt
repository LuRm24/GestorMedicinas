package com.example.gestormedicinas.presentation.navigation

sealed class Screen(val route: String){
    object Login: Screen("login")
    object Medicinas: Screen("medicinas")
}