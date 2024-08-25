package com.example.canyouhackit3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun NoteScreen(){
    Box(modifier=Modifier.fillMaxSize().background(color = Color(0xFFFFFFF0))) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize().background(color = Color(0xFFFFFFF0))
        ) {}
            Row(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .fillMaxWidth()
                    .background(color = Color(0xFFF2E3C7))
            ) {
                TextButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(bottom =10.dp, start = 10.dp )) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_keyboard_voice_24),
                        contentDescription = null
                    )

                }
                Spacer(modifier = Modifier.width(100.dp))
                TextButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(bottom =10.dp )) {
                    Image(painter = painterResource(id = R.drawable.baseline_notes_24), contentDescription = null)

                }
                Spacer(modifier = Modifier.width(100.dp))
                TextButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(bottom =10.dp )) {
                    Image(painter = painterResource(id = R.drawable.baseline_folder_24), contentDescription =null )
                    
                }

            }

        }


}