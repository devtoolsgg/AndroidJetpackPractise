package com.example.jetpack_practise_03

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.jetpack_practise_03.databinding.ActivityMainBinding


// DataBinding
// 이름처럼 데이터를 어떻게 해줄수 없나
// 목적은 데이터의 결합


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var testCount = 30


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        // 기존방식
        // binding.test.text = "바뀐 텍스트 뷰바인딩하고 차이가 없네?"


        // 데이터의 결합

        val person = Person("gglee",30)
        binding.user = person

    }

    fun btnClick(view: View){

        Log.d("MainActivity", "hi")
        testCount++

        val person = Person("gglee",testCount)
        binding.user = person
    }

}