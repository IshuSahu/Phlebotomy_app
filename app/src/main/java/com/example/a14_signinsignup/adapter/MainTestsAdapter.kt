package com.example.a14_signinsignup.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import androidx.recyclerview.widget.RecyclerView
import com.example.a14_signinsignup.R
import com.example.a14_signinsignup.entity.CategoryItems

class MainTestsAdapter : RecyclerView.Adapter<MainTestsAdapter.RecipeViewHolder>() {

    var listener: OnItemClickListener? = null
    var ctx: Context? = null
    var arrMainCategory = ArrayList<CategoryItems>()

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var textViewTitle: TextView
        lateinit var textViewimg: ImageView
    }

    fun setData(arrData: List<CategoryItems>) {
        arrMainCategory = arrData as ArrayList<CategoryItems>
    }

    fun setClickListener(listener1: OnItemClickListener) {
        listener = listener1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        ctx = parent.context
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_test_category, parent, false)
        val holder = RecipeViewHolder(v)
        holder.textViewTitle = v.findViewById(R.id.tv_test_name)
        holder.textViewimg = v.findViewById(R.id.img_test)
        return holder
    }

    override fun getItemCount(): Int {
        return arrMainCategory.size
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.textViewTitle.text = arrMainCategory[position].testName
        Glide.with(ctx!!).load(arrMainCategory[position].testName).into(holder.textViewimg)
    }

    interface OnItemClickListener {
        fun onClicked(categoryName: String)
    }
}
