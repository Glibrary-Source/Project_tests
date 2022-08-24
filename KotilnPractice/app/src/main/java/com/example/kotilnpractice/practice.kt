package com.example.kotilnpractice

fun main() {
    val numbers = (1..10).toList()

    val sumUsingFold = numbers.fold(1) {
        total, num -> total + num
    }

}