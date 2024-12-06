package com.example.berksuntayhomework3task1.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.berksuntayhomework3task1.model.BitCoin

@Composable
fun BitCoinItem(bitCoin: BitCoin) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = "Name: ${bitCoin.name}")
        Text(text = "Symbol: ${bitCoin.symbol}")
        Text(text = "Price: ${bitCoin.price}")
    }
}