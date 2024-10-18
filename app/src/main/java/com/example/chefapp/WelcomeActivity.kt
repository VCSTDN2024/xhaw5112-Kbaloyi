package com.example.chefapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btn6Week = findViewById<Button>(R.id.btn_6week)
        val btn6Month = findViewById<Button>(R.id.btn_6month)
        val btnYourDetails = findViewById<Button>(R.id.btn_your_details)
        val btnBack = findViewById<Button>(R.id.btn_back)

        btn6Week.setOnClickListener {
            val intent = Intent(this, WeekCoursesActivity::class.java)
            startActivity(intent)
        }

        btn6Month.setOnClickListener {
            val intent = Intent(this, SixMonthCoursesActivity::class.java)
            startActivity(intent)
        }

        btnYourDetails.setOnClickListener {
            val intent = Intent(this, YourDetailsActivity::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            finish() // Logic to go back, if needed
        }
    }
}
