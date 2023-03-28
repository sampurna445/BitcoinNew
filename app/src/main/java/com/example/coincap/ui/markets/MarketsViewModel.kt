package com.example.coincap.ui.markets

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coincap.data.model.markets.MarketsModel
import com.example.coincap.data.model.rates.RatesModel
import com.example.coincap.data.remote.ApiDetails
import com.example.coincap.data.remote.ApiRequest
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
@HiltViewModel
class MarketsViewModel : ViewModel() {

    val markets = MutableLiveData<MarketsModel>()

    fun getMarkets() {
        val retrofitInstance = ApiDetails.getMarkets().create(ApiRequest::class.java)

        GlobalScope.launch {
            val result = retrofitInstance.getMarkets()
            markets.postValue(result)
        }

    }
}