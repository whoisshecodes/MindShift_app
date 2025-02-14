package com.MindShift_app.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.MindShift_app.data.local.dao.HabitDao
import com.MindShift_app.data.local.entity.HabitEntity

// data/local/HabitDatabase.kt
@Database(
    entities = [HabitEntity::class],
    version = 1
)
abstract class HabitDatabase : RoomDatabase() {
    abstract fun habitDao(): HabitDao
}