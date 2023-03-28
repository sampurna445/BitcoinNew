package com.example.coincap.ui.markets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coincap.R
import com.example.coincap.data.model.markets.DataModel3
import com.example.coincap.databinding.ItemMarketsBinding

class MarketsAdapter(val markets: List<DataModel3>?) :
    RecyclerView.Adapter<MarketsAdapter.ViewHolder>() {

    var onItemClick: ((DataModel3) -> Unit)? = null

    // ITEM/ROW all the settings/UI of individual items
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemMarketsBinding.bind(view)

        fun handleData(item: DataModel3?) {
            binding.marketsBaseId.text = item?.baseId
            binding.marketsQuoteSymbol.text = item?.baseSymbol
            binding.marketsUpdated.text = item?.updated.toString()

        }

    }

    // Creates the ITEM/ROW for the UI
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarketsAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_markets, parent, false)

        return ViewHolder(view)
    }

    // Size of the list
    override fun getItemCount(): Int = markets?.size ?: 0

    // Handle the CURRENT item you are on
    override fun onBindViewHolder(holder: MarketsAdapter.ViewHolder, position: Int) {
        holder.handleData(markets?.get(position))
        holder.itemView.setOnClickListener {
            markets?.get(position)?.let {
                onItemClick?.invoke(it)
            }
        }
    }
}