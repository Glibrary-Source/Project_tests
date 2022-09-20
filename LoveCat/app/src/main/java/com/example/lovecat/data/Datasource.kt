package com.example.lovecat.data

import com.example.lovecat.R
import com.example.lovecat.model.Cat

class Datasource() {

    fun loadCat(): List<Cat> {
        return listOf<Cat>(
            Cat(R.string.cat_name1),
            Cat(R.string.cat_name2),
            Cat(R.string.cat_name3),
            Cat(R.string.cat_name4),
            Cat(R.string.cat_name5),
            Cat(R.string.cat_name6),
            Cat(R.string.cat_name7),
            Cat(R.string.cat_name8),
            Cat(R.string.cat_name9),
            Cat(R.string.cat_name10),
            Cat(R.string.cat_name11)
        )
    }
}