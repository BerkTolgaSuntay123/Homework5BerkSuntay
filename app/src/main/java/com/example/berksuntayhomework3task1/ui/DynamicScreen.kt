package com.example.berksuntayhomework3task1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.berksuntayhomework3task1.network.RetrofitClient
import kotlinx.coroutines.launch

@Composable
fun DynamicScreen() {
    val coroutineScope = rememberCoroutineScope()
    var items by remember { mutableStateOf<List<String>?>(null) }
    var isLoading by remember { mutableStateOf(true) }

    // Fetch data when the screen loads
    LaunchedEffect(Unit) {
        coroutineScope.launch {
            try {
                val response = RetrofitClient.apiService.getItems() // Call the API
                items = response.map { it.name } // Extract item names
            } catch (e: Exception) {
                items = listOf("Error loading data: ${e.message}")
            } finally {
                isLoading = false
            }
        }
    }

    // Display the UI
    if (isLoading) {
        CircularProgressIndicator(modifier = Modifier.padding(16.dp))
    } else {
        items?.let {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                it.forEach { item ->
                    Text(text = item, style = MaterialTheme.typography.bodyLarge)
                }
            }
        }
    }
}
