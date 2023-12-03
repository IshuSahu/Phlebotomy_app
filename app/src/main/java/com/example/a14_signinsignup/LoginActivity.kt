package com.example.a14_signinsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class LoginActivity : AppCompatActivity() {

    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
         val Singin_btn = findViewById<Button>(R.id.signinBtn)
        val user_id = findViewById<EditText>(R.id.editTextname)
        val password = findViewById<EditText>(R.id.editTextPassword)
        val rgPage = findViewById<TextView>(R.id.gotoRegister)
        rgPage.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        Singin_btn.setOnClickListener{

            val check_name = user_id.text.toString()
            val check_pass = password.text.toString()

            if(check_name.isNotEmpty() || check_pass.isNotEmpty()){
//                ReadData(check_name, check_pass)
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Please Enter valid user name and password!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun ReadData(checkName: String, checkPass: String) {
        database = FirebaseDatabase.getInstance().getReference("Users")
        database.child(checkName).get().addOnSuccessListener {
            if(it.exists()){
                Toast.makeText(this, "Sign in Sucessed!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "User does not Exits please Register yourself!", Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {
            Toast.makeText(this, "Failed!", Toast.LENGTH_SHORT).show()
        }
    }

}