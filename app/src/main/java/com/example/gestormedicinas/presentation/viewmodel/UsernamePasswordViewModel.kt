package com.example.gestormedicinas.presentation.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class UsernamePasswordViewModel :ViewModel(){
    private val VALID_USERNAME = "admin"
    private val VALID_PASSWORD = "Sandia4you"

    private val _username = MutableStateFlow("")
    val username : StateFlow<String> = _username

    private val _password = MutableStateFlow("")
    val password : StateFlow<String> = _password

    fun setUsername(username: String){
        _username.value = username

        }
    fun setPassword(password: String){
        _password.value = password
    }
    fun clear(){
        _username.value = ""
        _password.value = ""
    }
    fun isValidCredentials(): Boolean{
        return _username.value == VALID_USERNAME && _password.value == VALID_PASSWORD
    }

}