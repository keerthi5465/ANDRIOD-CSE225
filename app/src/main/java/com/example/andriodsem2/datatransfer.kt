package com.example.andriodsem2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class datatransfer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_datatransfer)
        val fragManager : androidx.fragment.app.FragmentManager = supportFragmentManager
        val change : androidx.fragment.app.FragmentTransaction = fragManager.beginTransaction()
        change.replace(R.id.fragleft,datafrag1())
        change.commit()
        val fragManager1 : androidx.fragment.app.FragmentManager = supportFragmentManager
        val change1 : androidx.fragment.app.FragmentTransaction = fragManager1.beginTransaction()
        change1.replace(R.id.fragleft,datafrag2())
        change1.commit()
    }
}