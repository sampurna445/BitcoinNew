package com.example.coincap.ui.assetdetails

import androidx.lifecycle.ViewModel
import com.example.coincap.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AssetDetailsViewModel @Inject constructor(
    repository: Repository
) : ViewModel() {
    // TODO: Implement the ViewModel
}