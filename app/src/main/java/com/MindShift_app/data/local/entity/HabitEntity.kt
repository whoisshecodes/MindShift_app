package com.MindShift_app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "habits")
data class HabitEntity(
    @PrimaryKey val id: String,
    val name: String,
    val startDate: Long, // Timestamp
    val initialLimit: Int,
    val currentLimit: Int,
    val reductionStep: Int
)