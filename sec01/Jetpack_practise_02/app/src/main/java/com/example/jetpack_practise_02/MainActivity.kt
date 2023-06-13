package com.example.jetpack_practise_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.jetpack_practise_02.databinding.ActivityMainBinding

// DataBinding
// ViewBinding 과 다른점 ?
// : 데이터를 연결해주는 역할을 한다. (데이터와 결합해서 사용할 수 있다)
// Databinding + LiveData 로 많이 쓴다
// 이 파트에서는 Databinding만 알아보자

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.dataBindingEx.text = "바뀐텍스트~"
        binding.dataBindingEx.setOnClickListener{

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)

        }

       // setContentView(R.layout.activity_main)
    }
}