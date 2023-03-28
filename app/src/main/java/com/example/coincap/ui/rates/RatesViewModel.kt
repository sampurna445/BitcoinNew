package com.example.coincap.ui.rates

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coincap.data.model.rates.RatesModel
import com.example.coincap.data.remote.ApiDetails
import com.example.coincap.data.remote.ApiRequest
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RatesViewModel : ViewModel() {

    val rates = MutableLiveData<RatesModel>()

    fun getRates() {
        val retrofitInstance = ApiDetails.getRates().create(ApiRequest::class.java)

        GlobalScope.launch {
            val result = retrofitInstance.getRates()
            rates.postValue(result)
        }

    }
}