package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AdminCassaSezioneConto : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_cassa_sezione_conto)

        val Indietro = findViewById<Button>(R.id.Indietro)
        Indietro.setOnClickListener{
            val Intent = Intent(this, SezioneAdminCassa::class.java)
            startActivity(Intent)
        }
    }
}