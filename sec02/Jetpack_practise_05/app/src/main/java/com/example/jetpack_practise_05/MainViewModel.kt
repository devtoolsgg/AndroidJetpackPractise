package com.example.jetpack_practise_05

import android.util.Log
import androidx.lifecycle.ViewModel


// viewModel에서 아래와같이 변수하나만 만들어서 사용하지는 않고
// LiveData 를 이용해서 함께쓴다
class MainViewModel: ViewModel() {

    private val TAG = "MainViewModel"

    init{

        Log.d(TAG,"init")

    }

    var countValue = 0


    fun plus(){

        countValue++
    }

    fun minus(){

        countValue--
    }

    fun getCount(): Int {

        return countValue
    }



}