package com.example.jetpack_practise_08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var viewModelFactory: MainViewModelFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        viewModelFactory = MainViewModelFactory(5000)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)


    }
}