package com.example.coincap.ui.rates

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coincap.data.model.rates.RatesModel
import com.example.coincap.data.remote.ApiDetails
import com.example.coincap.data.remote.ApiRequest
import com.example.coincap.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RatesViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    val rates = MutableLiveData<RatesModel>()

    fun getRates() {
        //val retrofitInstance = ApiDetails.getRates().create(ApiRequest::class.java)

        viewModelScope.launch {
            val result = repository.getRates()
            rates.postValue(result)
        }

    }
}