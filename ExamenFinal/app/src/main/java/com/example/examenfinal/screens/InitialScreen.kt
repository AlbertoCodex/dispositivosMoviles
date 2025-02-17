package com.example.examenfinal.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.examenfinal.navigation.AppScreens

@Composable
fun InitialScreen(navController: NavHostController) {
    Inicio(navController)
}

@Composable
fun Inicio(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Button(onClick = {navController.navigate(route = AppScreens.BusScheduleScreen.route)}) {
            Text("Inicio")
        }
    }
}