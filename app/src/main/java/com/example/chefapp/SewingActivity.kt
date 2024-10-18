package com.example.chefapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SewingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewing)

        val backButton = findViewById<Button>(R.id.sewingBack)
        backButton.setOnClickListener {
            finish() // Go back to SixMonthCoursesActivity
        }
    }
}
