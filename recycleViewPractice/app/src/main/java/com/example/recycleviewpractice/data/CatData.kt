package com.example.recycleviewpractice.data

import com.example.recycleviewpractice.R
import com.example.recycleviewpractice.model.Cat

class CatData() {

    fun loadCat(): List<Cat> {
        return listOf<Cat> (
            Cat(
                R.drawable.pngwing_com,
                R.string.cat_name_1,
                R.string.cat_age_1
            ) ,
            Cat(
                R.drawable.pngwing_com__1_,
                R.string.cat_name_2,
                R.string.cat_age_2
            ),
            Cat(
                R.drawable.pngwing_com__2_,
                R.string.cat_name_3,
                R.string.cat_age_3
            ),
            Cat(
                R.drawable.pngwing_com__3_,
                R.string.cat_name_4,
                R.string.cat_age_4
            ),
            Cat(
                R.drawable.pngwing_com__4_,
                R.string.cat_name_5,
                R.string.cat_age_5
            ),
            Cat(
                R.drawable.pngwing_com__5_,
                R.string.cat_name_6,
                R.string.cat_age_6
            ))

    }

}