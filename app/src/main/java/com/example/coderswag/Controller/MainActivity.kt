package com.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.coderswag.R
import com.example.coderswag.dataService
import com.example.coderswag.Model.category
import com.example.coderswag.databinding.ActivityMainBinding
import java.util.Locale.Category


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapter= ArrayAdapter(this,
        android.R.layout.simple_list_item_1,
           dataService.categories)
        binding.CategoryListView.adapter=adapter


        //CategoryListView.adapter=adapter

    }
}