package com.example.andriodsem2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class textMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_text_message)
        val prog = findViewById<Button>(R.id.prog)
        prog.setOnClickListener {
            Toast.makeText(this,"You have clicked on Progress Bar button",Toast.LENGTH_LONG).show()
        }
        val rat = findViewById<Button>(R.id.rat)
        rat.setOnClickListener {
            Toast.makeText(this,"You have clicked on Rating bar button",Toast.LENGTH_SHORT).show()
        }
        val tol = findViewById<Button>(R.id.tol)
        tol.setOnClickListener {
            Toast.makeText(this,"You have clicked on Toolbar button",Toast.LENGTH_LONG).show()

            }
        }


}
