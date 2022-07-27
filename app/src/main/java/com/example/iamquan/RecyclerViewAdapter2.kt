package com.example.iamquan

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import com.example.diffutlisjava.databinding.CardviewItemLayoutBinding

class RecyclerViewAdapter2() :
    RecyclerView.Adapter<RecyclerViewAdapter2.ViewHolder>() {
    val differ = AsyncListDiffer(this, MyDiffUtilItem())
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            CardviewItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(differ.currentList[position])
    }

    override fun getItemCount(): Int = differ.currentList.size
    class ViewHolder(private var binding: CardviewItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(itemModel: Model) {
            binding.txtName.text = itemModel.name
            binding.txtPrice.text = itemModel.price.toString()
        }

    }
}