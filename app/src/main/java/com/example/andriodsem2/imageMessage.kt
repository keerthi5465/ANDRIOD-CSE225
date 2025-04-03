package com.example.andriodsem2

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class imageMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_image_message)
        val imagemsg = findViewById<Button>(R.id.imagemsg)
        imagemsg.setOnClickListener {
            val layout1= layoutInflater.inflate(R.layout.sourceimage,null)
            val toast = Toast(applicationContext)
            toast.setGravity(Gravity.BOTTOM,0,20)
            toast.duration = Toast.LENGTH_LONG
            toast.view=layout1
            toast.show()
            }

    }
}