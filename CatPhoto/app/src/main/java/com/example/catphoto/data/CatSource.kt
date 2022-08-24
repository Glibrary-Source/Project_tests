package com.example.catphoto.data

import com.example.catphoto.R
import com.example.catphoto.model.Cat

class CatSource {

    fun loadCat(): List<Cat> {
        return listOf<Cat>(
            Cat(R.drawable.pngwing_com, R.string.cat_name1),
            Cat(R.drawable.pngwing_com__1_, R.string.cat_name2),
            Cat(R.drawable.pngwing_com__2_, R.string.cat_name3),
            Cat(R.drawable.pngwing_com__3_, R.string.cat_name4),
            Cat(R.drawable.pngwing_com__4_, R.string.cat_name5),
            Cat(R.drawable.pngwing_com__5_, R.string.cat_name6)
        )
    }

}