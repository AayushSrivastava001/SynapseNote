package com.example.canyouhackit3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen1(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF1B1B1B))

    ) {
        Text(
            text = "TEAM INFINITY",
            fontSize = 32.sp,
            color = Color(0XFFF5F5F5),
            modifier = Modifier.padding(start = 10.dp, top = 40.dp)
        )
        Text(
            text = "The Programming Club",
            fontSize = 28.sp,
            color = Color.Cyan,
            modifier = Modifier.padding(start = 10.dp, top = 10.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Text(text = stringResource(id =R.string.Discription),fontSize = 12.sp, fontStyle = FontStyle.Italic, color = Color(0XFFF5F5F5), modifier = Modifier
                .width(250.dp)
                .padding(start = 10.dp))
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.can_you_hack_it_4), contentDescription = " ")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFFFD700))) {
            Text(text = "Click Here To Login", color = Color(0xFF1B1B1B))

        }
        Spacer(modifier = Modifier.height(40.dp))
        Row() {
            Text(text = "------------------------------------------------------------------------",fontSize = 20.sp,
                color = Color(0XFFF5F5F5))
            Spacer(modifier = Modifier.width(50.dp))

        }
        Spacer(modifier = Modifier.height(10.dp))



        Row() {
            Text(text = "TEAM MEMBERS",fontSize = 20.sp,
                color = Color(0XFFF5F5F5))
            Spacer(modifier = Modifier.width(50.dp))
            Text(text = "ROLL NUMBERS",fontSize = 20.sp,
                color = Color(0XFFF5F5F5))

        }
        Row() {
            Text(text = "------------------------------------------------------------------------",fontSize = 20.sp,
                color = Color(0XFFF5F5F5))
            Spacer(modifier = Modifier.width(50.dp))

        }
        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Text(text = "Vinay Surwase",fontSize = 20.sp,
                color = Color(0XFFF5F5F5))
            Spacer(modifier = Modifier.width(83.dp))
            Text(text = "23bcs244",fontSize = 20.sp,
                color = Color(0XFFF5F5F5))

        }
        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Text(text = "------------------------------------------------------------------------",fontSize = 20.sp,
                color = Color(0XFFF5F5F5))
            Spacer(modifier = Modifier.width(50.dp))

        }
        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Text(text = "Aayush Srivastava",fontSize = 20.sp,
                color = Color(0XFFF5F5F5))
            Spacer(modifier = Modifier.width(50.dp))
            Text(text = "23bsm001",fontSize = 20.sp,
                color = Color(0XFFF5F5F5))

        }
        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Text(text = "------------------------------------------------------------------------",fontSize = 20.sp,
                color = Color(0XFFF5F5F5))


        }
        Spacer(modifier = Modifier.width(50.dp))
        Image(painter = painterResource(id = R.drawable.canyouhackit5), contentDescription = " ", modifier = Modifier.size(500.dp))

    }
}