package com.example.coincap.data.remote

import com.example.coincap.data.model.assets.AssetsModel
import com.example.coincap.data.model.exchanges.ExchangesModel
import com.example.coincap.data.model.markets.MarketsModel
import com.example.coincap.data.model.rates.RatesModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiRequest {

    @GET(ApiDetails.BASE_URL_Assets)
    suspend fun getAssets() : AssetsModel

    @GET(ApiDetails.BASE_URL_Rates)
    suspend fun getRates() : RatesModel

    @GET(ApiDetails.BASE_URL_Exchanges)
    suspend fun getExchanges() : ExchangesModel

    @GET(ApiDetails.BASE_URL_Markets)
    suspend fun getMarkets() : MarketsModel
}