package com.example.berksuntayhomework3task1.di

import com.example.berksuntayhomework3task1.repository.BitCoinRepository
import com.example.berksuntayhomework3task1.repository.BitCoinRepositoryImpl
import com.example.berksuntayhomework3task1.viewmodel.BitCoinViewModel

object AppModule {
    private val repository: BitCoinRepository = BitCoinRepositoryImpl()
    val viewModel: BitCoinViewModel by lazy { BitCoinViewModel(repository) }
}
