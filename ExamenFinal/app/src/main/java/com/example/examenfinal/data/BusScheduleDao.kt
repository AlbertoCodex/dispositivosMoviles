package com.example.examenfinal.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {
    @Query(
        """
        SELECT * FROM Schedule 
        ORDER BY arrival_name ASC    
        """
    )
    fun getAll(): Flow<List<BusSchedule>>

    @Query(
        """
        SELECT * FROM Schedule 
        WHERE stop_name = :stopName 
        ORDER BY arrival_name ASC 
        """
    )
    fun getByStopName(stopName: String): Flow<List<BusSchedule>>


    // 3 acceso a datos adicionales

    // Devuelve la parada por ID
    @Query(
    """
    SELECT * FROM Schedule
    WHERE id = :idName
    """
    )
    fun getByStopId(idName:Int): Flow<List<BusSchedule>>

    // Devuelve la ultima parada
    @Query(
        """
        SELECT * FROM Schedule
        ORDER BY id DESC LIMIT 1
        """
    )
    fun getUltimaParada(): Flow<List<BusSchedule>>

// Devuelve la primera parada
    @Query(
    """
        SELECT * FROM Schedule
        ORDER BY id ASC LIMIT 1
        """
    )
    fun getPrimeraParada(): Flow<List<BusSchedule>>
}