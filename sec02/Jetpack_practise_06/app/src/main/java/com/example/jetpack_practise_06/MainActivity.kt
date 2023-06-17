package com.example.jetpack_practise_06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // activity - fragment 간 상태유지처리 (권장 x)
        
        //if(savedInstanceState == null){
            val transaction = manager.beginTransaction()
            val fragment = TestFragment()
            transaction.replace(R.id.fl_main,fragment)
            transaction.addToBackStack(null)
            transaction.commit()
       // }



    }
}