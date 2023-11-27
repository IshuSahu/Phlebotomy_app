package com.example.a14_signinsignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.childEvents

class LoginActivity : AppCompatActivity() {

    lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
         val Singin_btn = findViewById<Button>(R.id.signinBtn)

        val email_id = findViewById<EditText>(R.id.editTextEmail)
        val password = findViewById<EditText>(R.id.editTextPassword)


        Singin_btn.setOnClickListener{

            val check_email = email_id.text.toString()
            val check_pass = password.text.toString()

            if(check_email.isNotEmpty() || check_pass.isNotEmpty()){
                ReadData(check_email, check_pass)
            }else{
                Toast.makeText(this, "Please Enter valid user name and password!", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun ReadData(checkEmail: String, checkPass: String) {
        database = FirebaseDatabase.getInstance().getReference("Users")
        database.child(checkEmail).get().addOnSuccessListener {
            if(it.exists()){
                Toast.makeText(this, "Sign in Sucessed!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "User does not Exits please Register yourself!", Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
            Toast.makeText(this, "Failed!", Toast.LENGTH_SHORT).show()
        }
    }


}