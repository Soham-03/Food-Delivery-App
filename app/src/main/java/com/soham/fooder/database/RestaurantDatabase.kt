package com.soham.fooder.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.soham.fooder.database.RestaurantDao
import com.soham.fooder.database.RestaurantEntity

@Database(entities = [RestaurantEntity::class], version = 1)
abstract class RestaurantDatabase:RoomDatabase() {

    abstract fun restaurantDao(): RestaurantDao
}