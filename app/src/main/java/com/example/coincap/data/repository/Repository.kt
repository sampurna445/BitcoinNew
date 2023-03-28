package com.example.coincap.data.repository

import com.example.coincap.data.model.assets.AssetsModel
import com.example.coincap.data.model.exchanges.ExchangesModel
import com.example.coincap.data.model.markets.MarketsModel
import com.example.coincap.data.model.rates.RatesModel


interface Repository {

    suspend fun getAssets() : AssetsModel


    suspend fun getRates() : RatesModel


    suspend fun getExchanges() : ExchangesModel


    suspend fun getMarkets() : MarketsModel
}