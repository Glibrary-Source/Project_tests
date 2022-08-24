package com.example.recycleviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewpractice.adapter.CatAdapter
import com.example.recycleviewpractice.data.CatData
import com.example.recycleviewpractice.model.Cat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataSet2 = CatData().loadCat()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = CatAdapter(this, myDataSet2)
        recyclerView.setHasFixedSize(true)

    }
}