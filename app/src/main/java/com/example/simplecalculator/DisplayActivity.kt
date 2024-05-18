package com.example.simplecalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display) // Assuming this is your layout file

        var txtAnswer = findViewById<TextView>(R.id.textAnswer)
        txtAnswer.setText(intent.getDoubleExtra("answer", 0.0).toString())
        var btnBack = findViewById<Button>(R.id.buttonReset)
        btnBack.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}