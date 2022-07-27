package com.example.iamquan

import androidx.recyclerview.widget.DiffUtil

class MyDiffUtilItem : DiffUtil.ItemCallback<Model>() {
    override fun areItemsTheSame(oldItem: Model, newItem: Model): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Model, newItem: Model): Boolean {
        return oldItem == newItem
    }

    override fun getChangePayload(oldItem: Model, newItem: Model): Any? {
        return super.getChangePayload(oldItem, newItem)
        
    }
}