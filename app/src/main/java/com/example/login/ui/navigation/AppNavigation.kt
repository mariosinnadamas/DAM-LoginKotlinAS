package com.example.login.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.login.ui.login.Login
import com.example.login.ui.recovery.Recovery
import com.example.login.ui.register.Register

//Sealed es como un ENUM
sealed class AppScreen(val route: String){
    //Esto es crear objetos con las rutas para controlarlas
    object Login : AppScreen("login")
    object Register : AppScreen("register")
    object Recovery : AppScreen("recovery")
}

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        //Inicia la app en la pestaña Login
        startDestination = AppScreen.Login.route
    ){
        //Cada una de estas llama a la ruta de cada pestaña
        composable(route = AppScreen.Login.route){
            Login(navController)
        }
        composable (route = AppScreen.Register.route){
            Register(navController)
        }
        composable (route = AppScreen.Recovery.route){
            Recovery(navController)
        }
    }
}
