package com.example.wirelessconnect.services

class WifiRepository {
    suspend fun fetchData(): String {
        return try {
            val response = apiService.getRecurso()
            if (response.isSuccessful) response.body() ?: "Nenhum dado"
            else "Erro: ${response.code()}"
        } catch (e: Exception) {
            "Erro: ${e.message}"
        }
    }
}
