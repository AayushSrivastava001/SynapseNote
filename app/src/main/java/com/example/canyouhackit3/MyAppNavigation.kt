package com.example.canyouhackit3

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier,authViewModel: AuthViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home" , builder = {
        composable("login"){
            LoginScreen(modifier,navController,authViewModel)
        }
        composable("signup"){
            RegisterScreen(modifier,navController,authViewModel)
        }
        composable("home"){
            HomeScreen1(modifier,navController,authViewModel)
        }
    })


}