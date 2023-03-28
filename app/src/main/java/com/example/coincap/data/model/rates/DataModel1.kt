package com.example.coincap.data.model.rates


import com.google.gson.annotations.SerializedName

data class DataModel1(
    @SerializedName("currencySymbol")
    val currencySymbol: String? = "",
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("rateUsd")
    val rateUsd: String? = "",
    @SerializedName("symbol")
    val symbol: String? = "",
    @SerializedName("type")
    val type: String? = ""
):java.io.Serializable