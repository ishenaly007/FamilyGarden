package com.kooztart.familygarden.ui.func.treeshops

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kooztart.familygarden.databinding.ShopsItemBinding

class TreeShopsAdapter(private val treeShops: List<TreeShop>) :
    RecyclerView.Adapter<TreeShopsAdapter.TreeShopViewHolder>() {

    inner class TreeShopViewHolder(val binding: ShopsItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TreeShopViewHolder {
        val binding = ShopsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TreeShopViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TreeShopViewHolder, position: Int) {
        val treeShop = treeShops[position]

        Glide.with(holder.itemView.context)
            .load(treeShop.imageUrl)
            .into(holder.binding.ivTreeShop)
    }

    override fun getItemCount(): Int = treeShops.size
}
