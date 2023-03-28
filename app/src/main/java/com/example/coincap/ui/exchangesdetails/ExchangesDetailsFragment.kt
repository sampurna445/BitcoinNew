package com.example.coincap.ui.exchangesdetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coincap.R
import com.example.coincap.data.model.assets.DataModel
import com.example.coincap.data.model.exchanges.DataModel2
import com.example.coincap.databinding.FragmentAssetDetailsBinding
import com.example.coincap.databinding.FragmentExchangesDetailsBinding

class ExchangesDetailsFragment : Fragment() {

    private var _binding: FragmentExchangesDetailsBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: ExchangesDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            ViewModelProvider(this)[ExchangesDetailsViewModel::class.java]
        _binding = FragmentExchangesDetailsBinding.inflate(inflater, container, false)

        val exchanges = arguments?.getSerializable("ExchangesItem") as DataModel2

        binding.exchangesRank.text = exchanges.rank
        binding.exchangesName.text = exchanges.name
        binding.exchangesTradingPairs.text = exchanges.tradingPairs
        binding.exchangesExchangeUrl.text = exchanges.exchangeUrl
        binding.exchangesId.text = exchanges.id
        binding.exchangesPercentTotalVolume.text = exchanges.percentTotalVolume
        binding.exchangesSocket.text = exchanges.socket.toString()
        binding.exchangesUpdated.text = exchanges.updated.toString()
        binding.exchangesVolumeUsd.text = exchanges.volumeUsd


        return binding.root
    }

}