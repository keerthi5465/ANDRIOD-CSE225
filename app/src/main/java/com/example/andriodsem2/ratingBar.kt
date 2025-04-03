package com.example.andriodsem2

import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ratingBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rating_bar)
        //Declaring 2 variables
        val rattingbar = findViewById<RatingBar>(R.id.rattingbar)
        val text2=findViewById<TextView>(R.id.text1)
        rattingbar.setOnRatingBarChangeListener { _, rating, _ ->
            text2.text="Your rating : $rating"
            }
    }
}