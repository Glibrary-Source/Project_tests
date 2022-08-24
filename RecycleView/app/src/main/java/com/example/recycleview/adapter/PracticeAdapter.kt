package com.example.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.R
import com.example.recycleview.model.Practice

class PracticeAdapter (
    private val context: Context,
    private val dataset: List<Practice>
        ): RecyclerView.Adapter<PracticeAdapter.PracticeViewHolder>() {


    class PracticeViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.TextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PracticeViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return PracticeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: PracticeViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResource)
    }

    override fun getItemCount(): Int = dataset.size
}