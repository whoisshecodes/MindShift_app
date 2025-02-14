package com.MindShift_app.presentation.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.room.util.TableInfo
import java.lang.reflect.Modifier


@Composable
fun HabitScreen(viewModel: HabitViewModel = hiltViewModel()) {
    val habit by viewModel.habit.collectAsState()

    TableInfo.Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Сегодняшний лимит: ${habit?.currentLimit ?: 0}",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = { /* TODO: Реализовать трекинг */ }) {
            Text("Добавить срыв")
        }
    }
}