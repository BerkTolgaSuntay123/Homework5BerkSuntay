package com.example.berksuntayhomework3task1.repository

import com.example.berksuntayhomework3task1.model.BitCoin

class BitCoinRepositoryImpl : BitCoinRepository {
    override fun getBitCoins(): List<BitCoin> {
        return listOf(
            BitCoin("Bitcoin", "BTC", "$29,000"),
            BitCoin("Ethereum", "ETH", "$1,800"),
            BitCoin("Cardano", "ADA", "$0.30")
        )
    }
}

