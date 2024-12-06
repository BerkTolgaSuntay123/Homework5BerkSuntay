package com.example.berksuntayhomework3task1.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// Define the data model for your API response
data class Item(val id: Int, val name: String)

// Define the Retrofit API interface
interface ApiService {
    @GET("path/to/endpoint") // Replace with your actual endpoint
    suspend fun getItems(): List<Item>
}

// Create a Retrofit client instance
object RetrofitClient {
    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://example.com/") // Replace with your API's base URL
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}
