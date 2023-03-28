package com.example.coincap.data.model.markets


import com.google.gson.annotations.SerializedName

data class MarketsModel(
    @SerializedName("data")
    val `data`: List<DataModel3?>? = listOf(),
    @SerializedName("timestamp")
    val timestamp: Long? = 0
)