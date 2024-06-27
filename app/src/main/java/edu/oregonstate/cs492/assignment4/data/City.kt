package edu.oregonstate.cs492.assignment4.data
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "cities")
data class City(
    @PrimaryKey val name: String,
    val lastViewed: Long
)
