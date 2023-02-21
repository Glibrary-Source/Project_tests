package com.example.testaplication

import java.util.*
import kotlin.collections.HashMap
import kotlinx.coroutines.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


fun main() {
    val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")
    repeat(3){
        Thread {
            println("${Thread.currentThread()} has Started")
            for ( i in states ) {
                println("${Thread.currentThread()} - $i")
                Thread.sleep(50)
            }
        }.start()
    }
}

//class Solution {
//    fun solution(v: Array<IntArray>): Array<Int> {
//        var result = mutableListOf<Int>()
//        var xCoordinate = mutableListOf<Int>()
//        var yCoordinate = mutableListOf<Int>()
//
//        for(list in v) {
//            xCoordinate.add(list[0])
//        }
//
//        for(list in v) {
//            yCoordinate.add(list[1])
//        }
//
//        var setXCoordinate = xCoordinate.toSet()
//        var setYCoordinate = yCoordinate.toSet()
//
//        for (x in setXCoordinate) {
//            if(xCoordinate.count { it == x } < 2) {
//                result.add(x)
//            }
//        }
//
//        for (y in setYCoordinate) {
//            if(yCoordinate.count { it == y } < 2) {
//                result.add(y)
//            }
//        }
//
//        val answer = arrayOf(result[0], result[1])
//        return answer
//
//    }
//}


/**
 * 1.x 좌표를 모두 모은 list를 만듬
 * 2.y 좌표를 모두 모은 list를 만듬
 * 3. 리스트 x 에서 배열의 개수가 1개인 값을 answer x좌표로 지정
 * 4. 리스트 y 에서 배열의 개수가 1개인 값을 answer y좌표로 지정
 * 5. 리턴 answer개발자 무선키보드
 */

//class Solution {
//    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
//        val result = mutableListOf<Int>()
//        var resultList = mutableListOf<Int>()
//
//        for(i in commands) {
//            var numList = array.slice(i[0]-1 until i[1]).sorted()
//            resultList.add(numList[i[2]-1])
//        }
//        return resultList.toIntArray()
//    }
//}

/**
 * 1.commands의 intarray의 인덱스 1,2 요소의 값으로 array 를 슬라이스
 * 2.슬라이스한 array의 commands의 intarray의 3번째 원소를 answer intArray에 추가
 * 3.for문 반복
 */
//
//class Solution {
//    fun solution(n: Int, k: Int): Int {
//        var answer = 0
//
//        var num=0L
//        changeNum(n,k).apply {
//            for(ch in this) {
//                if(ch=='0') {
//                    answer+=isPrime(num)
//                    num=0
//                }
//                else {
//                    num = num*10 +Character.getNumericValue(ch)
//                }
//            }
//        }
//        answer += isPrime(num)
//        return answer
//    }
//
//    private fun changeNum(n: Int, k: Int) : String {
//        var numList = mutableListOf<Int>()
//        var n = n
//        while(n >= k) {
//            numList.add(n%k)
//            n /= k
//            if(n < k) {
//                numList.add(n)
//            }
//        }
//
//        numList.reverse()
//        return numList.joinToString("")
//    }
//
//    private fun isPrime(num: Long): Int {
//        if(num<=1) return 0
//        for(i in 2..Math.sqrt(num.toDouble()).toLong()) {
//            if(num%i==0L) return 0
//        }
//        return 1
//    }
//}



/**
 * 1.n을 k로 나눈 나머지를 저장하는 리스트를 만듬
 * 2.
 *
 */
//
//class Solution2 {
//
//    fun solution(n:Int, k:Int) : Int {
//        var answer = 0
//        val newN = n.toString(k).split("0")
//        for(i in  newN) {
//            if(i == "" || i == "0" || i == "1") continue
//            if(BigInteger(i).isProbablePrime(1)) answer ++
//        }
//        return answer
//
//    }
//}

//class Solution {
//    fun solution(N: Int, stages: IntArray): IntArray {
//        var answer = intArrayOf()
//        var rStages = stages.toMutableList()
//        var setStage = stages.toSet().sorted()
//        var rank = mutableListOf<Float>()
//
//
//        for(Stage in setStage) {
//            var count = (rStages.count{ it == Stage}).toFloat()
//            var size = rStages.size.toFloat()
//            rank.add(count/size)
//
//
//
//            while(rStages.contains(Stage)) {
//
//                rStages.remove(Stage)
//            }
//
//            println(rank.sorted().reversed())
//
//
//
//        }
//
//        return answer
//    }
//}


/**
 * 1.stages 요소의 중복을 제외한 리스트를 setStage 변수에 선언한다.
 * 2.선언한 setStage의 요소 를 for 문을 통해 반복
 * 3.setStage의 요소 한개의 개수를 stages리스트에 포함된 개수만큼 count 하는 변수를 선언
 * 4.stages 의 요소 개수를 count 해주는 size 변수를 선언
 * 5.setStage 요소의 크기보다 작은 stages요소는 삭제한다
 * 6.
 *
 */

//프로그래머스 카카오 코딩테스트 (주차요금계산 lv2)

//class Solution {
//    fun solution(fees: IntArray, records: Array<String>): IntArray {
//        var answer: IntArray = intArrayOf()
//        var result = mutableListOf<Int>()
//
//        var carList = mutableListOf<String>()
//
//        for(num in records) {
//            carList.add(num.split(" ")[1])
//        }
//
//        carList = carList.distinct().toMutableList()
//        carList = carList.sorted().toMutableList()
//
//        var carRecord = hashMapOf<String, String>()
//
//        for (num in carList) {
//            for(record in records) {
//                if(record.split(" ")[1] == num) {
//                    if(carRecord[num] == null) {
//                        carRecord[record.split(" ")[1]] = "${record.split(" ")[0]} ${record.split(" ")[2]}"
//                    } else {
//                        carRecord[record.split(" ")[1]] = "${carRecord[num]}/" + "${record.split(" ")[0]} ${record.split(" ")[2]}"
//                    }
//                }
//            }
//        }
//        var carTotalParkTime = 0
//        var carFees = 0
//        var expiryTime = "23:59"
//
//        for(num in carList) {
//            var carParkTime = carRecord[num]!!.split("/")
//            var carTime = mutableListOf<String>()
//
//            for(time in carParkTime) {
//                carTime.add(time.split(" ")[0])
//            }
//
//            if(carTime.size % 2 == 0) {
//                for(num in 1 until carTime.size step 2) {
//                    carTotalParkTime += (carTime[num].split(":")[0].toInt() - carTime[num-1].split(":")[0].toInt()) * 60 +
//                            (carTime[num].split(":")[1].toInt() - carTime[num-1].split(":")[1].toInt())
//                }
//                if(carTotalParkTime <= fees[0]) {
//                    carFees = fees[1]
//                    result.add(carFees)
//                } else {
//                    carFees = fees[1] + ceil((carTotalParkTime.toDouble() - fees[0].toDouble())/fees[2].toDouble()).toInt() * fees[3]
//                    result.add(carFees)
//                }
//                carTotalParkTime = 0
//            } else {
//                carTime.add(expiryTime)
//                for(num in 1 until carTime.size step 2) {
//                    carTotalParkTime += (carTime[num].split(":")[0].toInt() - carTime[num-1].split(":")[0].toInt()) * 60 +
//                            (carTime[num].split(":")[1].toInt() - carTime[num-1].split(":")[1].toInt())
//                }
//                if(carTotalParkTime <= fees[0]) {
//                    carFees = fees[1]
//                    result.add(carFees)
//
//                } else {
//                    carFees = fees[1] + ceil((carTotalParkTime.toDouble() - fees[0].toDouble())/fees[2].toDouble()).toInt() * fees[3]
//                    result.add(carFees)
//                }
//                carTotalParkTime = 0
//            }
//        }
//        answer = result.toIntArray()
//
//        return answer
//    }
//}


/**
 * 1.
 *
 *
 *
 */

////카카오 코딩테스트 (오픈채팅방 lv2)
//class Solution {
//    fun solution(record: Array<String>): Array<String> {
//        //2. result 라는 이름의 빈 mutableList 갖는 변수를 선언 후
//        var result = mutableListOf<String>()
//
//        var userNameAndNickname = hashMapOf<String, String>()
//
//        //1. 유저 네임을 key 값으로 최종 닉네임을 value 값을 가진 해시맵인 userNameAndNickname 리턴
//        for(log in record) {
//            if(log.split(" ")[0] == "Change" || log.split(" ")[0] == "Enter") {
//                userNameAndNickname[log.split(" ")[1]] = log.split(" ")[2]
//            }
//        }
//
//        //3. 반복문을 통해 result 에 record 요소를 스플릿한 후 첫번째 요소가 Enter 또는 Leave 에 맞춰 값을 add 해준다
//        for(log in record) {
//            when(log.split(" ")[0]) {
//                "Enter" -> result.add("${log.split(" ")[1]} 님이 들어왔습니다.")
//                "Leave" -> result.add("${log.split(" ")[1]} 님이 나갔습니다.")
//                else -> continue
//            }
//        }
//
//        //4. 반복문을 통해 result 요소의 값을 스플릿 한 후 첫 인덱스 값을 userNameAndNickname 해시맵의 키로 사용하여 value 값으로
//        //변경 한 후 나머지 부분은 동일하게 작성한다
//        for((count, log) in result.withIndex()) {
//            result[count] = "${userNameAndNickname[log.split(" ")[0]]}${log.split(" ")[1]} ${log.split(" ")[2]}"
//        }
//
//
//        return result.toTypedArray()
//    }
//}

//카카오 코딩테스트 (메뉴리뉴얼 lv2)

//arrayOf("ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"),
//intArrayOf(2,3,4)


//class Solution {
//    fun solution(orders: Array<String>, course: IntArray): Array<String> {
//        var result = mutableListOf<String>()
//
//        //orders 배열을 받아서 중복이 없는 String list 로 만들어주는 함수
//        fun changeSetChar() : MutableList<String> {
//
//            var mutableOrders = orders.joinToString("")
//            var ordersCharList = mutableOrders.split("").toMutableList()
//            for (i in 1..2) {
//                ordersCharList.remove("")
//            }
//            var totalOrdersCharList = ordersCharList.toMutableSet().toMutableList()
//            totalOrdersCharList.sort()
//            println(totalOrdersCharList)
//
//            return totalOrdersCharList
//        }
//
//
//        //totalOrdersCharList 로 만들수 있는 길이가 2인 모든 경우의 수가 포함된 리스트를 리턴함
//        fun createContainList() : MutableList<String> {
//
//            var containList = mutableListOf<String>()
//
//            var start = 1
//
//            for (i in 0 until changeSetChar().size) {
//                 for (num in start until changeSetChar().size) {
//                        containList.add(changeSetChar()[i] + changeSetChar()[num])
//                }
//                start++
//            }
//
//            /**
//             * 012 013 014 015 016 017
//             * 023 024 025 026 027
//             * 034 035 036 037
//             * 045 046 047
//             * 056 057
//             * 067
//             * 123 124 125 126 127
//             * 134 135 136 137
//             *
//             */
//
//
//
//            return containList
//        }
//
//        //order 리스트 요소에 길이가 2인 모든 경우의 수가 포함된 리스트와 비교해서 몇번 주문 되었는지를 ordersHashMap에 value값으로
//        //key 값을 경우의 수 요소로 선언한다.
//        fun createOrderHashMap()  : HashMap<String, Int>{
//            var ordersHashMap = hashMapOf<String, Int>()
//
//            for (list in createContainList()) {
//                for (order in orders) {
//                    if (order.contains(list.split("")[1]) && order.contains(list.split("")[2])) {
//                            ordersHashMap.put(list, ordersHashMap[list]?.plus(1) ?: 1)
//                    }
//                }
//            }
//
//            return ordersHashMap
//        }
//
//        //value 값이 가장큰 key 와 value 를 lastOrderHashMap 에 추가하고 정렬
//        fun createLastOrderHashMap() : HashMap<String, Int>{
//            var maxNum = createOrderHashMap().values.max()
//            var lastOrderHashMap = hashMapOf<String, Int>()
//
//            for ((key, value) in createOrderHashMap()) {
//                if (value >= maxNum) {
//                    lastOrderHashMap[key] = value
//                }
//            }
//            lastOrderHashMap.toSortedMap()
//            return lastOrderHashMap
//        }
//
//        // 주문한 메뉴가 2번 이상인지 확인 한후 result 리스트에 추가 및 정렬
//        for((key, value) in createLastOrderHashMap()) {
//            if(value >= 2) {
//                result.add(key)
//            }
//        }
//        result.sort()
//
////        println(result)
//
//        return result.toTypedArray()
//    }
//
//
//}

/**
 * 1.
 * 2.
 */

//
//class Solution2 {
//    // 문자열의 조합을 만들어주는 메소드
//    fun madeCombination(total: String, part: String, made: MutableList<String>, start: Int, cnt: Int, n: Int) {
//        if (cnt == n) {
//            made.add(part)
//            return
//        }
//
//        for (i in start until total.length) {
//            madeCombination(total, part + total[i], made, i + 1, cnt + 1, n)
//        }
//    }
//
//    fun solution(orders: Array<String>, course: IntArray): Array<String> {
//        var answer: Array<String> = arrayOf<String>()
//        var madeCourses = mutableMapOf<String, Int>()
//        var made = mutableListOf<String>()
//
//        for (order in orders) {
//            var part = ""
//            // 주문을 알파벳 오름차순으로 정렬하기 위한 과정
//            var temp = order.toCharArray()
//            var sortedOrder = temp.sorted().joinToString("")
//
//            // 알파벳 오름차순으로 정렬한 주문의 조합(Combination)의 경우의 수를 탐색
//            for (i in course) {
//                var start = 0
//                var cnt = 0
//                madeCombination(sortedOrder, part, made, start, cnt, i)
//            }
//        }
//
//        // key - value 형태로 주문을 Count
//        for (element in made) {
//            if (madeCourses[element] == null) {
//                madeCourses[element] = 1
//            } else {
//                madeCourses[element] = madeCourses.getValue(element) + 1
//            }
//        }
//
//        // 메뉴 이름이 짧은 순, 주문이 많은 메뉴 순으로 오름차순으로 정렬
//        var mapToList = madeCourses.toList()
//        mapToList = mapToList.sortedWith(compareBy({ it.first.length }, { -it.second }))
//
//        // 조건에 해당할 때만 answer에 추가
//        for (i in course) {
//            var beforeOrderMaxCount = 0
//            for (j in mapToList.indices) {
//                if ((mapToList[j].first.length == i) && (mapToList[j].second >= 2)) {
//                    if (beforeOrderMaxCount < mapToList[j].second) {
//                        beforeOrderMaxCount = mapToList[j].second
//                        answer = answer.plus(mapToList[j].first)
//                    } else if (beforeOrderMaxCount == mapToList[j].second) {
//                        answer = answer.plus(mapToList[j].first)
//                    }
//                }
//            }
//        }
//
//        // 알파벳 오름차순으로 정렬
//        answer.sort()
//
//        return answer
//    }
//}















