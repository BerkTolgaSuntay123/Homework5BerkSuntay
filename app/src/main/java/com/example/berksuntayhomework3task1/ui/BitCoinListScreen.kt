package com.example.berksuntayhomework3task1.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.berksuntayhomework3task1.di.AppModule

@Composable
fun BitCoinListScreen() {
    val viewModel = AppModule.viewModel
    LazyColumn {
        items(viewModel.bitCoins.size) { index ->
            BitCoinItem(bitCoin = viewModel.bitCoins[index])
        }
    }
}



