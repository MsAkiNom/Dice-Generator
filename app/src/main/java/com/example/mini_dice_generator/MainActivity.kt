package com.example.mini_dice_generator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun rollDice (v: View)
    {
        val counterArr = arrayOf(1, 0, 0, 0, 0, 0, 0)

        for (i in 1..1_000_000)
        {
            counterArr[Random.nextInt(1, 7)]++

//            val newDice = Random.nextInt(1, 7)
//            counterArr[newDice]++
        }

        println("Generated numbers of dice rolls | ")
        for (i in 1 until counterArr.size)
        {
            println("$i is ${counterArr[i]}")
        }

    }
}