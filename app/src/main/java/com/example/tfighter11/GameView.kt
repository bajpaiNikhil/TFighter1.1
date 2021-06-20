package com.example.tfighter11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GameView : AppCompatActivity() {
    companion object{

        const val name = "Name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_view)

        val showName = findViewById<TextView>(R.id.showName)

        val nme = intent.getStringExtra(name)
        showName.text = nme

    }
}