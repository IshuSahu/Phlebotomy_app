package com.example.a14_signinsignup.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a14_signinsignup.HealthItem
import com.example.a14_signinsignup.R
import kotlinx.android.synthetic.main.item_health.view.*

class HealthItemsAdapter(private val items: List<HealthItem>) :
    RecyclerView.Adapter<HealthItemsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_health, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: HealthItem) {
            itemView.itemHeading.text = item.heading
            itemView.itemImage.setImageResource(item.imageResource)
        }
    }
}
