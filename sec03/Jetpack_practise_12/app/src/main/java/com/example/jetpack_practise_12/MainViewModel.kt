package com.example.jetpack_practise_12

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    // Transformations
    // map / switchMap

    private var _mutableCount = MutableLiveData(0)
    val liveCount : LiveData<Int>
        get() = _mutableCount



    val mapLiveData = Transformations.map(liveCount){
        it + it
    }

    val switchMapLiveData = Transformations.switchMap(liveCount){
        changeValue(it)
    }


    fun setLiveDataValue(count : Int) {
        _mutableCount.value = count
    }



    fun changeValue(count: Int): MutableLiveData<Int>{

        val testLiveData = MutableLiveData(count * count)
        return testLiveData

    }

}