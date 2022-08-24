package com.example.recycleviewpractice.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewpractice.R
import com.example.recycleviewpractice.data.CatData
import com.example.recycleviewpractice.model.Cat

class CatAdapter (
    private val context: Context,
    private val dataset: List<Cat>
        ): RecyclerView.Adapter<CatAdapter.CatViewHolder>() {

    class CatViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.Cat_image)
        val textViewName: TextView = view.findViewById(R.id.Cat_name)
        val textViewAge: TextView = view.findViewById(R.id.Cat_age)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val adapter = LayoutInflater.from(parent.context)
            .inflate(R.layout.cat_item, parent, false)

        return CatViewHolder(adapter)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.imageSourceId)
        holder.textViewName.text = context.resources.getString(item.nameSourceId)
        holder.textViewAge.text = context.resources.getString(item.agaSourceId)
    }

    override fun getItemCount(): Int = dataset.size
}