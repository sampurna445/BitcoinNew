package com.example.coincap.ui.markets

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coincap.data.model.markets.MarketsModel
import com.example.coincap.data.model.rates.RatesModel
import com.example.coincap.data.remote.ApiDetails
import com.example.coincap.data.remote.ApiRequest
import com.example.coincap.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MarketsViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    val markets = MutableLiveData<MarketsModel>()

    fun getMarkets() {
      //  val retrofitInstance = ApiDetails.getMarkets().create(ApiRequest::class.java)

        viewModelScope.launch {
            val result = repository.getMarkets()
            markets.postValue(result)
        }

    }
}