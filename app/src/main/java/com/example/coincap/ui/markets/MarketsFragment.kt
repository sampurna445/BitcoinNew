package com.example.coincap.ui.markets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coincap.R
import com.example.coincap.data.model.markets.DataModel3
import com.example.coincap.data.model.markets.MarketsModel
import com.example.coincap.databinding.FragmentMarketsBinding
import com.example.coincap.ui.assets.AssetsAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MarketsFragment : Fragment() {
    private lateinit var viewModel: MarketsViewModel
    private var _binding: FragmentMarketsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            ViewModelProvider(this)[MarketsViewModel::class.java]
        _binding = FragmentMarketsBinding.inflate(inflater, container, false)

        viewModel.markets.observe(viewLifecycleOwner) {
            it?.let {
                setupUI(it)
            }
        }

        viewModel.getMarkets()

        return binding.root
    }

    private fun setupUI(markets: MarketsModel) {
        val marketsAdapter = MarketsAdapter(markets.data as List<DataModel3>?)
        binding.rvMarkets.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = marketsAdapter
        }
        marketsAdapter.onItemClick = {
            val bundle = Bundle().apply {
                putSerializable("MarketsItem", it)
            }
            findNavController().navigate(
                R.id.action_markets_to_markets_details, bundle
            )
        }
    }
}