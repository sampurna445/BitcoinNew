package com.example.coincap.ui.exchanges

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coincap.R
import com.example.coincap.data.model.assets.DataModel
import com.example.coincap.data.model.exchanges.DataModel2
import com.example.coincap.databinding.ItemExchangesBinding

class ExchangesAdapter(val exchanges: List<DataModel2>?) :
    RecyclerView.Adapter<ExchangesAdapter.ViewHolder>() {

    var onItemClick: ((DataModel2) -> Unit)? = null

    // ITEM/ROW all the settings/UI of individual items
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemExchangesBinding.bind(view)

        fun handleData(item: DataModel2?) {
            binding.exchangesRank.text = item?.rank
            binding.exchangesName.text = item?.name
            binding.exchangesTrading.text = item?.tradingPairs
        }

    }

    // Creates the ITEM/ROW for the UI
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExchangesAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_exchanges, parent, false)

        return  ViewHolder(view)
    }

    // Size of the list
    override fun getItemCount(): Int = exchanges?.size ?: 0

    // Handle the CURRENT item you are on
    override fun onBindViewHolder(holder: ExchangesAdapter.ViewHolder, position: Int) {
        holder.handleData(exchanges?.get(position))
        holder.itemView.setOnClickListener {
            exchanges?.get(position)?.let {
                onItemClick?.invoke(it)
            }
        }
    }

}