package com.example.andriodsem2

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class customToast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_toast)
        val btn1 = findViewById<Button>(R.id.cusbtn)
        btn1.setOnClickListener {
            //  val inflater1: LayoutInflater = layoutInflater
            //val layout = inflater1.inflate(
            //  R.layout.supportcustomtoast, null
            //)
            val layout1 = layoutInflater.inflate(R.layout.activity_custom_view,null)
            val toast = Toast(applicationContext)
            toast.setGravity(Gravity.BOTTOM, 0, 40)
            toast.duration = Toast.LENGTH_LONG
            toast.view = layout1
            toast.show()
            //}

            }
    }
}