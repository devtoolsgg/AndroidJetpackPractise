package com.example.jetpack_practise_10

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    
    // MutableLiveData vs LiveData

    var testMutableLiveData = MutableLiveData(0)



    fun plusLiveDataValue(){

        testMutableLiveData.value = testMutableLiveData.value!!.plus(1)

    }




}