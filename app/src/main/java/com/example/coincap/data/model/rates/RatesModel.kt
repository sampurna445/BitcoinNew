package com.example.coincap.data.model.rates


import com.google.gson.annotations.SerializedName

data class RatesModel(
    @SerializedName("data")
    val `data`: List<DataModel1?>? = listOf(),
    @SerializedName("timestamp")
    val timestamp: Long? = 0
)