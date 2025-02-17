package com.example.examenfinal.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.examenfinal.screens.BusScheduleScreen
import com.example.examenfinal.screens.InitialScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.InitialScreen.route) {
        composable(route = AppScreens.InitialScreen.route) {
            InitialScreen(navController)
        }
        composable(route = AppScreens.BusScheduleScreen.route) {
            BusScheduleScreen(navController)
        }
    }
}