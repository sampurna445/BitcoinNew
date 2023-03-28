package com.example.coincap.ui.marketsdetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coincap.data.model.markets.DataModel3
import com.example.coincap.databinding.FragmentMarketsDetailsBinding

class bindMarketsDetailsFragment : Fragment() {

    private var _binding: FragmentMarketsDetailsBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: MarketsDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            ViewModelProvider(this)[MarketsDetailsViewModel::class.java]
        _binding = FragmentMarketsDetailsBinding.inflate(inflater, container, false)

        val markets = arguments?.getSerializable("MarketsItem") as DataModel3

        binding.marketsBaseId.text = markets.baseId
        binding.marketsQuoteSymbol.text = markets.quoteSymbol
        binding.marketsUpdated.text = markets.updated.toString()
        binding.marketsExchangeId.text = markets.exchangeId
        binding.marketsPercentExchangeVolume.text = markets.percentExchangeVolume
        binding.marketsPriceQuote.text = markets.priceQuote
        binding.marketsPriceUsd.text = markets.priceUsd
        binding.marketsQuoteId.text = markets.quoteId
        binding.marketsVolumeUsd24Hr.text = markets.volumeUsd24Hr
        binding.marketsQuoteSymbol.text = markets.quoteSymbol
        binding.marketsRank.text = markets.rank
        binding.marketsBaseSymbol.text = markets.baseSymbol


        return binding.root
    }

}