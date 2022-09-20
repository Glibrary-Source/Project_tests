package com.example.lovecat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lovecat.adapter.CatListAdapter
import com.example.lovecat.data.Datasource

class CatListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cat_list)

        val myDataset = Datasource().loadCat()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_cat)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = CatListAdapter(this, myDataset)

    }


}