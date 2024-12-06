package com.example.berksuntayhomework3task1.viewmodel

import androidx.lifecycle.ViewModel
import com.example.berksuntayhomework3task1.model.BitCoin
import com.example.berksuntayhomework3task1.repository.BitCoinRepository

class BitCoinViewModel(private val repository: BitCoinRepository) : ViewModel() {
    val bitCoins: List<BitCoin> = repository.getBitCoins()
}