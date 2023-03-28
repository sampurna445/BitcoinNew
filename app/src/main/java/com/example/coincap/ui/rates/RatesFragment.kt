package com.example.coincap.ui.rates

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coincap.R
import com.example.coincap.data.model.rates.DataModel1
import com.example.coincap.data.model.rates.RatesModel
import com.example.coincap.databinding.FragmentRatesBinding

class RatesFragment : Fragment() {

    private lateinit var viewModel: RatesViewModel
    private var _binding: FragmentRatesBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            ViewModelProvider(this)[RatesViewModel::class.java]
        _binding = FragmentRatesBinding.inflate(inflater, container, false)

        viewModel.rates.observe(viewLifecycleOwner) {
            it?.let {
                setupUI(it)
            }
        }

        viewModel.getRates()

        return binding.root
    }

    private fun setupUI(rates: RatesModel) {
        val ratesAdapter = RatesAdapter(rates.data as List<DataModel1>?)
        binding.rvRates.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ratesAdapter
        }
        ratesAdapter.onItemClick = {
            val bundle=Bundle().apply{
                putSerializable("RatesItem",it)
            }
            findNavController().navigate(
                R.id.action_rates_to_rates_details,bundle
            )
        }

    }
}