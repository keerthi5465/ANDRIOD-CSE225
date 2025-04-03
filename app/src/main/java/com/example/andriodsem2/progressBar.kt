package com.example.andriodsem2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class progressBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_progress_bar)
        val progress=findViewById<ProgressBar>(R.id.progress)
        val btn1=findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            progress.visibility= View.VISIBLE
            btn1.isEnabled=false
            }

    }
}