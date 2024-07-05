package com.example.navigation_with_arguments.n_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigation_with_arguments.screens2.Screen_first
import com.example.navigation_with_arguments.screens2.Screen_second

@Composable
fun Nav_Screen() {

    val navController = rememberNavController()

    NavHost(

        navController = navController,
        startDestination = "Screen_first"

    ) {

        composable(route = "Screen_first"){
            Screen_first(navController)
        }
        
        composable(
            route = "Screen_second?name={name}&age={age}",
            arguments = listOf(
                navArgument(name = "name"){
                    type = NavType.StringType
                    nullable = true
                },
                navArgument(name = "age"){
                    type = NavType.IntType

                    defaultValue = 0
                }
            )
        ){ backstackEntry ->
            Screen_second(
                myName = backstackEntry.arguments?.getString("name"),
                myAge =backstackEntry.arguments?.getInt("age")
            )
        }
    }
}