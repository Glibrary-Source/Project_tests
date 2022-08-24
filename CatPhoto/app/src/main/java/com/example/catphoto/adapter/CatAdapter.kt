package com.example.catphoto.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.catphoto.R
import com.example.catphoto.model.Cat
import org.w3c.dom.Text

class CatAdapter (
    val context: Context,
    val dataset: List<Cat>
): RecyclerView.Adapter<CatAdapter.CatViewHolder>() {

    class CatViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.cat_image)
        val textView: TextView = view.findViewById(R.id.cat_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cat, parent, false)

        return CatViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        val item = dataset[position]

        holder.imageView.setImageResource(item.ResourceImageId)
        holder.textView.text = context.getString(item.ResourceTextId)
    }
    override fun getItemCount(): Int = dataset.size
}