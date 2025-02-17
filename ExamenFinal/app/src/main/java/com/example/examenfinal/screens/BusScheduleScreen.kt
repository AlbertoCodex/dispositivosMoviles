package com.example.examenfinal.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.examenfinal.viewmodel.BusScheduleViewModel
import com.example.examenfinal.data.BusSchedule
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun BusScheduleScreen(navController: NavController) {
    val viewModel: BusScheduleViewModel = viewModel(factory = BusScheduleViewModel.factory)
    val fullSchedule by viewModel.scheduleList.collectAsState(emptyList())
    BusScheduleScreenDetails(fullSchedule)
}

@Composable
fun BusScheduleScreenDetails(busSchedules: List<BusSchedule>) {
    LazyColumn {
        items(busSchedules) { schedule ->
            BusScheduleItem(schedule)
        }
    }
}

@Composable
fun BusScheduleItem(schedule: BusSchedule) {
    // Formatea el tiempo de llegada
    val formattedTime = try {
        val arrivalTimeLong = schedule.arrivalTimeInMillis.toLong() * 1000 // Convierte Int a Long y pasa a milisegundos
        val date = Date(arrivalTimeLong)
        SimpleDateFormat("h:mm a", Locale.getDefault()).format(date)
    } catch (e: Exception) {
        "Hora desconocida"
    }
    Text(text = "${schedule.stopName} - $formattedTime")
}