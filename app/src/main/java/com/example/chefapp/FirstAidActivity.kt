package com.example.chefapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.chefapp.R.id.firstAidBack

class FirstAidActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)

        val backButton = findViewById<Button>(firstAidBack)
        backButton.setOnClickListener {
            finish() // Go back to SixMonthCoursesActivity
        }
    }
}
