package com.example.linetest

fun main() {


    Solution().solution(6, intArrayOf(6, 1, 4 ,2 ,5, 1, 3, 3, 1, 6, 5), intArrayOf(3, 2, 5,3,4,2,4,2,3,2,2))
//    Solution().solution(10, intArrayOf(3, 2, 10, 2, 8, 3, 9, 6, 1, 2), intArrayOf(3,2,2,5,4,1,2,1,3,3))




}



class Solution {
    fun solution(n: Int, student: IntArray, point: IntArray): Int {
        var answer: Int = 0
        var studentPointHash = mutableMapOf<Int, Int>()
        var count = 0

        for(size in 1..n) {
            studentPointHash[size] = 0
        }

        var teamRank = mutableListOf<Int>()
        for(num in 1..n) {
            teamRank.add(num)
        }

        for((index, score) in point.withIndex()) {
            studentPointHash[student[index]] = studentPointHash[student[index]]!!.plus(score)
            studentPointHash = studentPointHash.toList().sortedByDescending { it.second }.toMap().toMutableMap()

            println(studentPointHash)

            var bestTeam = mutableListOf<Int>()

            for((key, value) in studentPointHash) {
                bestTeam.add(key)
            }
            println(bestTeam)
            println(teamRank)


            if(teamRank == bestTeam) {
                continue
            } else {
                count ++
                teamRank = bestTeam
            }
            println(count)
        }

        var mStudentList = studentPointHash.toList().toMutableList()
        for((index, list) in mStudentList.withIndex()) {

        }


        return answer
    }
}





//class Solution {
//    fun solution(line: String): String {
//        var lineList = line.split("")
//        var mLineList = mutableListOf<String>()
//
//        for(i in lineList) {
//            mLineList.add(i)
//        }
//
//        var setLineList = mLineList.distinct()
//        var resultList = mutableListOf<String>()
//
//        for(string in setLineList) {
//            if(mLineList.count {it == string} > 1 ) {
//                resultList.add("${string}*")
//            } else {
//                resultList.add("${string}")
//            }
//        }
//        resultList.removeAt(0)
//
//        val result = resultList.joinToString("")
//
//        return result
//    }
//}



//class Solution {
//    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
//        var answer = intArrayOf()
//        var q: Queue<Int> = LinkedList()
//
//        var day = 0
//        var percentage = 0
//
//        for((index, num) in progresses.withIndex()) {
//            percentage = num
//            while (percentage < 100) {
//                percentage += speeds[index]
//                day++
//            }
//            q.add(day)
//            day = 0
//        }
//
//        println(q)
//
//        return answer
//    }
//}

//class Solution {
//    fun solution(s: String): Boolean {
//
//        try {
//            if(s.length == 4 || s.length == 6) {
//                s.toInt()
//                return true
//            } else {
//                return false
//            }
//        } catch(e: NumberFormatException) {
//            return false
//        }
//    }
//}

//class Solution {
//    fun solution(left: Int, right: Int): Int {
//        var count = 0
//        var sum = 0
//
//        for(num in left..right) {
//
//            for(i in 1..num) {
//                if(num % i == 0) {
//                    count ++
//                }
//            }
//
//            if(count % 2 == 0) {
//                sum += num
//            } else {
//                sum -= num
//            }
//            count = 0
//        }
//        return sum
//    }
//}


//class Solution {
//    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
//        var privaciesDateEP = hashMapOf<String, MutableList<String>>()
//
//        for(date in privacies) {
//            if(privaciesDateEP[date.split(" ")[1]] == null ) {
//                privaciesDateEP.put(date.split(" ")[1], mutableListOf(date.split(" ")[0]) )
//            } else {
//                privaciesDateEP[date.split(" ")[1]].let {
//                    it!!.addAll(mutableListOf(date.split(" ")[0]))
//                }
//            }
//        }
//
//        var termsMap = hashMapOf<String, Int>()
//
//        for(term in terms) {
//            termsMap[term.split(" ")[0]] = term.split(" ")[1].toInt()
//        }
//
//        var expireDateList = mutableListOf<Int>()
//        for ((key, value) in privaciesDateEP) {
//            for(date in value) {
//                if(date.split(".")[1].toInt() + termsMap[key]!! > 12){
//                    var count = 0
//                    var num = date.split(".")[1].toInt() + termsMap[key]!!
//                    while(num > 12) {
//                        num -= 12
//                        count++
//                    }
//                    if(num < 10) {
//                        expireDateList.add(
//                            ("${date.split(".")[0].toInt()+count}0${num}${date.split(".")[2]}").toInt()
//                        )
//                    }else {
//                        expireDateList.add(
//                            ("${date.split(".")[0].toInt()+count}${num}${date.split(".")[2]}").toInt()
//                        )
//                    }
//                }
//                else {
//                    if(date.split(".")[1].toInt() + termsMap[key]!! < 10){
//                        expireDateList.add(
//                            ("${date.split(".")[0]}0${date.split(".")[1].toInt() + termsMap[key]!!}${
//                                date.split(".")[2]
//                            }").toInt()
//                        )
//                    }
//                    if(date.split(".")[1].toInt() + termsMap[key]!! >= 10){
//                        expireDateList.add(
//                            ("${date.split(".")[0]}${date.split(".")[1].toInt() + termsMap[key]!!}${
//                                date.split(".")[2]
//                            }").toInt()
//                        )
//                    }
//                }
//            }
//        }
//
//
//        var reToday = today.split(".").joinToString("").toInt()
//        var result = mutableListOf<Int>()
//        var sortExpireList = mutableListOf<Int>()
//        var rankList = mutableListOf<String>()
//        var sortedExpireDataMap = hashMapOf<String, MutableList<Int>>()
//
//        for((key, value) in privaciesDateEP) {
//            if(sortedExpireDataMap[key] == null ) {
//                sortedExpireDataMap[key] = mutableListOf(expireDateList[0])
//                expireDateList.removeFirst()
//            }
//            for(num in 0 until value.size-1) {
//                sortedExpireDataMap[key].let{it!!.addAll(mutableListOf(expireDateList[0]))}
//                expireDateList.removeFirst()
//            }
//        }
//
//
//        for (list in privacies) {
//            rankList.add(list.split(" ")[1])
//        }
//
//        for(key in rankList) {
//            sortExpireList.add(sortedExpireDataMap[key]!![0])
//            sortedExpireDataMap[key]!!.removeFirst()
//        }
//        println(sortExpireList)
//
//        for((index, day) in sortExpireList.withIndex()) {
//            if(day <= reToday) {
//                result.add(index + 1)
//            }
//        }
//
//        return result.toIntArray()
//    }
//}


//class Solution {
//    fun solution(cap: Int, n: Int, deliveries: IntArray, pickups: IntArray): Long {
//        var answer: Long = -1
//
//        Solution().solution(
//            4,
//            5,
//            intArrayOf(1, 0, 3, 1, 2),
//            intArrayOf(0, 3, 0, 4, 0))
//
//
//        return answer
//    }
//}
//
//class Solution {
//    fun solution(users: Array<IntArray>, emoticons: IntArray): IntArray {
//        var answer: IntArray = intArrayOf()
//
//        var totalSell = 0
//
//
//
//
//        return answer
//    }
//}
//
//
//
















