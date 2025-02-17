package com.example.examenfinal.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.examenfinal.BusScheduleApplication
import com.example.examenfinal.data.BusSchedule
import com.example.examenfinal.data.BusScheduleDao
import kotlinx.coroutines.flow.Flow

class BusScheduleViewModel(private val busScheduleDao: BusScheduleDao): ViewModel() {

    // Obtiene el horario completo de autobuses desde Room DB
    val scheduleList : Flow<List<BusSchedule>> = busScheduleDao.getAll()

    // Obtiene el horario del autobús según el nombre de la parada de Room DB
    fun getScheduleFor(stopName: String): Flow<List<BusSchedule>> =
        busScheduleDao.getByStopName(stopName)

    // Obtiene el horario de la ultima parada
    fun getUltimaParada(): Flow<List<BusSchedule>> = busScheduleDao.getUltimaParada()
    // Obtiene el horario de la primera parada
    fun getPrimeraParada(): Flow<List<BusSchedule>> = busScheduleDao.getPrimeraParada()
    // Obtiene el horario dado el ID
    fun getStopById(stopId:Int): Flow<List<BusSchedule>> = busScheduleDao.getByStopId(stopId)

    companion object {
        val factory : ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as BusScheduleApplication)
                BusScheduleViewModel(application.database.busScheduleDao())
            }
        }
    }
}