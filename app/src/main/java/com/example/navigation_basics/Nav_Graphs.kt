package com.example.navigation_basics

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigation_basics.screen3.DetailScreen
import com.example.navigation_basics.screen3.HomeScreen

@Composable
fun Nav_Graphs(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    ) {
        composable(route = Screens.Home.route){
            HomeScreen(navController)
        }
        composable(route = Screens.Detail.route){
            DetailScreen(navController)
        }

    }
}