package com.example.coincap.ui.exchanges

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coincap.data.model.assets.AssetsModel
import com.example.coincap.data.model.exchanges.ExchangesModel
import com.example.coincap.data.remote.ApiDetails
import com.example.coincap.data.remote.ApiRequest
import com.example.coincap.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExchangesViewModel @Inject constructor(
    val repository: Repository
): ViewModel() {


    val exchanges = MutableLiveData<ExchangesModel>()

    fun getExchanges() {
       // val retrofitInstance = ApiDetails.getExchanges().create(ApiRequest::class.java)

        viewModelScope.launch {
            val result = repository.getExchanges()
            exchanges.postValue(result)
        }

    }
}