package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SezioneAdminCassa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sezione_admin_cassa)

        val ContoAllaRomana = findViewById<Button>(R.id.ContoRomana)
        ContoAllaRomana.setOnClickListener{
            val Intent = Intent(this, AdminCassaSezioneConto::class.java)
            startActivity(Intent)
        }

        val ContiSeparati = findViewById<Button>(R.id.ContiSeparati)
        ContiSeparati.setOnClickListener{
            val Intent = Intent(this, AdminCassaSezioneConto::class.java)
            startActivity(Intent)
        }

        val Totale = findViewById<Button>(R.id.Totale)
        Totale.setOnClickListener{
            val Intent = Intent(this, AdminCassaSezioneConto::class.java)
            startActivity(Intent)
        }
    }
}