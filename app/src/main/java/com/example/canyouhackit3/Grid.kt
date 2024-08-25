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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
@Composable
fun MenuGrid(){
    Box(modifier = Modifier.fillMaxSize()) {
        Column(Modifier.verticalScroll(rememberScrollState())) {
            repeat(10) {
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    repeat(2) {
                        Grid()

                    }

                }


            }
        }
            NoteScreen1(modifier = Modifier.align(Alignment.BottomEnd))

        }



}
@Composable
fun Grid(){
    Card(

        modifier = Modifier.padding(8.dp)
    ) {
        Box (
            modifier = Modifier
                .requiredSize(180.dp, 180.dp)
                .padding(8.dp)
        ){
            Button(onClick = { /*TODO*/ },shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(Color.White)) {
                Image(painter = painterResource(id = R.drawable.note_making_image), contentDescription =" Notes" , modifier = Modifier.fillMaxWidth())


            }


        }


    }
}
@Composable
fun NoteScreen1(modifier: Modifier){
//    Box(modifier= modifier
//        .fillMaxWidth()
//        .background(color = Color(0xFFFFFFF0))) {
//        Card(
//
//            modifier = Modifier.padding(8.dp)
//        ) {
//
//        }
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center,
//            modifier = Modifier
//                .fillMaxSize()
//                .background(color = Color(0xFFFFFFF0))
//        ) {}
        Row(
            modifier = modifier
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


