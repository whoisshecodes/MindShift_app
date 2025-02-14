package com.MindShift_app.data.repository


interface HabitRepository {
    suspend fun getHabit(habitId: String): Habit?
    suspend fun updateHabit(habit: Habit)
}