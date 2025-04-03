package com.example.andriodsem2

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class dynamicFragments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var isFragement = true
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dynamic_fragments)
        val btn = findViewById<Button>(R.id.dynamic)
        btn.setOnClickListener{
            if(isFragement){
                loadFragment(frag2())
            }else{
                loadFragment(frag1())
            }
            isFragement = !isFragement
        }


    }

    private fun loadFragment(fragment: Fragment) {
        val fragManager : androidx.fragment.app.FragmentManager = supportFragmentManager
            // Begin the fragment Transaction
        val change : androidx.fragment.app.FragmentTransaction = fragManager.beginTransaction()
            // Replace the fragement in the container
        change.replace(R.id.frag, fragment)
        change.commit()


    }
}