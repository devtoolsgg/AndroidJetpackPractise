package com.example.jetpack_practise_08

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(num: Int): ViewModel() {


        private val TAG = "MainViewModel"


    // Repository
    // 네트워크 통신, 로컬DB에서 데이터 받아와 뷰모델로 넘기고싶을때..?

    init {
        Log.d(TAG,num.toString())
    }



}