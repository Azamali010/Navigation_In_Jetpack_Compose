package com.example.navigation_with_arguments.screens2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen_second(myName:String?, myAge:Int?) {

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Details Screen", fontSize = 54.sp)
        
        Spacer(modifier = Modifier.heightIn(30.dp))

        Text(text = "Your Name is: $myName", fontSize = 44.sp)

        Spacer(modifier = Modifier.heightIn(30.dp))

        Text(text = "Your Age Is: $myAge", fontSize = 44.sp)

    }

}
//@Preview(showBackground = true)
//@Composable
//fun Screen_secondPreview(name : String, Age:Int) {
//
//    Screen_second(myName = name, myAge =Age )
//}