package com.example.coincap.ui.exchangesdetails

import androidx.lifecycle.ViewModel
import com.example.coincap.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExchangesDetailsViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {
    // TODO: Implement the ViewModel
}