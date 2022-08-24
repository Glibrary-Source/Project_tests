package com.example.kimpractice

fun main() {

    var c = readLine()!!.toInt()

    for(i in 1..c){

        var score = readLine()!!
        var scoreList = score.split(" ")
        var mscoreList = mutableListOf<Int>()
        var people = scoreList[0].toInt()
        var count = 0

        for (j in scoreList){
            if(j == scoreList[0]){
                continue
            }else{
                mscoreList.add(j.toInt())
            }
        }
        var sum = 0
        for(t in mscoreList){
            sum += t
        }
        var average = sum/people

        for(f in scoreList){
            if( f.toInt() > average ){
                count += 1
            }
        }
        println(String.format("%.3f%%",100.000*count/people))
    }
}
//        var result = count/people.toFloat()
//        var result2 = result*100
//        var total = (result2*1000).roundToInt()/1000f
//
//        var b = "%.3f".format(total)
//
//        println("${b}%")





































