package com.example.coincap.data.repository

import com.example.coincap.data.model.assets.AssetsModel
import com.example.coincap.data.model.exchanges.ExchangesModel
import com.example.coincap.data.model.markets.MarketsModel
import com.example.coincap.data.model.rates.RatesModel
import com.example.coincap.data.remote.ApiRequest
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    val apiRequest : ApiRequest
) : Repository {
    override suspend fun getAssets(): AssetsModel = apiRequest.getAssets()

    override suspend fun getRates(): RatesModel = apiRequest.getRates()
    override suspend fun getExchanges(): ExchangesModel = apiRequest.getExchanges()
    override suspend fun getMarkets(): MarketsModel = apiRequest.getMarkets()
}