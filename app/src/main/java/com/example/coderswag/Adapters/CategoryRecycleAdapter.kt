package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Adapters.CategoryRecycleAdapter.*
import com.example.coderswag.Model.category
import com.example.coderswag.R

class CategoryRecycleAdapter(val context: Context, val categories: List<category>): RecyclerView.Adapter<Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val  view=LayoutInflater.from(context).inflate(R.layout.category_list_item,parent,false)
        return Holder( view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position],context)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }
    inner  class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryImage=itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName=itemView?.findViewById<TextView>(R.id.categoryName)
        fun bindCategory(category: category,context: Context){
            val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text=category.title
        }

    }
}