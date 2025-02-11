package com.example.navigation_basics.screen3

import android.telecom.Call.Details
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.navigation_basics.Screens

@Composable
fun DetailScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

        Text(
            modifier = Modifier.clickable {

//              navController.popBackStack()
//              navController.navigate(Screens.Detail.route)

                navController.navigate(Screens.Home.route){
                    popUpTo(Screens.Home.route){
                        inclusive = true
                    }
                }
            },
            text = "Detail",
            color = Color.Red,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

    }

}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview(modifier: Modifier = Modifier) {
    DetailScreen(navController = rememberNavController())
}