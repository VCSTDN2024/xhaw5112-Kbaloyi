package com.example.chefapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LifeSkillsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_skills)

        val backButton = findViewById<Button>(R.id.lifeSkillsBack)
        backButton.setOnClickListener {
            finish() // Go back to SixMonthCoursesActivity
        }
    }
}
