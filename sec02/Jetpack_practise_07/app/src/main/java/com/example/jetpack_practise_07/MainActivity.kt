package com.example.jetpack_practise_07

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.jetpack_practise_07.databinding.ActivityMainBinding

// viewModel 의 Activity - Fragment간의 공유

// 이유 : Activity값을 Fragment에서 쓰고싶거나
// Fragment에서의 값을 viewModel의 값으로 사용하기 위해서


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        val manager = supportFragmentManager


        binding.tvMain.text = viewModel.getCount().toString()


        binding.btnPlus.setOnClickListener{

            viewModel.plus()
            binding.tvMain.text = viewModel.getCount().toString()


        }

        binding.btnMinus.setOnClickListener{

            viewModel.minus()
            binding.tvMain.text = viewModel.getCount().toString()
        }

        binding.btnNext.setOnClickListener {

            val transaction = manager.beginTransaction()
            val fragment = TestFragment()

            transaction.replace(R.id.fl_test,fragment)
            transaction.addToBackStack(null)
            transaction.commit()

        }


        //setContentView(R.layout.activity_main)
    }
}