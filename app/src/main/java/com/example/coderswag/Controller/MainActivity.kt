package com.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.coderswag.Adapters.CategoryAdapter
import com.example.coderswag.R
import com.example.coderswag.dataService
import com.example.coderswag.Model.category
import com.example.coderswag.databinding.ActivityMainBinding
import java.util.Locale.Category


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter = CategoryAdapter(
            this,
            dataService.categories
        )
        binding.categoryListView.adapter = adapter
//        binding.categoryListView.setOnItemClickListener({ adapterView, view, i, l ->
//            val category = dataService.categories[i]
//            Toast.makeText(this, "You clicked on the ${category.title} cell", Toast.LENGTH_SHORT)
//                .show()


       // })


    }
}
