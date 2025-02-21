package com.example.wirelessconnect.models

import androidx.lifecycle.ViewModel
import com.example.wirelessconnect.services.WifiRepository

class WifiViewModel : ViewModel() {
    private val repository = WifiRepository()

    suspend fun getData(): String {
        return repository.fetchData()
    }
}
