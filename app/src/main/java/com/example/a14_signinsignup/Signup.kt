package com.example.a14_signinsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class Signup : AppCompatActivity() {

    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        supportActionBar?.hide()

        val signupBtn = findViewById<Button>(R.id.button2)
        val inputName = findViewById<EditText>(R.id.editTextName)
        val inputEmail = findViewById<EditText>(R.id.editTextEmail)
        val inputNumber = findViewById<EditText>(R.id.editTextMobile)
        val inputPass = findViewById<EditText>(R.id.editTextPassword)

        signupBtn.setOnClickListener{
            val name = inputName.text.toString()
            val email= inputEmail.text.toString()
            val number = inputNumber.text.toString()
            val password= inputPass.text.toString()

            val user = Users(name,email,number, password)
            database = FirebaseDatabase.getInstance().getReference("Users")

            database.child(email).setValue(user)
                .addOnSuccessListener {
                    Toast.makeText(this, "User registered!", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                }
                .addOnFailureListener {
                    Toast.makeText(this, "Failed!", Toast.LENGTH_SHORT).show()
                }
        }
    }

    fun onLoginClick(view: View) {}
}