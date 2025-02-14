package com.MindShift_app.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Update
import com.MindShift_app.data.local.entity.HabitEntity


@Dao
interface HabitDao {
    @Query("SELECT * FROM habits WHERE id = :habitId")
    suspend fun getHabit(habitId: String): HabitEntity?

    @Update
    suspend fun updateHabit(habit: HabitEntity)
}