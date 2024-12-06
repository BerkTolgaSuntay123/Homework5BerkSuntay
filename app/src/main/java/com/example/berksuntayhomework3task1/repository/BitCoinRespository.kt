package com.example.berksuntayhomework3task1.repository

import com.example.berksuntayhomework3task1.model.BitCoin

interface BitCoinRepository {
    fun getBitCoins(): List<BitCoin>
}



