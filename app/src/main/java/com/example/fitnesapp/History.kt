package com.example.fitnesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class History : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
    }
    fun backk(view: View) {
        val but: Button = findViewById(R.id.button6)
        when (but?.id) {
            R.id.button6 -> finish()
        }
    }
}