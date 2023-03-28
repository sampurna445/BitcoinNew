package com.example.coincap.ui.assetdetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coincap.R
import com.example.coincap.data.model.assets.DataModel
import com.example.coincap.databinding.FragmentAssetDetailsBinding

class AssetDetailsFragment : Fragment() {

    private var _binding: FragmentAssetDetailsBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: AssetDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            ViewModelProvider(this)[AssetDetailsViewModel::class.java]
        _binding = FragmentAssetDetailsBinding.inflate(inflater, container, false)

        val asset = arguments?.getSerializable("AssetItem") as DataModel

        binding.assetRank.text = asset.rank
        binding.assetName.text = asset.name
        binding.assetSymbol.text = asset.symbol
        binding.assetChangePercent24Hr.text = asset.changePercent24Hr
        binding.assetMarketCapUsd.text = asset.marketCapUsd
        binding.assetMaxSupply.text = asset.maxSupply
        binding.assetPriceUsd.text = asset.priceUsd
        binding.assetSupply.text = asset.supply
        binding.assetVolumeUsd24Hr.text = asset.volumeUsd24Hr
        binding.assetVwap24Hr.text = asset.vwap24Hr
        binding.assetId.text = asset.id


        return binding.root
    }

}