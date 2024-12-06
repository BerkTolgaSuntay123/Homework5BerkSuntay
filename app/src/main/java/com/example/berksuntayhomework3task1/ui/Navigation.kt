package com.example.berksuntayhomework3task1.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(route = "home") { HomeScreen() }
            composable(route = "favorites") { FavoritesScreen() }
            composable(route = "details") { DetailsScreen() }
            composable(route = "fourth") { FourthScreen() }
            composable(route = "dynamic") { DynamicScreen() }
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    NavigationBar {
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("home") },
            label = { Text("Home") },
            icon = { Icon(imageVector = Icons.Filled.Home, contentDescription = "Home") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("favorites") },
            label = { Text("Favorites") },
            icon = { Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Favorites") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("details") },
            label = { Text("Details") },
            icon = { Icon(imageVector = Icons.Filled.Info, contentDescription = "Details") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("fourth") },
            label = { Text("Fourth") },
            icon = { Icon(imageVector = Icons.Filled.Add, contentDescription = "Fourth") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("dynamic") },
            label = { Text("Dynamic") },
            icon = { Icon(Icons.Filled.Add, contentDescription = "Dynamic") }
        )
    }
}

