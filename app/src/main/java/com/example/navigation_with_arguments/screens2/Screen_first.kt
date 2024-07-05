package com.example.navigation_with_arguments.screens2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Screen_first(navController: NavHostController) {

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        var nameValue by remember { mutableStateOf("") }
        var ageValue by remember { mutableStateOf("") }
        
        Text(text = "Home Screen", fontSize = 54.sp)

        Spacer(modifier = Modifier.heightIn(65.dp))
        
        TextField(value = nameValue,
            onValueChange ={
                nameValue = it
            },
            modifier = Modifier.padding(10.dp),
            placeholder = {
                Text(text = "Enter Your Name")
            }
        )
        TextField(value = ageValue,
            onValueChange ={
                ageValue = it
            },
            modifier = Modifier.padding(40.dp),
            placeholder = {
                Text(text = "Enter Your Age")
            }
        )

        Button(onClick = {

            navController.navigate("Screen_second?name=$nameValue&age=$ageValue")

        }) {
            Text(text = "Pass Data", fontSize = 30.sp)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Screen_firstPreview(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Screen_first(navController)
}
