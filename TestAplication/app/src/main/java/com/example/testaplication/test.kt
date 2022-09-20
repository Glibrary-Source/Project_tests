package com.example.testaplication

fun main() {

    Solution().solution(
        intArrayOf(180, 5000, 10, 600),
        arrayOf(
            "05:34 5961 IN",
            "06:00 0000 IN",
            "06:34 0000 OUT",
            "07:59 5961 OUT",
            "07:59 0148 IN",
            "18:59 0000 IN",
            "19:09 0148 OUT",
            "22:59 5961 IN",
            "23:00 5961 OUT"))


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



class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

//        Solution().solution(
//            intArrayOf(180, 5000, 10, 600),
//            arrayOf(
//                "05:34 5961 IN",
//                "06:00 0000 IN",
//                "06:34 0000 OUT",
//                "07:59 5961 OUT",
//                "07:59 0148 IN",
//                "18:59 0000 IN",
//                "19:09 0148 OUT",
//                "22:59 5961 IN",
//                "23:00 5961 OUT"))

        val expirationTime = "23:59"

//        var car0000FirstCheckInTime = records[1].split(" ")[0]
//        var car0000FirstCheckOutTime = records[2].split(" ")[0]
//        var car0000SecondCheckInTime = records[5].split(" ")[0]

        var carList = mutableListOf<String>()

        for(num in records) {
            carList.add(num.split(" ")[1])
        }

        carList = carList.distinct().toMutableList()

        var carRecord = hashMapOf<String, String>()

        for (num in carList) {
            for(record in records) {
                if(record.split(" ")[1] == num) {
                    if(carRecord[num] == null) {
                        carRecord[record.split(" ")[1]] = "${record.split(" ")[0]} ${record.split(" ")[2]}"
                    } else {
                        carRecord[record.split(" ")[1]] = "${carRecord[num]}/" + "${record.split(" ")[0]} ${record.split(" ")[2]}"
                    }
                }
            }
        }


        for(num in carList) {
            
        }





//        var car5961FirstCheckInTime = records[0].split(" ")[0]
//        var car5961FirstCheckOutTime = records[3].split(" ")[0]
//        var car5961SecondCheckInTime = records[7].split(" ")[0]
//        var car5961SecondCheckOutTime = records[8].split(" ")[0]
//
//        var car0000FeeTime =
//            (car0000FirstCheckOutTime.split(":")[0].toInt() - car0000FirstCheckInTime.split(":")[0].toInt()) * 60 + (car0000FirstCheckOutTime.split(":")[1].toInt() - car0000FirstCheckInTime.split(":")[1].toInt())+ (expirationTime.split(":")[0].toInt() - car0000SecondCheckInTime.split(":")[0].toInt()) * 60+(expirationTime.split(":")[1].toInt() - car0000SecondCheckInTime.split(":")[1].toInt())
//
//        var car0000Fee =
//            fees[1] + ceil(car0000FeeTime.toDouble() - fees[0].toDouble() /fees[2]).toInt() * fees[3]
//
//        var car5961FeeTime =
//            (car5961FirstCheckOutTime.split(":")[0].toInt() - car5961FirstCheckInTime.split(":")[0].toInt()) * 60 + (car5961FirstCheckOutTime.split(":")[1].toInt() - car5961FirstCheckInTime.split(":")[1].toInt())+ (car5961SecondCheckOutTime.split(":")[0].toInt() - car5961SecondCheckInTime.split(":")[0].toInt()) * 60 + (car5961SecondCheckOutTime.split(":")[1].toInt() - car5961SecondCheckInTime.split(":")[1].toInt())
//
//        var car5961Fee =
//            if(car5961FeeTime <= fees[0]) {
//                5000
//            } else {
//                fees[1] + ceil(car5961FeeTime.toDouble() - fees[0].toDouble() / fees[2]).toInt() * fees[3]
//            }



        return answer
    }
}


/**
 * 1.
 *
 *
 *
 */

























