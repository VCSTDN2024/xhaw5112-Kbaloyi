package com.example.chefapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ChildmindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_childminding)

        val btnBack = findViewById<Button>(R.id.btn_back)

        btnBack.setOnClickListener {
            val intent = Intent(this, WeekCoursesActivity::class.java)
            startActivity(intent) // Navigate back to the 6 Week Courses screen
            finish() // Optional: Close this activity
        }
    }
}
