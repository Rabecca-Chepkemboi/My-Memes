package com.example.meme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeActivity3 : AppCompatActivity() {
    lateinit var btnNext3: Button
    lateinit var btnNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        btnNext3 = findViewById(R.id.btnNext3)
        btnNext = findViewById(R.id.btnNext)
        btnNext3.setOnClickListener {
            val intent = Intent(this, MemeActivity4::class.java)
            startActivity(intent)
        }
        btnNext.setOnClickListener {
            val intent = Intent(this, MemeActivity2::class.java)
            startActivity(intent)
        }
        }

    }
