package com.example.simple_navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.simple_navigation.screens.ScreenA
import com.example.simple_navigation.screens.ScreenB
import com.example.simple_navigation.screens.ScreenC

@Composable
fun NavGraph(navController: NavHostController) {
     
     NavHost(navController = navController, startDestination = "ScreenA") {

          composable(route = "ScreenA"){
               ScreenA(navController)
          }

          composable(route ="ScreenB"){
               ScreenB(navController)
          }

          composable(route = "ScreenC"){
               ScreenC(navController)
          }
     }
}