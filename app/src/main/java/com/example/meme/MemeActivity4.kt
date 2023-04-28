package com.example.meme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeActivity4 : AppCompatActivity() {
    lateinit var btnNext4: Button
    lateinit var btnNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        btnNext4 = findViewById(R.id.btnNext4)
        btnNext = findViewById(R.id.btnNext)
        btnNext4.setOnClickListener {
            val intent = Intent(this, MemeActivity5::class.java)
            startActivity(intent)
        }
        btnNext.setOnClickListener {
            val intent = Intent(this, MemeActivity3::class.java)
            startActivity(intent)
        }
    }
}