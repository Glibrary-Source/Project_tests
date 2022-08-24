package com.example.kimpractice

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var A = br.readLine()!!.toInt()
    var B = br.readLine()!!.toInt()
    var C = br.readLine()!!.toInt()

    var numList = ArrayList<Int>()

    if(A in 100..999 && B in 100..999 && C in 100..999){
        var sum = A*B*C
        var sumString = sum.toString()
        var sumList = sumString.split("")

        for (i in sumList){
            if(i == ""){
                continue
            }
            numList.add(i.toInt())
        }
        for (i in 0..9){
            println(numList.filter{it == i}.size)
        }
    }
}
































































