package edu.oregonstate.cs492.assignment4.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.oregonstate.cs492.assignment4.data.City
import edu.oregonstate.cs492.assignment4.data.CityDao
import kotlinx.coroutines.launch

class CitiesViewModel(private val cityDao: CityDao) : ViewModel() {

    val allCities: LiveData<List<City>> = cityDao.getAllCities()

    fun insertCity(cityName: String) {
        viewModelScope.launch {
            val city = City(name = cityName, lastViewed = System.currentTimeMillis())
            cityDao.insertCity(city)
        }
    }
}