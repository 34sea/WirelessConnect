package com.example.wirelessconnect.utils

import android.annotation.SuppressLint
import android.content.Context
import android.net.NetworkCapabilities

object NetworkUtils {
    @SuppressLint("ServiceCast")
    fun isWifiConnected(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val network = connectivityManager.activeNetwork
        val capabilities = connectivityManager.getNetworkCapabilities(network)
        return capabilities?.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ?: false
    }
}
