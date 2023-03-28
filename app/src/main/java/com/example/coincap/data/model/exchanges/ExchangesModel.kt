package com.example.coincap.data.model.exchanges


import com.google.gson.annotations.SerializedName

data class ExchangesModel(
    @SerializedName("data")
    val data: List<DataModel2?>? = listOf(),
    @SerializedName("timestamp")
    val timestamp: Long? = 0
)