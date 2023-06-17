package com.example.jetpack_practise_06

import androidx.lifecycle.ViewModel

class TestFragmentViewModel: ViewModel() {

    private val TAG = "TestFragmentViewModel"


    var countValue = 0


    fun plus(){

        countValue++

    }


    fun minus(){

        countValue--

    }

    fun getCount(): Int{


        return countValue
    }




}