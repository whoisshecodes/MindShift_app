package com.MindShift_app.data.repository

data class Habit(
    val id: String,
    val name: String,
    val startDate: Long,
    val initialLimit: Int,
    val currentLimit: Int,
    val reductionStep: Int
)