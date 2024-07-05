package com.example.navig

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navig.ui.theme.NavigTheme
import com.example.navigation_basics.Nav_Graphs
import com.example.navigation_with_arguments.n_graph.Nav_Screen
import com.example.simple_navigation.nav_graph.NavGraph

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            NavigTheme {

                navController = rememberNavController()

//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }


//              NavGraph(navController)
//              Nav_Screen()
                Nav_Graphs(navController = navController)

            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    NavigTheme {
//        Greeting("Android")
//    }
//}