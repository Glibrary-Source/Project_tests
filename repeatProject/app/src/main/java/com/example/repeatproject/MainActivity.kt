package com.example.repeatproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.roll_button)
        button.setOnClickListener { rollDice() }
    }
    private fun rollDice() {
        val dice = Diceroller(6)
        val dice2 = Diceroller(6)
        val diceRoll = dice.diceRoller()
        val diceRoll2 = dice2.diceRoller()
        val imageView: ImageView = findViewById(R.id.dice_1)
        val imageView2: ImageView = findViewById(R.id.dice_2)
        val toast = Toast.makeText(this, "Congratulation!! Lucky number!!", Toast.LENGTH_SHORT)
        when(diceRoll) {
            1 -> imageView.setImageResource(R.drawable.dice_1)
            2 -> imageView.setImageResource(R.drawable.dice_2)
            3 -> {
                imageView.setImageResource(R.drawable.dice_3);
                toast.show()
            }
            4 -> imageView.setImageResource(R.drawable.dice_4)
            5 -> imageView.setImageResource(R.drawable.dice_5)
            6 -> imageView.setImageResource(R.drawable.dice_6)
        }
        when(diceRoll2) {
            1 -> imageView2.setImageResource(R.drawable.dice_1)
            2 -> imageView2.setImageResource(R.drawable.dice_2)
            3 -> imageView2.setImageResource(R.drawable.dice_3)
            4 -> imageView2.setImageResource(R.drawable.dice_4)
            5 -> imageView2.setImageResource(R.drawable.dice_5)
            6 -> imageView2.setImageResource(R.drawable.dice_6)
        }
    }
}


class Diceroller(private val size: Int) {
    fun diceRoller(): Int {
        return (1..size).random()
    }
}

