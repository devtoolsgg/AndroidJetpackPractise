package com.example.jetpack_practise_07

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var countValue = 0

    fun plus() {
        countValue++
    }

    fun minus() {
        countValue--
    }

    fun getCount() : Int {
        return countValue
    }

}