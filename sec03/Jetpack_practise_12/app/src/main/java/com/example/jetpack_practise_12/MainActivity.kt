package com.example.jetpack_practise_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.jetpack_practise_12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        viewModel.liveCount.observe(this,{
            // 값을 변경하는 부분을 viewmodel에서 하고싶다
            // binding.resultArea1.text = (it + it).toString()
            // binding.resultArea2.text = (it * it).toString()
        })

        // Transformations.map
        viewModel.mapLiveData.observe(this,{
            binding.resultArea1.text = it.toString()
        })

        // Transformations.switchMap
        viewModel.switchMapLiveData.observe(this,{
            binding.resultArea2.text = it.toString()
        })


        binding.btnArea.setOnClickListener {

            val count = binding.inputArea.text.toString().toInt()
            viewModel.setLiveDataValue(count)

        }





    }
}