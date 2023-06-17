package com.example.jetpack_practise_05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider


// viewModel 의 역할

// 안드로이드의 생명주기를 관리하기 쉽다
// onSaveInstanceState() 사용해서 데이터를 관리할수 있지만 적절하지 않다
// 상태가 변경될때마다 데이터를 관리해야하는데 이 관리가 편하다

// UI 컨트롤러(activity, fragment)에서 모든것을 하려고하면 복잡해서
// viewModel 을 사용하면 관리가 용이하다


class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private var countValue = 0

    // viewModel 선언
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        // viewModel 선언
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)




        val btnPlus: Button = findViewById(R.id.btn_plus)
        val btnMinus: Button = findViewById(R.id.btn_minus)
        val tvResult: TextView = findViewById(R.id.tv_result)
        tvResult.text  = viewModel.countValue.toString()

        btnPlus.setOnClickListener{

            viewModel.plus()
           tvResult.text = viewModel.countValue.toString()

//            countValue ++
//            tvResult.text = countValue.toString()

        }

        btnMinus.setOnClickListener{

            viewModel.minus()
            tvResult.text = viewModel.countValue.toString()
//            countValue --
//            tvResult.text = countValue.toString()
        }

    }


    override fun onStart() {
        super.onStart()

        Log.d(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }




}