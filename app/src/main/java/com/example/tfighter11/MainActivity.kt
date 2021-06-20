package com.example.tfighter11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playButton = findViewById<Button>(R.id.playB)
        val eName = findViewById<TextView>(R.id.enterName)

        playButton.setOnClickListener {

            val Name = eName.text.toString()

            val i = Intent(this,GameView::class.java)
            i.putExtra(GameView.name,Name)
            startActivity(i)

        }
    }
}