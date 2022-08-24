package com.example.kimpractice

fun main() {

    var numbers = mutableListOf<Int>()

    var check = mutableListOf<Int>()

    for (i in 1..10) {
        numbers.add(readLine()!!.toInt() % 42)
    }

    for (j in numbers) {
        if (check.contains(j)) {
            continue
        } else {
            check.add(j)
        }
    }
    println(check.size)
}

//    var number = numbers.distinct()
//
//    println(number)


//
//
//    for(i in numbers){
//        if(check)
//    }































































