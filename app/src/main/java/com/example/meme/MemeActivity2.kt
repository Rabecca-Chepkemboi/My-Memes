package com.example.meme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeActivity2 : AppCompatActivity() {
    lateinit var btnNext2: Button
    lateinit var btnPrevious: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        btnNext2 = findViewById(R.id.btnNext2)
        btnPrevious = findViewById(R.id.btnNext)
        btnNext2.setOnClickListener {
            val intent = Intent(this, MemeActivity3::class.java)
            startActivity(intent)
        }
        btnPrevious.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        }
    }
