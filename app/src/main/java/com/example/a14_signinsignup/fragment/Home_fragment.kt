package com.example.a14_signinsignup.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a14_signinsignup.R
import com.example.a14_signinsignup.adapter.MainTestsAdapter
import com.example.a14_signinsignup.adapter.SubProductAdapter
import com.example.a14_signinsignup.entity.CategoryItems
import com.example.a14_signinsignup.databinding.FragmentHomeFragmentBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
class Home_fragment : Fragment() {
    private lateinit var binding: FragmentHomeFragmentBinding

    private val arrMainCategory = ArrayList<CategoryItems>()
    private val arrSubCategory = ArrayList<CategoryItems>()

    private val mainCategoryAdapter = MainTestsAdapter()
    private val subCategoryAdapter = SubProductAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bottomNav = view.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val topTestRecyclerView = view.findViewById<RecyclerView>(R.id.packageRecyclerView)
        val topProductRecyclerView = view.findViewById<RecyclerView>(R.id.TopProductRV)

        arrMainCategory.add(CategoryItems(1, "General Checkup"))
        arrMainCategory.add(CategoryItems(2, "Cardiac Health"))
        arrMainCategory.add(CategoryItems(3, "Diabetes Monitoring"))
        arrMainCategory.add(CategoryItems(4, "Men's Health"))
        arrMainCategory.add(CategoryItems(5, "Women's Health"))
        arrMainCategory.add(CategoryItems(6, "Senior Citizen Health"))

        mainCategoryAdapter.setData(arrMainCategory)

        arrSubCategory.add(CategoryItems(1, "Vitamins & supplements"))
        arrSubCategory.add(CategoryItems(2, "Ayurveda Product"))
        arrSubCategory.add(CategoryItems(3, "Personal care"))
        arrSubCategory.add(CategoryItems(4, "Diet & nutrition"))
        arrSubCategory.add(CategoryItems(5, "Homeopathy"))
        arrSubCategory.add(CategoryItems(6, "Diabetes"))

        subCategoryAdapter.setData(arrSubCategory)

        topTestRecyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        topTestRecyclerView.adapter = mainCategoryAdapter

        topProductRecyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        topProductRecyclerView.adapter = subCategoryAdapter
    }
}
