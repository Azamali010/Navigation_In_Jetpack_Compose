package com.example.simple_navigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ScreenC(navController: NavHostController) {

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Screen C",
            fontSize = 65.sp
        )

        Spacer(modifier = Modifier.heightIn(65.dp))

        Button(onClick = {

            navController.navigate("ScreenA"){
                popUpTo("ScreenA"){
                    inclusive = true
                }
            }


        }) {
            Text(text = "Go To Screen A", fontSize = 40.sp)
        }

    }

}

@Preview(showBackground = true)
@Composable
fun ScreenCPreview(modifier: Modifier = Modifier) {


}