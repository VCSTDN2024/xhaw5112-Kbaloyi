package com.example.chefapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class YourDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_details)

        val btnContactUs = findViewById<Button>(R.id.btnContactUs)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnContactUs.setOnClickListener {
            val intent = Intent(this, ContactUsActivity::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            finish() // Go back to the Welcome screen
        }
    }
}
