package com.example.canyouhackit3

import android.Manifest
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon

import androidx.activity.viewModels

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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

    val voiceToText by lazy {
        Voice_to_text(application)
    }
    @SuppressLint("UnusedContentLambdaTargetStateParameter")

    private val authViewModel: AuthViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SynapseNoteTheme {

                var canRecord by remember {
                    mutableStateOf(false)

                }
                val recordAudioLauncher= rememberLauncherForActivityResult(contract =ActivityResultContracts.RequestPermission() , onResult ={isGranted->canRecord=isGranted} )
                LaunchedEffect(key1 = recordAudioLauncher) {
                    recordAudioLauncher.launch(Manifest.permission.RECORD_AUDIO)

                }
                val state by voiceToText.state.collectAsState()
                Scaffold(
                    floatingActionButton = {
                        FloatingActionButton(onClick = {
                            if (state.isSpeaking) {
                                voiceToText.stopListening()
                            }else{
                                voiceToText.startListening()
                            }
                        }) {
                            AnimatedContent(targetState =state.isSpeaking ) { isSpeaking ->
                                if (isSpeaking){
                                    Image(imageVector = Icons.Rounded.Star, contentDescription =null )
                                }else{
                                    Image(imageVector = Icons.Rounded.Clear, contentDescription =null )
                                }

                            }

                        }
                    }
                ) {padding->
                    Column (modifier = Modifier
                        .fillMaxSize()
                        .padding(padding)
                        .padding(20.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                        AnimatedContent(targetState = state.isSpeaking, label = "") {
                            if (it){
                                Text(text = "Speaking.....")

                            }else{
                                Text(text = state.spokenText.ifEmpty { "Click on mic to record audio" })
                                
                            }
                            
                        }
                        
                            


                    }

                }
                /*HomeScreen1()*/
                /*LoginScreen()*/
                /*RegisterScreen()*/
                /*NoteScreen()*/
                /*MenuGrid()*/


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