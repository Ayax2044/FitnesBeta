package com.example.fitnesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Stretching : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stretching)
    }
    fun back3(view: View) {
        val but: Button = findViewById(R.id.button4)
        when (but?.id) {
            R.id.button4 -> finish()
        }
    }
}