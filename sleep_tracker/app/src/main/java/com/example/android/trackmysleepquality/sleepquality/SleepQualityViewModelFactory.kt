package com.example.android.trackmysleepquality.sleepquality

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.trackmysleepquality.database.SleepDatabaseDao

//class SleepQualityViewModelFactory(
//    val database: SleepDatabaseDao,
//    private val application: Application
//) : ViewModelProvider.Factory {
//    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(SleepQualityViewModel::class.java)) {
//            return SleepQualityViewModel(database, application) as T
//        }
//        throw IllegalArgumentException("Unknown ViewModel class")
//    }
//}
