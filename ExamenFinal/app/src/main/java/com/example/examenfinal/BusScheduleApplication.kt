package com.example.examenfinal

import android.app.Application
import com.example.examenfinal.data.BusScheduleDatabase

class BusScheduleApplication: Application() {
    val database: BusScheduleDatabase by lazy { BusScheduleDatabase.getDatabase(this) }
}