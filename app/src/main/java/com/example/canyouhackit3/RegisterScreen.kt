package com.example.canyouhackit3

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.runtime.LaunchedEffect



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(modifier: Modifier, navController: NavController, authViewModel: AuthViewModel){
    var email by remember { mutableStateOf(" ") }
    var name by remember { mutableStateOf(" ") }
    var password by remember { mutableStateOf(" ") }
    var number by remember { mutableStateOf(" ") }
    var passwordVisibility by remember { mutableStateOf(false) }

    val authState = authViewModel.authState.observeAsState()
    val context = LocalContext.current
    LauchedEffect(authState.value) {
        when (authState.value) {
            is AuthState.Authenticated -> navController.navigate("HOME")
            is AuthState.Error -> Toast.makeText(context,
                (authState.value as AuthState.Error).message,Toast.LENGTH_SHORT).show()
            else -> Unit
        }
    }
    Column(
        modifier = Modifier

            .fillMaxSize()
            .background(color = Color(0xFF1B1B1B))
    ) {
        Image(painter = painterResource(id = R.drawable.puple_flower_in_gemini), contentDescription =" ", modifier = Modifier.width(500.dp) )
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFF1B1B1B))
        ){
            Text(text = " New User ?", fontSize = 40.sp, fontStyle = FontStyle.Italic, color = Color(0xFFD3B1F7))
            Text(text = " Sign Up", fontSize = 40.sp, fontStyle = FontStyle.Italic, color = Color(0xFFD3B1F7))
            Spacer(modifier = Modifier.height(20.dp))
            TextField(value = name,
                onValueChange = {
                    name = it
                },
                label={ Text(text = "ENTER YOUR NAME")},
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.baseline_person_24), contentDescription = null )

                },
                trailingIcon = {
                    if(name.isNotEmpty()){
                        Icon(painter = painterResource(id = R.drawable.baseline_close_24), contentDescription =null )
                    }

                },
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Next
                ),
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Blue,
                    focusedLeadingIconColor = Color.Blue,
                    containerColor = Color.White

                ),
                textStyle = TextStyle(
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
            Spacer(modifier = Modifier.height(20.dp))


            TextField(value = email, onValueChange = {
                email=it
            },
                label={ Text(text = "ENTER YOUR EMAIL")}
                , leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.baseline_person_24), contentDescription = null )

                },
                trailingIcon = {
                    if(name.isNotEmpty()){
                        Icon(painter = painterResource(id = R.drawable.baseline_close_24), contentDescription =null )
                    }

                },
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Next
                ),
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Blue,
                    focusedLeadingIconColor = Color.Blue,
                    containerColor = Color.White

                ),
                textStyle = TextStyle(
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,

                    fontSize = 20.sp
                ), modifier = Modifier.background(color = Color.Yellow))
            Spacer(modifier = Modifier.height(20.dp))
            TextField(value = password, onValueChange = {password = it},
                label={ Text(text = "CREATE PASSWORD")},
                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.baseline_password_24), contentDescription = null )

                },
                trailingIcon = {
                    if(password.isNotEmpty()){
                        val visibility = if (passwordVisibility){
                            painterResource(id = R.drawable.baseline_visibility_24)
                        } else {
                            painterResource(id = R.drawable.baseline_close_24)
                        }
                        Icon(painter = visibility, contentDescription = if (passwordVisibility){
                            "Hide Password "
                        }else{
                            "Show Password"
                        }

                        )

                    }


                },
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Next
                ),
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Blue,
                    focusedLeadingIconColor = Color.Blue,
                    containerColor = Color.White

                ),
                textStyle = TextStyle(
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )

            )
            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = {
                authViewModel.signup(email, password)
            },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFD3B1F7))) {
                Text(text = "Create Account", color = Color(0xFF1B1B1B))
            }
        }


    }
}

@Composable
fun LauchedEffect(value: AuthState?, content: () -> Unit) {

}

