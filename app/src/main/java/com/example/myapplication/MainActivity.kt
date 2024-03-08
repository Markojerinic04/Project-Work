package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.client.HttpClient
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.client.methods.HttpPost
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.entity.StringEntity
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.impl.client.HttpClients

import java.sql.Connection
import java.sql.DriverManager



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val HomePageAdmin = findViewById<Button>(R.id.second_activity_btn)
        HomePageAdmin.setOnClickListener{
            val Intent = Intent(this, HomeAdmin::class.java)
            startActivity(Intent)
        }

        var username = findViewById<EditText>(R.id.usernameEditText)
        var pw = findViewById<EditText>(R.id.passwordEditText)

        val httpClient: HttpClient = HttpClients.createDefault()

        val postUrl = "http://localhost:8080/login"
        val httpPost = HttpPost(postUrl)

        httpPost.setHeader("Content-type", "application/json")

        val request = "{\"username\":\"admin\", \"password\":admin}"
        val entity = StringEntity(request)
        httpPost.entity = entity
    }
}
