package com.example.jetpack_practise_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    // LiveData + ViewModel 의 사용

    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        findViewById<Button>(R.id.btnArea).setOnClickListener {
            viewModel.plusLiveDataValue()
        }


        // mutableLiveData 방식
//        viewModel.testMutableLiveData.observe(this,  {
//           // findViewById<TextView>(R.id.textArea).text = viewModel.testMutableLiveData.value.toString()
//            findViewById<TextView>(R.id.textArea).text = it.toString()
//        })

        // LiveData 방식
        // viewModel.testLiveData.value = 10 // LiveData 이기때문에 값 접근 불가 -> 비즈니스 로직을 뷰모델에게 철저히 분리
        viewModel.testLiveData.observe(this, {
            findViewById<TextView>(R.id.textArea).text = it.toString()
        })



    }
}