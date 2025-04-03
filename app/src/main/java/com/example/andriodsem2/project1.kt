package com.example.andriodsem2

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class project1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_project1)
        val j = findViewById<Button>(R.id.Java)
        val k = findViewById<Button>(R.id.kotlin)
        val s = findViewById<Button>(R.id.Swift)
        j.setOnClickListener{
            loadFragment(java())

        }
        k.setOnClickListener{
            loadFragment(kotlin())

        }
        s.setOnClickListener{
            loadFragment(swift())

        }


    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, fragment)
            .commit()
    }
}