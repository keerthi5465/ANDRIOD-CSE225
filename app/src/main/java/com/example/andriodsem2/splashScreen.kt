package com.example.andriodsem2

import android.content.Intent
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)
        android.os.Handler().postDelayed({
            val i = Intent(
                this@splashScreen,
                ratingBar::class.java
            )
            startActivity(i)
            finish()
        }
            ,3000)

    }
}

