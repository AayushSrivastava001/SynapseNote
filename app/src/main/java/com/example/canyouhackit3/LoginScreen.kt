package com.example.canyouhackit3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1B1B1B))
    ) {
        Image(painter = painterResource(id = R.drawable.fower_1), contentDescription =" " )
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFF1B1B1B))
        ) {
            Text(text = "LOGIN", fontSize = 40.sp, fontStyle = FontStyle.Italic, color = Color.Yellow)
            Spacer(modifier = Modifier.height(10.dp))
            TextField(value = "", onValueChange = {},
                label={ Text(text = "ENTER YOUR ROLL NUMBER")}, modifier = Modifier.background(color = Color.Yellow))
            Spacer(modifier = Modifier.height(10.dp))
            TextField(value = "", onValueChange = {},
                label={ Text(text = "PASSWORD")})
            Text(text = "Don't have an account ?",fontSize = 20.sp, fontStyle = FontStyle.Italic, color = Color.Yellow)
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Register here !!!", color = Color.Yellow)
                
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Image(painter = painterResource(id = R.drawable.can_you_hack_it_logo_6), contentDescription =" " )
    }

}