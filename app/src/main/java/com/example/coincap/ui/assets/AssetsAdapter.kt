package com.example.coincap.ui.assets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coincap.R
import com.example.coincap.data.model.assets.DataModel
import com.example.coincap.databinding.ItemAssetsBinding

class AssetsAdapter(val assets: List<DataModel>?) :
    RecyclerView.Adapter<AssetsAdapter.ViewHolder>() {

    var onItemClick: ((DataModel) -> Unit)? = null

    // ITEM/ROW all the settings/UI of individual items
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemAssetsBinding.bind(view)

        fun handleData(item: DataModel?) {
            binding.assetRank.text = item?.rank
            binding.assetName.text = item?.name
            binding.assetSymbol.text = item?.symbol
        }

    }

    // Creates the ITEM/ROW for the UI
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AssetsAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_assets, parent, false)

        return  ViewHolder(view)
    }

    // Size of the list
    override fun getItemCount(): Int = assets?.size ?: 0

    // Handle the CURRENT item you are on
    override fun onBindViewHolder(holder: AssetsAdapter.ViewHolder, position: Int) {
        holder.handleData(assets?.get(position))
        holder.itemView.setOnClickListener {
            assets?.get(position)?.let {
                onItemClick?.invoke(it)
            }
        }
    }
}