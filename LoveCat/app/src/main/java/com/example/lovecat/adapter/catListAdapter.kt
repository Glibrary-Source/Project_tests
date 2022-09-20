package com.example.lovecat.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lovecat.R
import com.example.lovecat.model.Cat

class CatListAdapter (
    private val context: Context,
    private val dataset: List<Cat>
):RecyclerView.Adapter<CatListAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) :RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.type_name)
        val ImageView: ImageView = view.findViewById(R.id.cat_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.cat_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.catNameResourceId)
    }

    override fun getItemCount(): Int = dataset.size

}