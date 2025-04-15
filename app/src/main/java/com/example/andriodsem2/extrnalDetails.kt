package com.example.andriodsem2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.File
import java.io.FileInputStream

class extrnalDetails : AppCompatActivity() {
    lateinit var fstream: FileInputStream
    private val filename = "SampleFile.txt"
    private val filepath = "MyFileStorage"
    lateinit var myExternalField:File
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_extrnal_details)
        val result = findViewById<TextView>(R.id.txtRes)
        val back = findViewById<Button>(R.id.btnback)
        try{
            var myExternalFile = File(getExternalFilesDir(filepath), filename)
            fstream = FileInputStream(myExternalFile)
            val sbuffer = StringBuffer()
            var char = fstream.read()
            while (char != -1) {
                sbuffer.append(char.toChar())
                char = fstream.read()
            }
            result.text = sbuffer.toString()
            fstream.close()
        }
        catch (e:Exception){
            result.text = "Error reading file"
        }
    }
}