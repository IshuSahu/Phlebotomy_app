package com.example.a14_signinsignup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a14_signinsignup.adapter.HealthItemsAdapter

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val topItemsRecyclerView = findViewById<RecyclerView>(R.id.topItemsRecyclerView)
        // Sample data for the items
        val items = listOf(
            HealthItem("Health Concern", R.drawable.ic_genral_test),
            HealthItem("Health Checkup", R.drawable.ic_diabates),
            HealthItem("Women's Health", R.drawable.ic_womens_health),
            HealthItem("Men's Health", R.drawable.ic_mens_health),
            HealthItem("Elderly Care", R.drawable.ic_elderly_care),
            HealthItem("Test by Organs", R.drawable.ic_gastro),
            HealthItem("Test by Organs", R.drawable.ic_bone),
            HealthItem("Test by Organs", R.drawable.ic_gynae)

        )

        // Initialize RecyclerView
        val adapter = HealthItemsAdapter(items)
        topItemsRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        topItemsRecyclerView.adapter = adapter
    }
}