//package com.example.a14_signinsignup
//
//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.navigation.findNavController
//import androidx.navigation.ui.setupWithNavController
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.example.a14_signinsignup.R
//import com.example.a14_signinsignup.adapter.MainTestsAdapter
//import com.example.a14_signinsignup.adapter.SubProductAdapter
//import com.example.a14_signinsignup.entity.CategoryItems
//import com.google.android.material.bottomnavigation.BottomNavigationView
//
////import com.example.a14_signinsignup.adapter.HealthItemsAdapter
//
//class HomeActivity : AppCompatActivity() {
//    var arrMainCategory = ArrayList<CategoryItems>()
//    var arrSubCategory = ArrayList<CategoryItems>()
//
//    var mainCategoryAdapter = MainTestsAdapter()
//    var subCategoryAdapter = SubProductAdapter()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home)
//        var navController =  findNavController(R.id.fragmentContainerView)
//        var bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        bottomNav.setupWithNavController(navController)
//        val topTestRecyclerView = findViewById<RecyclerView>(R.id.packageRecyclerView)
//        val topProductRecyclerView = findViewById<RecyclerView>(R.id.productRecycleView)
//
//        arrMainCategory.add(CategoryItems(1,"Health Concern"))
//        arrMainCategory.add(CategoryItems(2,"Health Checkup"))
//        arrMainCategory.add(CategoryItems(3,"Women's Health"))
//        arrMainCategory.add(CategoryItems(4,"Men's Health"))
//        arrMainCategory.add(CategoryItems(5,"Elderly Care"))
//        arrMainCategory.add(CategoryItems(6,"gynae"))
//
//        mainCategoryAdapter.setData(arrMainCategory)
//        arrSubCategory.add(CategoryItems(1,"Vitamis & suppliments"))
//        arrSubCategory.add(CategoryItems(2,"Ayurveda Product"))
//        arrSubCategory.add(CategoryItems(3,"Personal care"))
//        arrSubCategory.add(CategoryItems(4,"Diet & nutrition"))
//        arrSubCategory.add(CategoryItems(5,"Homeopathy"))
//        arrSubCategory.add(CategoryItems(6,"Diabaties"))
//
//        subCategoryAdapter.setData(arrSubCategory)
//        // Sample data for the items
////        val items = listOf(
////            HealthItem("Health Concern", R.drawable.ic_genral_test),
////            HealthItem("Health Checkup", R.drawable.ic_diabates),
////            HealthItem("Women's Health", R.drawable.ic_womens_health),
////            HealthItem("Men's Health", R.drawable.ic_mens_health),
////            HealthItem("Elderly Care", R.drawable.ic_elderly_care),
////            HealthItem("Test by Organs", R.drawable.ic_gastro),
////            HealthItem("Test by Organs", R.drawable.ic_bone),
////            HealthItem("Test by Organs", R.drawable.ic_gynae)
////        )
//
////        // Initialize RecyclerView
//
//        topTestRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        topTestRecyclerView.adapter = mainCategoryAdapter
//
//        topProductRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        topProductRecyclerView.adapter = subCategoryAdapter
//
//    }
//}
