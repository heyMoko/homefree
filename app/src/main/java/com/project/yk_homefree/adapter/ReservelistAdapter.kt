package com.project.yk_homefree.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.project.yk_homefree.databinding.ItemReservelistBinding
import com.project.yk_homefree.model.ReservelistModel
import java.text.SimpleDateFormat

class ReservelistAdapter: ListAdapter<ReservelistModel, ReservelistAdapter.ViewHolder>(diffUtil) {

    inner class ViewHolder(private val binding: ItemReservelistBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(reservelistModel: ReservelistModel) {
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemReservelistBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<ReservelistModel>() {
            override fun areItemsTheSame(
                oldItem: ReservelistModel,
                newItem: ReservelistModel
            ): Boolean {
                return oldItem.address == newItem.address
            }

            override fun areContentsTheSame(
                oldItem: ReservelistModel,
                newItem: ReservelistModel
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}