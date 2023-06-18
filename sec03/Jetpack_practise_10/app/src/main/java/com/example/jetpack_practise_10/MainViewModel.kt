package com.example.jetpack_practise_10

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    
    // MutableLiveData vs LiveData

    // LiveData : 읽을수 있지만 변경불가능 (immutable)
    // MutableLiveData : 읽기 쓰기 가능


    // mutableLiveData 방식
//    var testMutableLiveData = MutableLiveData(0)
//    fun plusLiveDataValue(){
//
//        testMutableLiveData.value = testMutableLiveData.value!!.plus(1)
//
//    }


    private var _testMutableLiveData = MutableLiveData(0)
    val testLiveData: LiveData<Int> get() = _testMutableLiveData


    fun plusLiveDataValue(){

        _testMutableLiveData.value = _testMutableLiveData.value!!.plus(1)

    }

}