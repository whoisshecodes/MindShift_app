package com.MindShift_app.data.repository

import com.MindShift_app.data.local.dao.HabitDao
import com.MindShift_app.data.local.entity.HabitEntity


class HabitRepositoryImpl(
    private val habitDao: HabitDao
) : HabitRepository {
    override suspend fun getHabit(habitId: String): Habit? {
        return habitDao.getHabit(habitId)?.toDomainModel()
    }

    override suspend fun updateHabit(habit: Habit) {
        habitDao.updateHabit(habit.toEntity())
    }
}


private fun HabitEntity.toDomainModel(): Habit {
    return Habit(
        id = id,
        name = name,
        startDate = startDate,
        initialLimit = initialLimit,
        currentLimit = currentLimit,
        reductionStep = reductionStep
    )
}

private fun Habit.toEntity(): HabitEntity {
    return HabitEntity(
        id = id,
        name = name,
        startDate = startDate,
        initialLimit = initialLimit,
        currentLimit = currentLimit,
        reductionStep = reductionStep
    )
}