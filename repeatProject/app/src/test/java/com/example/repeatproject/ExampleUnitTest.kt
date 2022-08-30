package com.example.repeatproject

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun generates_number() {
        val dice = Diceroller(6)
        val rollResult = dice.diceRoller()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)
    }

}