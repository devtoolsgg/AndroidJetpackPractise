package com.example.jetpack_practise_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.jetpack_practise_13.databinding.ActivityMainBinding


// Live + DataBinding + ViewModel
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // 필수
        binding.vm = viewModel
        binding.lifecycleOwner = this


        binding.next.setOnClickListener {

            viewModel.getNextData()


        }


    }
}