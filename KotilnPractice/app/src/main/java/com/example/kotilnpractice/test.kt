package com.example.kotilnpractice

import androidx.lifecycle.Transformations.map
import java.util.*
import kotlin.Comparator


fun main() {

    Solution().solution(
        arrayOf   ("rock" ,"rock" ,"jazz" ,"classic", "pop", "classic", "classic", "pop"),
        intArrayOf(2000, 700, 200, 500, 600, 150, 800, 2500)
    )


//    Solution().solution(
//        arrayOf(
//            arrayOf("crow_mask", "face"),
//            arrayOf("blue_sunglasses", "face"),
//            arrayOf("smoky_makeup", "face")
//        )
//    )


}

class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        //genresCountHashMap 해시맵에 generes 요소를 키값으로 하고 generes 요소와 동인한 index 값에 있는 plays 요소를
        //더한값들을 value 값으로 추가한다
        //genresHashMap 해시맵에 generes 요소를 키값으로 하고 generes 요소와 동인한 index 값에 있는 plays 요소를
        //String 타입으로 value 값으로 추가한다

        var genresHashMap = hashMapOf<String, IntArray>()
        var genresCountHashMap = hashMapOf<String, Int>()

        for((index, key ) in genres.withIndex()) {
            if (genresHashMap[key] == null) genresHashMap[key] = intArrayOf(plays[index])
            else {
                genresHashMap[key] = genresHashMap[key]!!.plus(plays[index])
            }
        }

        for((index, key ) in genres.withIndex()) {
            if(genresCountHashMap[key] == null) genresCountHashMap[key] = plays[index]
            else { genresCountHashMap[key] = genresCountHashMap[key]!! + plays[index]}
        }

        //genresCountHashMap 변수에서 value 만 뽑아내서 역순으로 정렬한 값을 for 로 반복한뒤 genresCountHashMap 변수의
        //value 값 과 일치하는 key 값 리스트를 만든다.

        val genresCountRankList = mutableListOf<String>()
        for(i in genresCountHashMap.map{ it.value }.sortedDescending()) {
            for((key, value) in genresCountHashMap) {
                if(value == i) {
                    genresCountRankList.add("$key")
                }
            }
        }


        //genresIndexPlayHashMap 해시맵에 genres 요소를 key 값으로 요소의 index 값을 value 로 지정한다
        var genresIndexPlayHashMap = hashMapOf<String, IntArray>()
        for ((index, key) in  genres.withIndex()) {
            if(genresIndexPlayHashMap[key] == null) {
                genresIndexPlayHashMap[key] = intArrayOf(index)
            }
            else {
                genresIndexPlayHashMap[key] = genresIndexPlayHashMap[key]!!.plus(index)
            }
        }

        for(rank in genresCountRankList) {
            for(num in genresHashMap[rank]!!.sortedDescending()) {
                genresHashMap[rank]!!.find {it == num}
            }
        }

        var test = hashMapOf<String, Array<String>>()

        for((key, value) in genresHashMap) {
            for((index, num) in value.withIndex()){
                if(test[key] == null) {
                    test[key] = arrayOf("${num} ${genresIndexPlayHashMap[key]!!.get(index)}")
                } else {
                    test[key] = test[key]!!.plus("${num} ${genresIndexPlayHashMap[key]!!.get(index)}")
                }
            }
        }

        val comparator : Comparator<String> = compareBy { it.split(" ")[0].toInt() }

        var result = mutableListOf<Int>()

        for(type in genresCountRankList){
                for ((key, value) in test) {
                    if(key == type){
                        if (value.size == 1) {
                            result.add(value.sortedWith(comparator)
                                .reversed()[0].split(" ")[1].toInt())
                        } else {
                            result.add(value.sortedWith(comparator)
                                .reversed()[0].split(" ")[1].toInt())
                            result.add(value.sortedWith(comparator)
                                .reversed()[1].split(" ")[1].toInt())
                        }
                    }
                }
        }
        return result.toIntArray()
    }
}

/**
 * 1. genresHashMap 변수에 genres리스트의 요소를 key값으로 plays리스트의 요소를 value 값으로 선언한다
 * 2.
 *
 *
 *
 */




//class Solution {
//    fun solution(clothes: Array<Array<String>>): Int {
//        var answer = 1
//        var clotheHashMap = hashMapOf<String, Int>()
//        for(clothe in clothes) {
//            clotheHashMap[clothe[1]]?.let { clotheHashMap.put(clothe[1], it + 1) } ?: clotheHashMap.put(clothe[1], 1)
//        }
//        println(clotheHashMap)
//        for(i in clotheHashMap) { answer *= (i.value + 1)}
//        println(answer)
//        return (answer - 1)
//    }
//}






































