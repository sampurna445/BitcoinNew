package com.example.coincap.data.model.exchanges


import com.google.gson.annotations.SerializedName

data class DataModel2(
    @SerializedName("exchangeUrl")
    val exchangeUrl: String? = "",
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("percentTotalVolume")
    val percentTotalVolume: String? = "",
    @SerializedName("rank")
    val rank: String? = "",
    @SerializedName("socket")
    val socket: Boolean? = false,
    @SerializedName("tradingPairs")
    val tradingPairs: String? = "",
    @SerializedName("updated")
    val updated: Long? = 0,
    @SerializedName("volumeUsd")
    val volumeUsd: String? = ""
):java.io.Serializable