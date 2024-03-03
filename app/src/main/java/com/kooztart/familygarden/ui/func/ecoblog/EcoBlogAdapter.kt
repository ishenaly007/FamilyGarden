package com.kooztart.familygarden.ui.func.ecoblog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kooztart.familygarden.R
import com.kooztart.familygarden.databinding.BlogsItemBinding

class EcoBlogAdapter(private val blogList: List<EcoBlog>) :
    RecyclerView.Adapter<EcoBlogAdapter.EcoBlogViewHolder>() {

    inner class EcoBlogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val blogImage: ImageView = itemView.findViewById(R.id.iv_blog)
        val blogName: TextView = itemView.findViewById(R.id.tv_blog)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EcoBlogViewHolder {
        val binding = BlogsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EcoBlogViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: EcoBlogViewHolder, position: Int) {
        val blog = blogList[position]

        Glide.with(holder.itemView.context)
            .load(blog.blogImg)
            .into(holder.blogImage)

        holder.blogName.text = blog.blogName
    }

    override fun getItemCount(): Int = blogList.size
}