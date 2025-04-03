package com.example.andriodsem2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class footeru1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_footeru1)
        val btnprogress=findViewById<Button>(R.id.btnprogress)
        val btnratt=findViewById<Button>(R.id.btnratt)
        val btntool=findViewById<Button>(R.id.btntool)

        btnprogress.setOnClickListener {
            Toast.makeText(this, "You have clicked on Progress button", Toast.LENGTH_SHORT).show()
        }
        btnratt.setOnClickListener {
            Toast.makeText(this,"You have clicked on ratting bar button",Toast.LENGTH_LONG).show()
        }
        btntool.setOnClickListener {
            Toast.makeText(this,"You have clicked on Toolbar button",Toast.LENGTH_LONG).show()
            }

        }

    }
