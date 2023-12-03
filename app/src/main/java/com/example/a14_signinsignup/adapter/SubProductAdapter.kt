package com.example.a14_signinsignup.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a14_signinsignup.R
import com.example.a14_signinsignup.entity.CategoryItems

class SubProductAdapter : RecyclerView.Adapter<SubProductAdapter.RecipeViewHolder>() {

    var listener: OnItemClickListener? = null
    var ctx: Context? = null
    var arrSubCategory = ArrayList<CategoryItems>()

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var textViewTitle: TextView
        lateinit var textViewimg: ImageView
    }

    fun setData(arrData: List<CategoryItems>) {
        arrSubCategory = arrData as ArrayList<CategoryItems>
    }

    fun setClickListener(listener1: OnItemClickListener) {
        listener = listener1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        ctx = parent.context
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_product_catagory, parent, false)
        val holder = RecipeViewHolder(v)
        holder.textViewTitle = v.findViewById(R.id.tv_product_name)
        holder.textViewimg = v.findViewById(R.id.img_prod)
        return holder
    }

    override fun getItemCount(): Int {
        return arrSubCategory.size
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.textViewTitle.text = arrSubCategory[position].testName
        Glide.with(ctx!!).load(arrSubCategory[position].testName).into(holder.textViewimg)

    }

    interface OnItemClickListener {
        fun onClicked(categoryName: String)
    }
}
