package com.example.kimpractice


fun main() {

    var b = Solution()

    val solution = b.solution(
        arrayOf(
            arrayOf("yellow_hat", "headgear"),
            arrayOf("blue_sunglasses", "eyewear"),
            arrayOf("green_turban", "headgear"),
            arrayOf("green_pants", "pants"),
            arrayOf("red_pants", "pants")
        )
    )

    println(solution)

}



class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer2 = 1
        val sep = HashMap<String, Int>()

        for (cloth in clothes) {
            sep[cloth[1]]?.let { sep.put(cloth[1], it + 1) } ?: sep.put(cloth[1], 1)
        }
//        sep["headgear"]?.let { sep.put(headgear, it + 1)}?: sep.put(cloth[1], 1)

        for (i in sep) {
            answer2 *= (i.value + 1)
        }
        return (answer2 - 1)
    }
}

    fun solution2(clothes: Array<Array<String>>): Int {
        var answer = 1
        val sep2 = HashMap<String,Int>()

        for(cloth in clothes){
            sep2[cloth[1]]?.let {sep2.put(cloth[1], it+1)} ?: sep2.put(cloth[1],1)
        }


        for (i in sep2) { answer *= (i.value +1)}
        return (answer-1)

    }
/**
 * 1. 입력값을 받아옴
 * 2. 빈 해시맵을 만들듬
 * 3. 빈 해시맵에 입력값으로 받은 첫번째 배열의 옷 종류를 키값으로 두고 중복될때마다 밸류값을 1식 카운트
 * 한다
 * 4.
 */





























