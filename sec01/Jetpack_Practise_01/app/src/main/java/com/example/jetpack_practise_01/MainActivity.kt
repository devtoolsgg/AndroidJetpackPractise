package com.example.jetpack_practise_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.jetpack_practise_01.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)


        // 기존 뷰의 선언 방식 1 : findViewbyId
        // 문제점 :
        // 버튼이 여러개 생기면 발생하는 코드의 양
//        val btn1: Button = findViewById(R.id.btn_1)
//        val btn2: Button = findViewById(R.id.btn_1)
//        val btn3: Button = findViewById(R.id.btn_1)
//
//        btn1.text = "버튼1"
//        btn2.text = "버튼2"
//        btn3.text = "버튼3"


        // 기존 뷰의 선언 방식 2 :kotlin extensions
        // 문제점 :
        // 리사이클러뷰에 성능이슈가 있다
        // 구글에서 권장하지 않는 방식
        // 잘못된 선언시 nullpoint 에러
//        btn_1.text = "버튼1"
//        btn_2.text = "버튼2"
//        btn_3.text = "버튼3"

        // 구글에서는 두가지 방식을 권장한다
        // Viewbinding , Databinding


        // Viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)
        binding.tvTitle.text = "i am viewbinding"
        binding.tvTitle.setOnClickListener{

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)


        }







    }
}