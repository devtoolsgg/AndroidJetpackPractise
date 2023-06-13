package com.example.jetpack_practise_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {


    val manage = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)



        var transaction = manage.beginTransaction()
        val fragment = TestFragment()

        transaction.replace(R.id.frameArea,fragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }








}