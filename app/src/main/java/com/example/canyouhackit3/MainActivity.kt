package com.example.canyouhackit3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.canyouhackit3.ui.theme.SynapseNoteTheme
import dagger.hilt.android.AndroidEntryPoint
import java.lang.reflect.Modifier
import androidx.compose.foundation.layout.fillMaxSize

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val authViewModel: AuthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SynapseNoteTheme {
                val navController = rememberNavController()
                Scaffold {
                    NavigationComponent(navController = navController, authViewModel = authViewModel)
                }
            }
        }
    }
}

@Composable
public fun NavigationComponent(navController: NavHostController, authViewModel: AuthViewModel): Unit {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController = navController, authViewModel = authViewModel, modifier = Modifier.fillMaxSize()) }
        composable("home") { HomeScreen1(navController = navController, authViewModel = authViewModel, modifier = Modifier.fillMaxSize()) }
        composable("register") { RegisterScreen(navController = navController, authViewModel = authViewModel, modifier = Modifier.fillMaxSize()) }
    }
}