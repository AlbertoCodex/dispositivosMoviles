package com.example.examenfinal.data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Representa una única tabla en la base de datos. Cada fila es una instancia separada de
 * la clase BusSchedule. Cada propiedad corresponde a una columna.
 * Además, se necesita una identificación como identificador único para
 * cada fila de la base de datos.
 */
@Entity(tableName = "Schedule")
data class BusSchedule(
    @PrimaryKey
    val id: Int,
    @NonNull
    @ColumnInfo(name = "stop_name")
    val stopName: String,
    @NonNull
    @ColumnInfo(name = "arrival_name")
    val arrivalTimeInMillis: Int
)
