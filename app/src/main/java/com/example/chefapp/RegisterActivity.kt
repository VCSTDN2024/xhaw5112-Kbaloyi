package com.example.chefapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Initialize views
        val etName = findViewById<EditText>(R.id.etName)
        val etSurname = findViewById<EditText>(R.id.etSurname)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnBack = findViewById<Button>(R.id.btnBack)

        // Handle Submit button click
        btnSubmit.setOnClickListener {
            val name = etName.text.toString().trim()
            val surname = etSurname.text.toString().trim()
            val phone = etPhone.text.toString().trim()
            val email = etEmail.text.toString().trim()

            if (validateInputs(name, surname, phone, email)) {
                // Perform registration or submit action
                Toast.makeText(this, "Submitted Successfully!", Toast.LENGTH_SHORT).show()

                // Navigate to Welcome Activity
                val intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
            }
        }

        // Handle Back button click
        btnBack.setOnClickListener {
            finish() // Close the current activity
        }
    }

    private fun validateInputs(name: String, surname: String, phone: String, email: String): Boolean {
        if (name.isEmpty()) {
            showToast("Please enter your name")
            return false
        }
        if (surname.isEmpty()) {
            showToast("Please enter your surname")
            return false
        }
        if (phone.isEmpty()) {
            showToast("Please enter your phone number")
            return false
        }
        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            showToast("Please enter a valid email")
            return false
        }
        return true
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
