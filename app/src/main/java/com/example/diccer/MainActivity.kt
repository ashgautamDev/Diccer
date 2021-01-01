package com.example.diccer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*


class MainActivity : AppCompatActivity() {

lateinit var diceView : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceView = findViewById(R.id.diceView)
        val rollBtn : Button = findViewById(R.id.rollBtn)

        rollBtn.setOnClickListener{
            RollADice()
        }

    }

    private fun RollADice() {
        val diceInt = Random().nextInt(6) + 1
        val diceImages = when(diceInt){
            1-> R.drawable.ic__dice1
            2-> R.drawable.ic__dice2
            3-> R.drawable.ic__dice3
            4-> R.drawable.ic__dice4
            5-> R.drawable.ic__dice5
            else -> R.drawable.ic__dice6
        }
        diceView.setImageResource(diceImages)
    }
}