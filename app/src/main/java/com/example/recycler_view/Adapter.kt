package com.example.recycler_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.recycler_view.databinding.ItemBinding

class Adapter(val itemData: ItemData) : ListAdapter<ItemData, ItemViewHolder>(compare) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        getItem(position).let {
            holder.binding.imageView.setImageResource(getItem(position).image)
            holder.binding.name.text = getItem(position).name
            holder.binding.time.text = getItem(position).time
            holder.binding.lastMessage.text = getItem(position).lastMessage

        }
    }

    companion object {
        val compare = object : DiffUtil.ItemCallback<ItemData>() {
            override fun areItemsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
                return oldItem == newItem
            }

        }
    }

}