package com.example.jetpack_practise_04.viewBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jetpack_practise_04.R
import com.example.jetpack_practise_04.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {


    private lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val array = ArrayList<String>()
        array.add("h")
        array.add("e")
        array.add("l")
        array.add("l")
        array.add("o")
        array.add("w")
        array.add("o")
        array.add("r")
        array.add("l")
        array.add("d")


        val customViewAdapter = CustomViewAdapter(array)

        val rv = binding.rcBinding

        rv.adapter = customViewAdapter
        rv.layoutManager = LinearLayoutManager(this)



    }
}