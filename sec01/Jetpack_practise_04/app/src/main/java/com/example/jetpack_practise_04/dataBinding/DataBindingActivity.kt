package com.example.jetpack_practise_04.dataBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jetpack_practise_04.R
import com.example.jetpack_practise_04.databinding.ActivityDataBindingBinding
import com.example.jetpack_practise_04.viewBinding.CustomViewAdapter

class DataBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataBindingBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding)


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


        val customDataAdpater = CustomDataAdpater(array)

        val rv = binding.rcDatabinding

        rv.adapter = customDataAdpater
        rv.layoutManager = LinearLayoutManager(this)



    }
}