package com.example.coincap.ui.assets

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coincap.data.model.assets.AssetsModel
import com.example.coincap.data.remote.ApiDetails
import com.example.coincap.data.remote.ApiRequest
import com.example.coincap.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AssetsViewModel @Inject constructor(
val repository: Repository
) : ViewModel() {

        val assets = MutableLiveData<AssetsModel>()

        fun getAssets() {
          //  val retrofitInstance = ApiDetails.getInstance().create(ApiRequest::class.java)

            viewModelScope.launch {
                val result = repository.getAssets()
                assets.postValue(result)
            }

        }
    }