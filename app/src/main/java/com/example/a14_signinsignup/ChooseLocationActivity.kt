package com.example.a14_signinsignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.a14_signinsignup.databinding.ActivityChooseLocationBinding

class ChooseLocationActivity : AppCompatActivity() {
    private val binding: ActivityChooseLocationBinding by lazy {
        ActivityChooseLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val listLocation = arrayOf("Nagpur", "Pune","Delhi", "Mumbai",)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,listLocation)

        val autocompleteTextView = binding.locationList
        autocompleteTextView.setAdapter(adapter)
    }
}