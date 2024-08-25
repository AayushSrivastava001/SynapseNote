package com.example.canyouhackit3

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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun RegisterScreen(){
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
            TextField(value = "", onValueChange = {},
                label={ Text(text = "ENTER YOUR NAME")}, modifier = Modifier.background(color = Color.Yellow))
            Spacer(modifier = Modifier.height(20.dp))
            TextField(value = "", onValueChange = {},
                label={ Text(text = "ENTER YOUR EMAIL")}, modifier = Modifier.background(color = Color.Yellow))
            Spacer(modifier = Modifier.height(20.dp))
            TextField(value = "", onValueChange = {},
                label={ Text(text = "CREATE PASSWORD")}, modifier = Modifier.background(color = Color.Yellow))
            Spacer(modifier = Modifier.height(20.dp))
            TextField(value = "", onValueChange = {},
                label={ Text(text = "CONFIRM PASSWORD")}, modifier = Modifier.background(color = Color.Yellow))
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFD3B1F7))) {
                Text(text = "Click Here To Sign Up", color = Color(0xFF1B1B1B))
            }
        }


    }
}