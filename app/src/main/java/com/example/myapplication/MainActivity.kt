package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val HomePageAdmin = findViewById<Button>(R.id.second_activity_btn)
        HomePageAdmin.setOnClickListener{
            val Intent = Intent(this, HomeAdmin::class.java)
            startActivity(Intent)
        }
    }
}