package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeAdmin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_admin)

        val ActivityTavoli = findViewById<Button>(R.id.gestione_cassa)
        ActivityTavoli.setOnClickListener{
            val Intent = Intent(this, SezioneAdminCassa::class.java)
            startActivity(Intent)
        }
    }
}