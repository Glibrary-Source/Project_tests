package com.example.recycleview.data

import com.example.recycleview.R
import com.example.recycleview.model.Practice

class Datasource {

    fun loadPractice(): List<Practice> {
        return listOf<Practice> (
            Practice(R.string.practice1),
            Practice(R.string.practice2),
            Practice(R.string.practice3),
            Practice(R.string.practice4),
            Practice(R.string.practice5),
            Practice(R.string.practice6),
            Practice(R.string.practice7),
            Practice(R.string.practice8),
            Practice(R.string.practice9),
            Practice(R.string.practice10)
        )
    }
}