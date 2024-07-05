package com.example.navigation_basics

import kotlin.math.round

sealed class Screens(val route :String) {

    object Home : Screens(route = "home_screen")
    object Detail: Screens(route = "detail_screen")
}