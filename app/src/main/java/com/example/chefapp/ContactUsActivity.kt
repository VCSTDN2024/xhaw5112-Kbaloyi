package com.example.chefapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ContactUsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)

        val btnExit = findViewById<Button>(R.id.btnExit)

        btnExit.setOnClickListener {
            finishAffinity() // Exit the app
        }
    }
}
