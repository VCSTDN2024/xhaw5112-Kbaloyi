package com.example.chefapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LandscapingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landscaping)

        val backButton = findViewById<Button>(R.id.landscapingBack)
        backButton.setOnClickListener {
            finish() // Go back to SixMonthCoursesActivity
        }
    }
}
