package com.example.fitnesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Soveti : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soveti)
    }
    fun back1(view: View) {
        val b: Button = findViewById(R.id.button)
        when (b?.id) {
            R.id.button -> finish()
        }
    }
}