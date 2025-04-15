package com.example.andriodsem2

import android.os.Bundle
import android.Manifest
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException

class extrnalStroage : AppCompatActivity() {
    lateinit var uname: EditText
    lateinit var password: EditText
    lateinit var saveBtn: Button
    lateinit var fstream: FileOutputStream
    private val filename = "SampleFile.txt"
    private val filepath = "MyFileStorage"
    lateinit var myExternalFile: File
    var nPermissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_extrnal_stroage)
        uname = findViewById(R.id.txtName)
        password = findViewById(R.id.txtPas)
        saveBtn = findViewById(R.id.btnSave)
        saveBtn.setOnClickListener {
            val username = """
                ${uname.text}

                """.trimIndent()
            val password = """ ${this.password.text} 
                """.trimIndent()

            try {
                if (username.isEmpty() || password.isEmpty())
                    Toast.makeText(this, "either of field is empty", Toast.LENGTH_SHORT).show()
                else {
                    myExternalFile = File(getExternalFilesDir(filepath), filename)
                    fstream= FileOutputStream(myExternalFile)
                    fstream.write((username + password).toByteArray())
                    fstream.close()
                    Toast.makeText(applicationContext, "Details saved successfully" + myExternalFile.getAbsolutePath(), Toast.LENGTH_SHORT).show()
                    intent = Intent(this, extrnalDetails::class.java)
                    startActivity(intent)
                }
            } catch (e: FileNotFoundException) {

            } catch (e: IOException) {
                e.printStackTrace()
            }
        }




    }
}