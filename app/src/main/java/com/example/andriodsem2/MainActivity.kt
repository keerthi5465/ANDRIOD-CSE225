package com.example.unit5

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.andriodsem2.R

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences1: SharedPreferences
    lateinit var name: TextView
    lateinit var email: TextView
    val mypreference = "mypref"
    var Email = "nameKey"
    var Passwords = "emailKey"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Email = findViewById(R.id.Email)
        Passwords = findViewById(R.id.password)
        sharedPreferences1 = getSharedPreferences(mypreference, Context.MODE_PRIVATE)
        name.text = sharedPreferences1.getString(Email, "")
        email.text = sharedPreferences1.getString(Passwords, "")

        fun save(view: view?){
            val E = Email.text.toString()
            val p = Passwords.text.toString()

            val editor = sharedPreferences1.edit()

            editor.putString(Email,E)
            editor.putString(Passwords,p)
            editor.apply()
        }
        fun clear(view: view?){
            name.text = ""
            email.text = ""
            val editor = sharedPreferences1.edit()
            editor.clear()
            editor.apply()
        }

    }
}

