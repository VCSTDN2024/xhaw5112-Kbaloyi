package com.example.chefapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WeekCoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_week_courses)

        // Find buttons
        val btnChildminding = findViewById<Button>(R.id.btn_childminding)
        val btnGarden = findViewById<Button>(R.id.btn_garden)
        val btnCooking = findViewById<Button>(R.id.btn_cooking)
        val btnBack = findViewById<Button>(R.id.btn_back)

        // Set click listeners for buttons
        btnChildminding.setOnClickListener {
            val intent = Intent(this, ChildmindingActivity::class.java)
            startActivity(intent)
        }

        btnGarden.setOnClickListener {
            val intent = Intent(this, GardenMaintenanceActivity::class.java)
            startActivity(intent)
        }

        btnCooking.setOnClickListener {
            val intent = Intent(this, CookingActivity::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            onBackPressed() // Handle back navigation
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, WelcomeActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) // Clear the activity stack
        startActivity(intent)
        finish() // Finish the current activity
    }
}
