package com.example.coincap.ui.exchanges

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coincap.data.model.assets.AssetsModel
import com.example.coincap.data.model.exchanges.ExchangesModel
import com.example.coincap.data.remote.ApiDetails
import com.example.coincap.data.remote.ApiRequest
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ExchangesViewModel : ViewModel() {


    val exchanges = MutableLiveData<ExchangesModel>()

    fun getExchanges() {
        val retrofitInstance = ApiDetails.getExchanges().create(ApiRequest::class.java)

        GlobalScope.launch {
            val result = retrofitInstance.getExchanges()
            exchanges.postValue(result)
        }

    }
}