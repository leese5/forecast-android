package edu.oregonstate.cs492.assignment4.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import edu.oregonstate.cs492.assignment4.data.CityDao

class CurrentWeatherViewModelFactory(private val cityDao: CityDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CurrentWeatherViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return CurrentWeatherViewModel(cityDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}