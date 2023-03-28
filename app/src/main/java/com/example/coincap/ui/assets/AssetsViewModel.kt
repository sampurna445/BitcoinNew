package com.example.coincap.ui.assets

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coincap.data.model.assets.AssetsModel
import com.example.coincap.data.remote.ApiDetails
import com.example.coincap.data.remote.ApiRequest
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class AssetsViewModel : ViewModel() {

        val assets = MutableLiveData<AssetsModel>()

        fun getAssets() {
            val retrofitInstance = ApiDetails.getInstance().create(ApiRequest::class.java)

            GlobalScope.launch {
                val result = retrofitInstance.getAssets()
                assets.postValue(result)
            }

        }
    }