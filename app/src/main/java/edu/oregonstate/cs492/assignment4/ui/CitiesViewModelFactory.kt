package edu.oregonstate.cs492.assignment4.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import edu.oregonstate.cs492.assignment4.data.CityDao

class CitiesViewModelFactory(private val cityDao: CityDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CitiesViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return CitiesViewModel(cityDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}