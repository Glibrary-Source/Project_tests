package com.example.kotilnpractice

import android.util.Log.i
import javax.xml.transform.Source
import kotlin.math.*
import java.math.*
import java.lang.Math
import java.util.*
import kotlin.math.max
import kotlin.math.min

fun main() {
    val peopleAges = mutableMapOf<String, Int> (
        "Fred" to 30,
        "Ann" to 23
    )
    peopleAges.put("Barbara", 42)
    peopleAges["joe"] = 51
    peopleAges["Fred"] = 31
    println(peopleAges)

    peopleAges.forEach { println("${it.key} is ${it.value}, ")}

    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )

    val filteredNames = peopleAges.filter { it.key.length < 4 }
    val mfilterNames = mutableMapOf<String, Int>(filteredNames.keys[], )
    println(filteredNames)



//
//    val result = Solution()
//
//    val arrayResult = arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40))
//    result.solution(arrayResult)
//    val arrayResult2 = arrayOf(intArrayOf(10,7), intArrayOf(12,3), intArrayOf(8, 15), intArrayOf(14, 7), intArrayOf(5,15))
//    result.solution(arrayResult2)
//    val arrayResult3 = arrayOf(intArrayOf(14,4), intArrayOf(19,6), intArrayOf(6, 16), intArrayOf(18, 7), intArrayOf(7,11))
//    result.solution(arrayResult3)

}


//class Solution() {
//    fun solution(sizes: Array<IntArray>): Int {
//        var answer: Int = 0
//        var sizes2 = mutableListOf<Int>()
//        for (i in sizes) {
//            sizes2.add(i[0])
//            sizes2.add(i[1])
//        }
//        var totalMax = Collections.max(sizes2)
//
//        var totalMinArray = mutableListOf<Int>()
//        for(i in sizes) {
//            if(i[0] <= i[1]) {
//                totalMinArray.add(i[0])
//            } else {
//                totalMinArray.add(i[1])
//            }
//        }
//        var totalMin = Collections.max(totalMinArray)
//        answer = totalMin * totalMax
//
//        return answer
//    }
//}
//
//class Solution() {
//    fun solution(sizes: Array<IntArray>): Int {
//
//        var totalArray = mutableListOf<Int>()
//        var totalMinArray = mutableListOf<Int>()
//        sizes.forEach {
//            totalArray.add(max(it[0], it[1]))
//            totalMinArray.add(min(it[0], it[1])
//        }
//
//        return totalArray.maxOrNull()!! * totalMinArray.maxOrNull()!!
//    }
//}
/**
 * 1) 가로와 세로 배열을 합친 배열을 total_array 으로 선언한다.
 * 2) 선언한 total_array 에서 맥스값을 total_max로 선언한다.
 * 3) 가로와 세로 값이 들어있는 배열에서 두 값중 더 작은 값들을 모은 배열을 total_min으로 선언한다.
 * 4) total_min 배열의 요소값중 가장 큰 요소를 min이라는 변수로 선언한다.
 * 5) min변수와 total_max변수와 곱한값을 answer로 선언한다.
 * 6) answer을 리턴
 */

























