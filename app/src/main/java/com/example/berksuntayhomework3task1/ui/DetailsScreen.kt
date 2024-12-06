package com.example.berksuntayhomework3task1.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable



@Composable
fun DetailsScreen() {
    val items = listOf("Item 1", "Item 2", "Item 3") // Mock data
    Column {
        Text("Dynamic Data from API")
        items.forEach { item ->
            Text(text = item)
        }
    }
}


