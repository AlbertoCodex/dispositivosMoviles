package com.example.examenfinal.navigation

sealed class AppScreens(val route:String) {
    object Main:AppScreens("main")
    object InitialScreen:AppScreens("initial")
    object BusScheduleScreen:AppScreens("busschedule")
}