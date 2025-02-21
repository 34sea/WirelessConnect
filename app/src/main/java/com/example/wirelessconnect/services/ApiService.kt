package com.example.wirelessconnect.services

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    @GET("recurso")
    suspend fun getRecurso(): Response<String>
}

val retrofit = Retrofit.Builder()
    .baseUrl("http://192.168.1.100:5000/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val apiService = retrofit.create(ApiService::class.java)
