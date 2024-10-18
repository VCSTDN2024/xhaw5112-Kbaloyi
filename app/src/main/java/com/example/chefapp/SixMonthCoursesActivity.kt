package com.example.chefapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SixMonthCoursesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_month_courses)

        val sewingButton = findViewById<Button>(R.id.sewing_button)
        sewingButton.setOnClickListener {
            val intent = Intent(this, SewingActivity::class.java)
            startActivity(intent)
        }

        val landscapingButton = findViewById<Button>(R.id.landscaping_button)
        landscapingButton.setOnClickListener {
            val intent = Intent(this, LandscapingActivity::class.java)
            startActivity(intent)
        }

        val lifeSkillsButton = findViewById<Button>(R.id.life_skills_button)
        lifeSkillsButton.setOnClickListener {
            val intent = Intent(this, LifeSkillsActivity::class.java)
            startActivity(intent)
        }

        val firstAidButton = findViewById<Button>(R.id.first_aid_button)
        firstAidButton.setOnClickListener {
            val intent = Intent(this, FirstAidActivity::class.java)
            startActivity(intent)
        }

        val backButton = findViewById<Button>(R.id.back_button)
        backButton.setOnClickListener {
            finish() // This will take you back to the Welcome screen
        }
    }
}
