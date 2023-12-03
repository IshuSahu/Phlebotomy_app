package com.example.a14_signinsignup.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a14_signinsignup.R
import com.example.a14_signinsignup.adapter.MenuAdapter
import com.example.a14_signinsignup.databinding.FragmentHomeFragmentBinding
//noinspection RestrictedApi
class SearchFragment : Fragment() {
    private lateinit var binding: FragmentHomeFragmentBinding
    private lateinit var adapter: MenuAdapter
    private val testMenu = listOf(
        "General Health Checkup",
        "Cardiac Health Package",
        "Diabetes Monitoring Package",
        "Women's Health Package",
        "Men's Health Package",
        "Senior Citizen Health Package",
        "Thyroid Function Package",
        "Allergy Testing Package",
        "Cancer Screening Package",
        "Gastrointestinal Health Package"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeFragmentBinding.inflate(inflater, container, false)
        adapter = MenuAdapter(testMenu)
        binding.packageRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.packageRecyclerView.adapter = adapter
        return binding.root
    }
}
